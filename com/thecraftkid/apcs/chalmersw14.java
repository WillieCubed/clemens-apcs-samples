package com.thecraftkid.apcs;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import static java.lang.System.out;

/**
 * @author Willie Chalmers III
 * @since 11/9/17
 */
public class chalmersw14 {

    public static void main(String[] args) {
        CardFlowManager.getInstance(new Deck()).start();
    }

    /**
     * A class that simulates two players playing a card game.
     */
    public static class CardPlayer {

        private Deck playerOneDeck = new Deck();
        private Deck playerTwoDeck = new Deck();

        private CardPlayer() {
        }

        /**
         * <a href="http://en.wikipedia.org/wiki/War_(card_game)">War</a>
         */
        public static void startWarGame() {
            CardPlayer player = new CardPlayer();
            player.playWar();
        }

        private void playWar() {
            while (playerOneDeck.size() > 0 && playerTwoDeck.size() > 0) {

            }
        }

        private void playCard(String player, ChalmersCard card) {
            System.out.printf("%s has played %s", player, card);
        }
    }

    /**
     * A program component that allows the user to fill a deck of cards, delete
     * all cards from the deck, display all cards in the deck, pull card and
     * remove it from the deck, shuffle the deck, sort the deck by value, and
     * play a game of war using the cards in the deck.
     *
     * @see CardPlayer
     * @see ChalmersCard
     */
    public static class CardFlowManager {

        private static CardFlowManager INSTANCE;

        private static final int EXIT = 0;
        private static final int FILL_DECK = 1;
        private static final int DELETE_CARDS = 2;
        private static final int DISPLAY_CARDS = 3;
        private static final int PULL_CARD = 4;
        private static final int SHUFFLE_DECK = 5;
        private static final int SORT_DECK = 6;
        private static final int PLAY_WAR = 10;

        private final Deck deck;

        public CardFlowManager(Deck deck) {
            this.deck = deck;
        }

        /**
         * Returns the current instance of the CardFlowManager if it exists;
         * otherwise, it returns a new one with the {@link Deck} provided.
         */
        public static CardFlowManager getInstance(Deck deck) {
            if (INSTANCE == null) {
                INSTANCE = new CardFlowManager(deck);
            }
            return INSTANCE;
        }

        /**
         * Begins a loop that doesn't end until the user chooses the exit option.
         */
        public void start() {
            int input;
            while ((input = getInput("Choose an option: ")) != EXIT) {
                switch (input) {
                    case FILL_DECK:
                        launchFillDeckFlow();
                        break;
                    case DELETE_CARDS:
                        launchDeleteCardsFlow();
                        break;
                    case DISPLAY_CARDS:
                        launchDisplayCardsFlow();
                        break;
                    case PULL_CARD:
                        launchPullCardFlow();
                        break;
                    case SHUFFLE_DECK:
                        launchShuffleDeckFlow();
                        break;
                    case SORT_DECK:
                        launchSortDeckFlow();
                        break;
                    case PLAY_WAR:
                        launchPlayWarFlow();
                        break;
                }
            }
        }

        public int getInput(String prompt) {
            out.println(prompt);
            return new Scanner(System.in).nextInt();
        }

        public void launchFillDeckFlow() {
            out.println("Filling deck with valid card combinations...");
            deck.fill();
            System.out.println(deck);
            out.println("Done.");
        }

        public void launchDeleteCardsFlow() {
            out.println("Deleting all cards in deck...");
            for (int i = 0; i < deck.size(); i++) {
                deck.remove(i);
            }
        }

        public void launchDisplayCardsFlow() {
            out.println("These are all the cards in the deck: ");
            out.println(deck);
        }

        public void launchPullCardFlow() {
            ChalmersCard card = deck.pullCard();
            out.printf("Your card is %s", card);
            out.println();
        }

        public void launchShuffleDeckFlow() {
            out.println("Shuffling cards...");
            deck.shuffle();
            out.println("Deck is now shuffled.");
        }

        public void launchSortDeckFlow() {
            out.println("Sorting deck:");
            deck.getSortedDeck().forEach(out::println);
            out.println("Deck is now sorted.");
        }

