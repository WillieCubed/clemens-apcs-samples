package com.thecraftkid.apcs;

import com.thecraftkid.apcs.chalmersw14.ChalmersCard;
import com.thecraftkid.apcs.chalmersw14.Deck;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class chalmersw21 {

    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame(new InputCallback() {

            @Override
            public int onBetRequest() {
                return getNumberInput("Your bet?");
            }

            @Override
            public Move onMove() {
                return requestMove();
            }

            /**
             * Keeps requesting input until a valid input is inputted.
             *
             * @return A valid, non-null {@link Move}
             */
            private Move requestMove() {
                String input = getStringInput("Your move? (Hit or stand)");
                Move move;
                try {
                    move = Move.valueOf(input);
                } catch (Exception e) {
                    System.out.println(input + " is not a valid move");
                    move = requestMove();
                }
                return move;
            }

        });
        game.setDisplayCallback(new DisplayCallback() {

            @Override
            public void onDisplayPlayerCards(ChalmersCard... cards) {
                System.out.printf("Your cards are %s, %s", cards[0], cards[1]);
            }

            @Override
            public void onDisplayDealerCards(ChalmersCard... cards) {

            }

            @Override
            public void onPlayerPullCard(ChalmersCard card) {
                System.out.printf("You pulled a %s\n", card);
            }

            @Override
            public void onDealerPullCard(ChalmersCard card) {

            }

            @Override
            public void onBust(int lastValue, int bustValue) {
                System.out.printf("You busted at %s\n", bustValue);
                System.out.printf("You should have stopped at %s\n", lastValue);
            }
        });
        game.start();
    }

    /**
     * Requests the user to enter a number.
     *
     * @param prompt Text to display to the user before requesting input
     */
    public static int getNumberInput(String prompt) {
        System.out.println(prompt);
        int result;
        try {
            result = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            result = getNumberInput(prompt);
        }
        return result;
    }

    /**
     * Requests the user to enter a String.
     *
     * @param prompt Text to display to the user before requesting input
     * @return A non-null String
     */
    public static String getStringInput(String prompt) {
        System.out.println(prompt);
        String result;
        try {
            result = new Scanner(System.in).next();
        } catch (Exception e) {
            result = getStringInput(prompt);
        }
        return result;
    }

    public static class BlackjackGame {

        private static final int STARTING_AMOUNT = 100;

        private int funds = STARTING_AMOUNT;

        private InputCallback callback;

        private DisplayCallback displayCallback;

        private Deck deck = new Deck();

        public BlackjackGame(InputCallback callback) {
            this.callback = callback;
            this.deck.fill();
        }

        public void setDisplayCallback(DisplayCallback callback) {
            this.displayCallback = callback;
        }

        /**
         * Begins playing this game.
         * <p>
         * Starts the game loop by requesting for a starting funds amount and
         * then showing the user his/her cards.
         */
        public void start() {
            int bet = callback.onBetRequest();
            while (bet > 0 && bet < funds) {
                bet = callback.onBetRequest();
                ChalmersCard[] dealerCards = new ChalmersCard[2]; // Don't show these
                dealerCards[0] = deck.pullCard();
                dealerCards[1] = deck.pullCard();
                ChalmersCard[] playerCards = new ChalmersCard[2];
                playerCards[0] = deck.pullCard();
                playerCards[1] = deck.pullCard();
                BetResult result = startBetting(playerCards);
                if (result.isBusted()) {
                    if (displayCallback != null) {
                        displayCallback.onBust(result.getLastGoodValue(), result.getBustedValue());
                    }
                }
                BetResult dealerResult = startDealerRound(dealerCards);
                displayCallback.onDisplayDealerCards();
            }
        }

        /**
         * Begins the standard blackjack loop of asking the user to hit or stand.
         *
         * @param playerCards Length <= 2
         * @return True if the player busted
         */
        private BetResult startBetting(ChalmersCard... playerCards) {
            List<ChalmersCard> cards = Arrays.stream(playerCards).collect(Collectors.toList());
            displayCallback.onDisplayPlayerCards(playerCards);
            Move nextMove = callback.onMove();
            int total = cards.get(0).getValue() + cards.get(1).getValue();
            int lastValue = 0;
            int bustedValue = BetResult.NOT_BUSTED;
            while (total < 21) {
                lastValue = total;
                if (nextMove == Move.HIT) {
                    ChalmersCard newCard = deck.pullCard();
                    displayCallback.onPlayerPullCard(newCard);
                    bustedValue = (lastValue += newCard.getValue());
                } else {
                    return new BetResult(false, lastValue, bustedValue);
                }
            }
            return new BetResult(true, lastValue, bustedValue);
        }

        private BetResult startDealerRound(ChalmersCard... dealerCards) {
            List<ChalmersCard> cards = Arrays.stream(dealerCards).collect(Collectors.toList());
            displayCallback.onDisplayDealerCards(dealerCards);
            int lastValue = cards.get(0).getValue() + cards.get(1).getValue();
            int bustedValue = BetResult.NOT_BUSTED;
            while (lastValue <= 17) {
                lastValue += deck.pullCard().getValue();
                if (lastValue > 21) {
                    bustedValue = lastValue;
                }
            }
            boolean isBusted = bustedValue != BetResult.NOT_BUSTED;
            return new BetResult(isBusted, lastValue, bustedValue);
        }

        /**
         * A container for betting results.
         *
         * @see DisplayCallback#onBust(int, int)
         */
        private static class BetResult {

            public static final int NOT_BUSTED = -1;

            private final boolean busted;

            private final int lastGoodValue;

            private final int bustedValue;

            private BetResult(boolean busted, int lastGoodValue, int bustedValue) {
                this.busted = busted;
                this.lastGoodValue = lastGoodValue;
                this.bustedValue = bustedValue;
            }

            public boolean isBusted() {
                return busted;
            }

            public int getLastGoodValue() {
                return lastGoodValue;
            }

            /**
             * @return -1 if the player did not bust
             */
            public int getBustedValue() {
                return bustedValue;
            }
        }
    }

    /**
     * A required callback used to request values important to the game.
     */
    public interface InputCallback {

        /**
         * Requests a user's input for the amount of dollars to bet.
         *
         * @return The amount of dollars the player has bet for the next turn
         */
        int onBetRequest();

        /**
         * Requests a user's selection for the next turn in blackjack.
         *
         * @return An always non-null {@link Move}
         */
        Move onMove();
    }

    /**
     * An optional callback notified on user-relevant game state changes.
     */
    public interface DisplayCallback {

        /**
         * Prints the player's cards to standard output.
         *
         * @param cards The player's current cards.
         */
        void onDisplayPlayerCards(ChalmersCard... cards);

        /**
         * Prints the dealer's cards to standard output.
         *
         * @param cards The dealer's current cards
         */
        void onDisplayDealerCards(ChalmersCard... cards);

        /**
         * Prints the given card to standard output.
         *
         * @param card A card most recently pulled by the user
         */
        void onPlayerPullCard(ChalmersCard card);

        /**
         * Prints the given card to standard output.
         *
         * @param card A card most recently pulled by the user
         */
        void onDealerPullCard(ChalmersCard card);

        /**
         * Notifies this callback that the player has passed total card value
         * of 21.
         *
         * @param lastValue The amount of dollars the player had before
         *                  he/she busted
         * @param bustValue The amount of dollars the player had after they
         *                  he/she busted
         */
        void onBust(int lastValue, int bustValue);
    }

    /**
     * A set of turn types that a player can make during the game of blackjack.
     */
    public enum Move {

        /**
         * The player wants to receive another {@link ChalmersCard}.
         */
        HIT,

        /**
         * The player is satisfied with his/her cards.
         */
        STAND;
    }
}