        public void launchPlayWarFlow() {
            CardPlayer.startWarGame();
        }
    }

    public static class Deck extends ArrayList<ChalmersCard> {

        /**
         * Fills this deck with all valid card combinations.
         */
        public void fill() {
//            cards.replaceAll(chalmersCard -> new ChalmersCard());
//            for (int value : ChalmersCard.POSSIBLE_VALUES) {
//
//            }
            return;
        }

        public void fill(int amount) {

        }

        /**
         * Places each of the cards in this deck into a new random position.
         */
        public void shuffle() {
            Collections.shuffle(this); // Can't I just do this?
//            List<ChalmersCard> copy = new ArrayList<>();
//            Collections.copy(copy, this);
//            List<Integer> randoms = generateRandomPositions();
//            randoms.forEach(random -> {
//
//            });
        }

        private List<Integer> generateRandomPositions() {
            List<Integer> randoms = new ArrayList<>();
            while (randoms.size() <= 52) {
                int nextRandom = ThreadLocalRandom.current().nextInt(0, 52 + 1);
                if (randoms.get(nextRandom) == -1) {
                    randoms.add(nextRandom);
                }
            }
            return randoms;
        }

        public ChalmersCard pullCard() {
            int cardIndex = ThreadLocalRandom.current().nextInt(0, size() - 1);
            return get(cardIndex);
        }

        /**
         * Returns a sorted copy of this deck.
         */
        public List<ChalmersCard> getSortedDeck() {
            return stream()
                    .sorted(Comparator.naturalOrder()) // Use the ChalmersCard#compareTo(ChalmersCard)
                    .collect(Collectors.toList());
        }

        @Override
        public int size() {
            return 0;
        }

        /**
         * Returns {@link ChalmersCard#toString()} for each in this deck.
         */
        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static class ChalmersCard implements Comparable<ChalmersCard> {

        /**
         * Jack, queen, and king are worth 10.
         */
        private static final List<Integer> POSSIBLE_VALUES = Collections.unmodifiableList(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        /**
         * Consist of A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
         */
        private static final List<String> POSSIBLE_FACES = Collections.unmodifiableList(
                Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));

        /**
         * Consist of ace, club, heart, diamond, respectively
         */
        private static final List<String> POSSIBLE_SUITS = Collections.unmodifiableList(
                Arrays.asList("\3", "\4", "\5", "\6"));

        private final int value;
        private final String face;
        private final String suit;

        public ChalmersCard(int value, String face, String suit) {
            if (POSSIBLE_VALUES.stream().noneMatch(integer -> (value != integer))) {
                throw new IllegalArgumentException("Value " + value + " is not valid");
            }
            if (POSSIBLE_FACES.stream().noneMatch(string -> string.equals(face))) {
                throw new IllegalArgumentException("Value " + value + " is not valid");
            }
            if (POSSIBLE_SUITS.stream().noneMatch(string -> string.equals(suit))) {
                throw new IllegalArgumentException("Value " + value + " is not valid");
            }
            this.value = value;
            this.face = face;
            this.suit = suit;
        }

        /**
         * Returns the face and suit of the card. Example: A♦
         */
        public String getName() {
            return face + suit;
        }

        /**
         * Compares the face and suit of the given card to this one for sorting.
         *
         * @return -1 if the given card should be sorted before this card, 0 if
         * the given card is equal to this card, or 1 if the given card should
         * be sorted after this card.
         */
        @Override
        public int compareTo(ChalmersCard card) {
            final int GREATER = 1;
            final int LESSER = -1;
            final int EQUAL = 0;

            // Check for suits
            if (card.suit.compareTo(suit) > 0) {
                return GREATER;
            } else if (card.suit.compareTo(suit) < 0) {
                return LESSER;
            }

            // Check for values
            if (card.value > value) {
                return GREATER;
            } else if (card.value < value) {
                return LESSER;
            }
            return EQUAL;
        }

        @Override
        public String toString() {
            return getName() + "value: " + this.value;
        }
    }
}
