package com.thecraftkid.apcs.given;

import java.util.ArrayList;

public class LabHelper {
    private String[] courseList = lab25Course();

    public LabHelper() {
    }

//    public static Student[][] getArray19() {
//        int r = (int)(Math.random() * 4.0D + 2.0D);
//        int c = (int)(Math.random() * 4.0D + 2.0D);
//        Student[][] arr = new Student[r][c];
//        return arr;
//    }
//
//    public static Student[][] getArray20() {
//        Student[][] arr = getArray19();
//
//        for(int r = 0; r < arr.length; ++r) {
//            for(int c = 0; c < arr[0].length; ++c) {
//                Student temp = new Student();
//                if (temp.avg() >= 65) {
//                    arr[r][c] = temp;
//                }
//            }
//        }
//
//        return arr;
//    }

    public static int[] lab12() {
        int[] array = new int[20];

        for (int a = 0; a < array.length; ++a) {
            array[a] = (int) (Math.random() * 98.0D + 1.0D);
        }

        return array;
    }

    public static String lab22() {
        ArrayList<String> list = new ArrayList<>();
        list.add("This is a secret message");
        list.add("This is not a secret message");
        list.add("The condor flies at midnight");
        list.add("The eagle has landed");
        list.add("Mine is in the repair shop");
        list.add("That is not the code word");
        list.add("A warped barrel is a fool's frustration");
        list.add("Drink more ovaltine");
        list.add("The field mouse is fast, the owl sees at night");
        list.add("Water the marigolds");
        list.add("Supercalifragilisticexpialidocious");
        list.add("The forests of Timber sure have changed");
        list.add("Could I borrow a match");
        list.add("The red fox trots quietly at midnight");
        int rnd = (int) (Math.random() * (double) list.size());
        return list.get(rnd);
    }

    public static String[] lab23() {
        String[] words = new String[]{"ABBE", "ABEL", "ABET", "ABLE", "ABLY", "ABUT", "ACED", "ACES", "ACHE", "ACHY", "ACID", "ACME", "ACNE", "ACRE", "ACTS", "ADAM", "ADDS", "ADEN", "ADIT", "ADZE", "AEON", "AFAR", "AFRO", "AGAR", "AGED", "AGES", "AGIO", "AGOG", "AGUE", "AHEM", "AHOY", "AIDE", "AIDS", "AILS", "AIMS", "AINT", "AIRE", "AIRS", "AIRY", "AJAR", "AKIN", "ALAS", "ALES", "ALGA", "ALLY", "ALMS", "ALOE", "ALPS", "ALSO", "ALTO", "ALTS", "ALUM", "AMEN", "AMID", "AMIR", "AMMO", "AMOK", "AMPS", "ANAL", "ANEW", "ANIL", "ANNA", "ANON", "ANTE", "ANTI", "ANTS", "ANUS", "APED", "APES", "APEX", "APIS", "APSE", "AQUA", "ARAB", "ARAK", "ARCH", "ARCS", "AREA", "ARIA", "ARID", "ARKS", "ARMS", "ARMY", "ARTS", "ARTY", "ARUM", "ASHY", "ASIA", "ASKS", "ASPS", "ATOM", "ATOP", "AUKS", "AUNT", "AURA", "AUTO", "AVER", "AVID", "AVOW", "AWAY", "AWED", "AWLS", "AWOL", "AWRY", "AXED", "AXES", "AXIS", "AXLE", "AXON", "BAAL", "BABE", "BABY", "BACH", "BACK", "BADE", "BAGS", "BAIL", "BAIT", "BAKE", "BALD", "BALE", "BALI", "BALL", "BALM", "BAND", "BANE", "BANG", "BANK", "BANS", "BARB", "BARD", "BARE", "BARK", "BARN", "BARS", "BART", "BASE", "BASH", "BASK", "BASS", "BATE", "BATH", "BATS", "BAUD", "BAWL", "BAYS", "BEAD", "BEAK", "BEAM", "BEAN", "BEAR", "BEAT", "BEAU", "BECK", "BEDS", "BEEF", "BEEN", "BEEP", "BEER", "BEES", "BEET", "BEGS", "BELL", "BELT", "BEND", "BENT", "BERK", "BERN", "BEST", "BETA", "BETS", "BEVY", "BIAS", "BIBS", "BIDE", "BIDS", "BIER", "BIKE", "BILE", "BILL", "BIND", "BING", "BINS", "BIRD", "BITE", "BITS", "BLAB", "BLAH", "BLAT", "BLED", "BLEW", "BLIP", "BLOB", "BLOC", "BLOT", "BLOW", "BLUE", "BLUR", "BMUS", "BOAR", "BOAS", "BOAT", "BOBS", "BODE", "BODY", "BOER", "BOGS", "BOGY", "BOIL", "BOLA", "BOLD", "BOLE", "BOLT", "BOMB", "BOND", "BONE", "BONG", "BONN", "BONY", "BOOK", "BOOM", "BOON", "BOOR", "BOOS", "BOOT", "BOPS", "BORE", "BORN", "BOSS", "BOTH", "BOUT", "BOWL", "BOWS", "BOXY", "BOYS", "BRAG", "BRAN", "BRAS", "BRAT", "BRAW", "BRAY", "BRED", "BREW", "BRIG", "BRIM", "BRIO", "BRIT", "BROW", "BUCK", "BUDS", "BUFF", "BUGS", "BULB", "BULK", "BULL", "BUMP", "BUMS", "BUNG", "BUNK", "BUNS", "BUOY", "BURG", "BURN", "BURP", "BURR", "BURS", "BURY", "BUSH", "BUSK", "BUST", "BUSY", "BUTS", "BUTT", "BUYS", "BUZZ", "BYES", "BYTE", "CABS", "CADE", "CADS", "CAFE", "CAGE", "CAGY", "CAIN", "CAKE", "CALF", "CALL", "CALM", "CAME", "CAMP", "CAMS", "CANE", "CANS", "CANT", "CAPE", "CAPS", "CARD", "CARE", "CARP", "CARS", "CART", "CASE", "CASH", "CASK", "CAST", "CATS", "CAVE", "CEDE", "CELL", "CENT", "CESS", "CHAD", "CHAP", "CHAR", "CHAT", "CHEF", "CHEW", "CHIC", "CHIN", "CHIP", "CHIT", "CHOP", "CHOW", "CHUG", "CHUM", "CINE", "CIST", "CITE", "CITY", "CLAD", "CLAM", "CLAN", "CLAP", "CLAW", "CLAY", "CLEF", "CLEG", "CLIP", "CLOD", "CLOG", "CLOT", "CLUB", "CLUE", "COAL", "COAT", "COAX", "COBS", "COCA", "COCK", "CODA", "CODE", "CODS", "COGS", "COIL", "COIN", "COKE", "COLA", "COLD", "COLE", "COLS", "COLT", "COMA", "COMB", "COME", "CONE", "CONK", "CONS", "CONY", "COOK", "COOL", "COON", "COOP", "COOS", "COPE", "COPS", "COPY", "CORD", "CORE", "CORK", "CORN", "COST", "COSY", "COTS", "COUP", "COVE", "COWL", "COWS", "CRAB", "CRAG", "CRAM", "CRAN", "CRAP", "CREW", "CRIB", "CRIM", "CROP", "CROW", "CRUX", "CUBA", "CUBE", "CUBS", "CUDS", "CUED", "CUES", "CUFF", "CULL", "CULT", "CUPS", "CURB", "CURD", "CURE", "CURL", "CURS", "CURT", "CUSP", "CUSS", "CUTE", "CUTS", "CYAN", "CYST", "CZAR", "DABS", "DACE", "DADO", "DADS", "DAFT", "DAIS", "DALE", "DAME", "DAMN", "DAMP", "DAMS", "DANE", "DANK", "DARE", "DARK", "DARN", "DART", "DASH", "DATA", "DATE", "DAUB", "DAWN", "DAYS", "DAZE", "DDAY", "DEAD", "DEAF", "DEAL", "DEAN", "DEAR", "DEBT", "DECK", "DECO", "DEED", "DEEM", "DEEP", "DEER", "DEFT", "DEFY", "DELI", "DELL", "DEMO", "DENS", "DENT", "DENY", "DESK", "DEWS", "DEWY", "DHOW", "DIAL", "DICE", "DIED", "DIES", "DIET", "DIGS", "DILL", "DIME", "DIMS", "DINE", "DING", "DINT", "DIPS", "DIRE", "DIRT", "DISC", "DISH", "DIVA", "DIVE", "DOCK", "DOCS", "DODO", "DOER", "DOES", "DOGE", "DOGS", "DOGY", "DOHS", "DOLE", "DOLL", "DOLT", "DOME", "DONE", "DONG", "DONS", "DONT", "DOOM", "DOOR", "DOPE", "DOPY", "DOSE", "DOTE", "DOTS", "DOUR", "DOVE", "DOWN", "DOZE", "DOZY", "DRAB", "DRAG", "DRAM", "DRAT", "DRAW", "DRAY", "DREW", "DRIP", "DROP", "DRUB", "DRUG", "DRUM", "DUAL", "DUBS", "DUCE", "DUCK", "DUCT", "DUDE", "DUDS", "DUEL", "DUES", "DUET", "DUFF", "DUKE", "DULL", "DULY", "DUMB", "DUMP", "DUNE", "DUNG", "DUPE", "DUSK", "DUST", "DUTY", "DYAD", "DYED", "DYER", "DYES", "DYKE", "DYNE", "EACH", "EARL", "EARN", "EARS", "EASE", "EAST", "EASY", "EATS", "EBBS", "ECHO", "EDDY", "EDEN", "EDGE", "EDGY", "EDIT", "EELS", "EERY", "EGGS", "EIRE", "EKED", "ELAL", "ELAN", "ELBE", "ELKS", "ELLS", "ELMS", "ELSE", "EMIR", "EMIT", "EMUS", "ENDS", "ENVY", "EONS", "EPIC", "ERAS", "ERGO", "ERGS", "EROS", "ERRS", "ERST", "ESAU", "ESPY", "ETAL", "ETCH", "ETNA", "ETUI", "EURO", "EVEN", "EVER", "EVES", "EVIL", "EWES", "EXAM", "EXES", "EXIT", "EXPO", "EYED", "EYES", "FACE", "FACT", "FADE", "FADS", "FAGS", "FAIL", "FAIR", "FAKE", "FALL", "FAME", "FANG", "FANS", "FARE", "FARM", "FAST", "FATE", "FATS", "FAUN", "FAWN", "FEAR", "FEAT", "FEDS", "FEED", "FEEL", "FEES", "FEET", "FELL", "FELT", "FEND", "FENS", "FERN", "FEST", "FETE", "FEUD", "FIAT", "FIBS", "FIEF", "FIFE", "FIGS", "FIJI", "FILE", "FILL", "FILM", "FIND", "FINE", "FINN", "FINS", "FIRE", "FIRM", "FIRS", "FISH", "FIST", "FITS", "FIVE", "FIZZ", "FLAB", "FLAG", "FLAK", "FLAN", "FLAP", "FLAT", "FLAW", "FLAX", "FLAY", "FLEA", "FLED", "FLEE", "FLEW", "FLEX", "FLIP", "FLIT", "FLOE", "FLOG", "FLOP", "FLOW", "FLUB", "FLUE", "FLUX", "FOAL", "FOAM", "FOBS", "FOCI", "FOES", "FOGS", "FOGY", "FOIL", "FOLD", "FOLK", "FOND", "FONT", "FOOD", "FOOL", "FOOT", "FOPS", "FORD", "FORE", "FORK", "FORM", "FORT", "FOUL", "FOUR", "FOWL", "FOXY", "FRAY", "FREE", "FRET", "FROG", "FROM", "FUEL", "FULL", "FUME", "FUND", "FUNK", "FURS", "FURY", "FUSE", "FUSS", "FUZZ", "GAFF", "GAGA", "GAGE", "GAGS", "GAIN", "GAIT", "GALA", "GALE", "GALL", "GALS", "GAME", "GAMY", "GANG", "GAOL", "GAPE", "GAPS", "GARB", "GASH", "GASP", "GATE", "GAUD", "GAUL", "GAVE", "GAWK", "GAYS", "GAZE", "GEAR", "GEEK", "GELS", "GEMS", "GENE", "GENT", "GERM", "GETS", "GIFT", "GILL", "GILT", "GINS", "GIRD", "GIRL", "GIRO", "GIRT", "GIST", "GIVE", "GLAD", "GLEE", "GLEN", "GLIA", "GLIB", "GLIM", "GLOB", "GLOW", "GLUE", "GLUM", "GLUT", "GNAT", "GNAW", "GNUS", "GOAD", "GOAL", "GOAT", "GOBI", "GODS", "GOER", "GOES", "GOLD", "GOLF", "GONE", "GONG", "GOOD", "GOOF", "GOON", "GORE", "GORY", "GOSH", "GOTH", "GOUT", "GOWN", "GRAB", "GRAM", "GREW", "GREY", "GRID", "GRIM", "GRIN", "GRIP", "GRIT", "GROG", "GROW", "GRUB", "GULF", "GULL", "GULP", "GUMS", "GUNK", "GUNS", "GURU", "GUSH", "GUST", "GUTS", "GUYS", "GYMS", "GYRO", "HACK", "HAFT", "HAGS", "HAHA", "HAIL", "HAIR", "HAKE", "HALE", "HALF", "HALL", "HALO", "HALT", "HAMS", "HAND", "HANG", "HARD", "HARE", "HARK", "HARM", "HARP", "HART", "HASH", "HASP", "HATE", "HATS", "HAUL", "HAVE", "HAWK", "HAZE", "HAZY", "HEAD", "HEAL", "HEAP", "HEAR", "HEAT", "HECK", "HEED", "HEEL", "HEFT", "HEIR", "HELD", "HELL", "HELM", "HELP", "HEMP", "HEMS", "HENS", "HERB", "HERD", "HERE", "HERM", "HERO", "HERS", "HEWN", "HIDE", "HIGH", "HIKE", "HILL", "HILT", "HIND", "HINT", "HIPS", "HIRE", "HISS", "HITS", "HIVE", "HOAR", "HOAX", "HOBO", "HOBS", "HOCK", "HOED", "HOES", "HOGG", "HOGS", "HOLD", "HOLE", "HOLY", "HOME", "HOMY", "HONE", "HONK", "HOOD", "HOOF", "HOOK", "HOOP", "HOOT", "HOPE", "HOPS", "HORN", "HOSE", "HOST", "HOUR", "HOVE", "HOWL", "HUBS", "HUES", "HUFF", "HUGE", "HUGS", "HULK", "HULL", "HUMP", "HUMS", "HUNG", "HUNK", "HUNT", "HURL", "HURT", "HUSH", "HUSK", "HUTS", "HYMN", "HYPE", "IBEX", "IBIS", "ICED", "ICES", "ICON", "IDEA", "IDEM", "IDES", "IDLE", "IDLY", "IDOL", "IGLU", "ILLS", "IMAM", "IMPI", "IMPS", "INCA", "INCH", "INFO", "INKS", "INKY", "INNS", "INTO", "IONS", "IOTA", "IRAN", "IRAQ", "IRIS", "IRKS", "IRON", "ISIS", "ISLE", "ISMS", "ISNT", "ITCH", "ITEM", "ITLL", "JABS", "JACK", "JADE", "JAIL", "JAMB", "JAMS", "JAPE", "JARL", "JARS", "JAVA", "JAWS", "JAYS", "JAZZ", "JEEP", "JEER", "JELL", "JERK", "JEST", "JETS", "JEWS", "JIGS", "JILT", "JINX", "JIVE", "JOBS", "JOCK", "JOEY", "JOGS", "JOHN", "JOIN", "JOKE", "JOLT", "JOTS", "JOWL", "JOYS", "JUDO", "JUGS", "JULY", "JUMP", "JUNE", "JUNK", "JUNO", "JURY", "JUST", "JUTE", "JUTS", "KALE", "KEEL", "KEEN", "KEEP", "KEGS", "KELP", "KELT", "KENT", "KEPT", "KERB", "KEYS", "KHAN", "KICK", "KIDS", "KIEV", "KILL", "KILN", "KILO", "KILT", "KINA", "KIND", "KING", "KINK", "KIRK", "KISS", "KITE", "KITH", "KITS", "KIWI", "KNEE", "KNEW", "KNIT", "KNOB", "KNOT", "KNOW", "KUDU", "LABS", "LACE", "LACK", "LACS", "LACY", "LADE", "LADS", "LADY", "LAGS", "LAID", "LAIN", "LAIR", "LAKE", "LAMA", "LAMB", "LAME", "LAMP", "LAND", "LANE", "LANK", "LAOS", "LAPP", "LAPS", "LARD", "LARK", "LASE", "LASH", "LASS", "LAST", "LATE", "LATH", "LAUD", "LAVA", "LAWN", "LAWS", "LAYS", "LAZE", "LAZY", "LEAD", "LEAF", "LEAK", "LEAN", "LEAP", "LEAT", "LEEK", "LEER", "LEES", "LEFT", "LEGS", "LEND", "LENS", "LENT", "LESS", "LEST", "LETS", "LEVI", "LEVY", "LEWD", "LIAR", "LICE", "LICK", "LIDO", "LIDS", "LIED", "LIEN", "LIES", "LIEU", "LIFE", "LIFT", "LIKE", "LILT", "LILY", "LIMA", "LIMB", "LIME", "LIMO", "LIMP", "LINE", "LINK", "LINO", "LINT", "LINY", "LION", "LIPS", "LIRA", "LIRE", "LISP", "LIST", "LIVE", "LOAD", "LOAF", "LOAM", "LOAN", "LOBE", "LOBS", "LOCH", "LOCI", "LOCK", "LOCO", "LODE", "LOFT", "LOGO", "LOGS", "LOIN", "LOLL", "LONE", "LONG", "LOOK", "LOOM", "LOON", "LOOP", "LOOT", "LOPE", "LORD", "LORE", "LOSE", "LOSS", "LOST", "LOTH", "LOTS", "LOUD", "LOUT", "LOVE", "LOWS", "LUCK", "LUDO", "LUGS", "LUKE", "LULL", "LULU", "LUMP", "LUNA", "LUNE", "LUNG", "LURE", "LURK", "LUSH", "LUST", "LUTE", "LYNX", "LYON", "LYRA", "LYRE", "MACE", "MADE", "MAGI", "MAGS", "MAID", "MAIL", "MAIM", "MAIN", "MAKE", "MALE", "MALL", "MALT", "MAMA", "MANE", "MANY", "MAPS", "MARA", "MARE", "MARK", "MARL", "MARS", "MART", "MARX", "MARY", "MASH", "MASK", "MASS", "MAST", "MATE", "MATH", "MATS", "MATT", "MAUL", "MAXI", "MAYA", "MAZE", "MAZY", "MEAD", "MEAL", "MEAN", "MEAT", "MEEK", "MEET", "MEGA", "MELD", "MELT", "MEMO", "MEND", "MENU", "MEOW", "MERE", "MESH", "MESS", "MEWS", "MICA", "MICE", "MIDI", "MIEN", "MIKE", "MILD", "MILE", "MILK", "MILL", "MILT", "MIME", "MIND", "MINE", "MINI", "MINK", "MINT", "MINX", "MIRE", "MISS", "MIST", "MITE", "MITT", "MOAN", "MOAS", "MOAT", "MOBS", "MOCK", "MODE", "MOLD", "MOLE", "MOMS", "MONK", "MONO", "MOOD", "MOON", "MOOR", "MOOS", "MOOT", "MOPE", "MOPS", "MORE", "MORN", "MORT", "MOSS", "MOST", "MOTH", "MOVE", "MOWN", "MOWS", "MUCH", "MUCK", "MUDS", "MUFF", "MUGS", "MULE", "MULL", "MUMS", "MURK", "MUSE", "MUSH", "MUSK", "MUST", "MUTE", "MUTT", "MYNA", "MYTH", "NABS", "NAGS", "NAIL", "NAME", "NAPE", "NAPS", "NATO", "NAVE", "NAVY", "NAZI", "NEAR", "NEAT", "NECK", "NEED", "NEON", "NERD", "NEST", "NETS", "NETT", "NEWS", "NEWT", "NEXT", "NIBS", "NICE", "NICK", "NIGH", "NILE", "NILS", "NINE", "NIPS", "NITS", "NOAH", "NODE", "NODS", "NOEL", "NONE", "NOOK", "NOON", "NORM", "NOSE", "NOSY", "NOTE", "NOUN", "NUDE", "NUKE", "NULL", "NUMB", "NUNS", "NUTS", "OAFS", "OAKS", "OARS", "OAST", "OATH", "OATS", "OBEY", "OBOE", "ODDS", "ODES", "ODIN", "OGLE", "OGRE", "OHIO", "OHMS", "OILS", "OILY", "OINK", "OKAY", "OLMS", "OMEN", "OMIT", "ONCE", "ONER", "ONES", "ONLY", "ONTO", "ONUS", "ONYX", "OOPS", "OOZE", "OOZY", "OPAL", "OPEN", "OPTS", "OPUS", "ORAL", "ORBS", "ORCA", "ORES", "ORGY", "OSLO", "OUCH", "OURS", "OUST", "OUTS", "OVAL", "OVEN", "OVER", "OVUM", "OWED", "OWES", "OWLS", "OWNS", "OXEN", "PACE", "PACK", "PACT", "PADS", "PAGE", "PAID", "PAIL", "PAIN", "PAIR", "PALE", "PALL", "PALM", "PALP", "PALS", "PANE", "PANG", "PANS", "PANT", "PAPA", "PARE", "PARK", "PART", "PASS", "PAST", "PATE", "PATH", "PATS", "PAUL", "PAVE", "PAWN", "PAWS", "PAYS", "PEAK", "PEAL", "PEAR", "PEAS", "PEAT", "PECK", "PEEK", "PEEL", "PEEP", "PEER", "PEGS", "PELE", "PELT", "PENS", "PENT", "PEPS", "PERI", "PERK", "PERM", "PERT", "PERU", "PEST", "PETS", "PEWS", "PHEW", "PICA", "PICK", "PIED", "PIER", "PIES", "PIGS", "PIKE", "PILE", "PILL", "PIMP", "PINE", "PING", "PINK", "PINS", "PINT", "PINY", "PION", "PIPE", "PIPS", "PISA", "PITH", "PITS", "PITY", "PLAN", "PLAY", "PLEA", "PLEB", "PLOD", "PLOP", "PLOT", "PLOY", "PLUG", "PLUM", "PLUS", "POCK", "PODS", "POEM", "POET", "POGO", "POKE", "POKY", "POLE", "POLL", "POLO", "POMP", "POND", "PONY", "POOF", "POOH", "POOL", "POOP", "POOR", "POPE", "POPS", "PORE", "PORK", "PORN", "PORT", "POSE", "POSH", "POST", "POSY", "POTS", "POUR", "POUT", "PRAM", "PRAT", "PRAY", "PREP", "PREY", "PRIG", "PRIM", "PROD", "PROP", "PROS", "PROW", "PUBS", "PUFF", "PUGS", "PUKE", "PULL", "PULP", "PUMA", "PUMP", "PUNK", "PUNS", "PUNT", "PUNY", "PUPA", "PUPS", "PURE", "PURL", "PURR", "PUSH", "PUSS", "PUTS", "PUTT", "PYRE", "QUAY", "QUID", "QUIP", "QUIT", "QUIZ", "RACE", "RACK", "RACY", "RAFT", "RAGE", "RAGS", "RAID", "RAIL", "RAIN", "RAKE", "RAMP", "RAMS", "RAND", "RANG", "RANI", "RANK", "RANT", "RAPE", "RAPS", "RAPT", "RARE", "RASH", "RASP", "RATE", "RATS", "RAVE", "RAYS", "RAZE", "READ", "REAL", "REAM", "REAP", "REAR", "REDO", "REDS", "REED", "REEF", "REEK", "REEL", "REFS", "REIN", "RELY", "RENT", "REPS", "REST", "REVS", "RHEA", "RIAL", "RIBS", "RICE", "RICH", "RICK", "RIDE", "RIDS", "RIFE", "RIFF", "RIFT", "RIGS", "RILE", "RILL", "RIME", "RIMS", "RIND", "RING", "RINK", "RIOT", "RIPE", "RIPS", "RISE", "RISK", "RITE", "ROAD", "ROAM", "ROAN", "ROAR", "ROBE", "ROBS", "ROCK", "ROCS", "RODE", "RODS", "ROES", "ROLE", "ROLL", "ROME", "ROMP", "ROOF", "ROOK", "ROOM", "ROOT", "ROPE", "ROSE", "ROSY", "ROTA", "ROTE", "ROTS", "ROUT", "ROVE", "ROWS", "RUBS", "RUBY", "RUCK", "RUDE", "RUES", "RUFF", "RUGS", "RUIN", "RULE", "RUMP", "RUNE", "RUNG", "RUNS", "RUNT", "RUSE", "RUSH", "RUSK", "RUST", "RUTH", "RUTS", "SACK", "SACS", "SAFE", "SAGA", "SAGE", "SAGO", "SAGS", "SAID", "SAIL", "SAKE", "SAKI", "SALE", "SALT", "SAME", "SAND", "SANE", "SANG", "SANK", "SAPS", "SARI", "SASH", "SAVE", "SAWN", "SAWS", "SAYS", "SCAB", "SCAM", "SCAN", "SCAR", "SCAT", "SCOT", "SCUD", "SCUM", "SEAL", "SEAM", "SEAR", "SEAS", "SEAT", "SECT", "SEED", "SEEK", "SEEM", "SEEN", "SEEP", "SEER", "SEES", "SELF", "SELL", "SEMI", "SEND", "SENT", "SERF", "SETH", "SETS", "SEWN", "SEWS", "SEXY", "SHAG", "SHAH", "SHAM", "SHAW", "SHED", "SHIN", "SHIP", "SHOD", "SHOE", "SHOO", "SHOP", "SHOT", "SHOW", "SHUN", "SHUT", "SIAM", "SICK", "SIDE", "SIFT", "SIGH", "SIGN", "SILK", "SILO", "SILT", "SINE", "SING", "SINK", "SINS", "SIPS", "SIRE", "SIRS", "SITE", "SITS", "SIZE", "SKEW", "SKID", "SKIM", "SKIN", "SKIP", "SKIS", "SKIT", "SKUA", "SLAB", "SLAG", "SLAM", "SLAP", "SLAT", "SLAV", "SLAY", "SLED", "SLEW", "SLID", "SLIM", "SLIP", "SLIT", "SLOB", "SLOG", "SLOP", "SLOT", "SLOW", "SLUG", "SLUM", "SLUR", "SMOG", "SMUG", "SMUT", "SNAG", "SNAP", "SNIP", "SNOB", "SNOW", "SNUB", "SNUG", "SOAK", "SOAP", "SOAR", "SOBS", "SOCK", "SODA", "SODS", "SOFA", "SOFT", "SOIL", "SOLD", "SOLE", "SOLO", "SOMA", "SOME", "SONG", "SONS", "SOON", "SOOT", "SORE", "SORT", "SOSO", "SOUK", "SOUL", "SOUP", "SOUR", "SOWN", "SOWS", "SOYA", "SPAM", "SPAN", "SPAR", "SPAS", "SPAT", "SPAY", "SPEC", "SPED", "SPEW", "SPIN", "SPIT", "SPOT", "SPRY", "SPUD", "SPUN", "SPUR", "STAB", "STAG", "STAR", "STAY", "STEM", "STEP", "STET", "STEW", "STIR", "STOA", "STOP", "STOW", "STUB", "STUD", "STUN", "STYX", "SUBS", "SUCH", "SUCK", "SUDS", "SUED", "SUES", "SUET", "SUIT", "SULK", "SUMO", "SUMP", "SUMS", "SUNG", "SUNK", "SUNS", "SUPS", "SURD", "SURE", "SURF", "SWAB", "SWAD", "SWAG", "SWAM", "SWAN", "SWAP", "SWAT", "SWAY", "SWIM", "SWOP", "SWOT", "SWUM", "SYNC", "TAAL", "TABS", "TACK", "TACT", "TAGS", "TAHR", "TAIL", "TAKE", "TALC", "TALE", "TALK", "TALL", "TAME", "TAMP", "TANG", "TANK", "TANS", "TAPE", "TAPS", "TARN", "TARS", "TART", "TASK", "TAUT", "TAXI", "TEAK", "TEAL", "TEAM", "TEAR", "TEAS", "TEAT", "TECH", "TEDS", "TEED", "TEEM", "TEEN", "TEES", "TELL", "TEND", "TENS", "TENT", "TERM", "TERN", "TEST", "TEXT", "THAI", "THAN", "THAT", "THAW", "THEE", "THEM", "THEN", "THEY", "THIN", "THIS", "THOR", "THOU", "THUD", "THUG", "THUS", "TICK", "TICS", "TIDE", "TIDY", "TIED", "TIER", "TIES", "TILE", "TILL", "TILT", "TIME", "TINS", "TINT", "TINY", "TIPS", "TIRE", "TIRO", "TITS", "TOAD", "TOBY", "TOED", "TOES", "TOFU", "TOGA", "TOGO", "TOGS", "TOIL", "TOLD", "TOLL", "TOMB", "TOME", "TONE", "TONS", "TONY", "TOOK", "TOOL", "TOOT", "TOPS", "TORE", "TORI", "TORN", "TORY", "TOSS", "TOTS", "TOUR", "TOUT", "TOWN", "TOWS", "TOYS", "TRAD", "TRAM", "TRAP", "TRAY", "TREE", "TREK", "TRIM", "TRIO", "TRIP", "TROD", "TROT", "TROY", "TRUE", "TUBA", "TUBE", "TUBS", "TUCK", "TUES", "TUFT", "TUGS", "TUNA", "TUNE", "TUNS", "TURF", "TURK", "TURN", "TUSK", "TUTU", "TWEE", "TWIG", "TWIN", "TWIT", "TYKE", "TYPE", "TYRE", "UGLY", "UHUH", "UNDO", "UNIT", "UNTO", "UPON", "UREA", "URGE", "URNS", "USED", "USER", "USES", "UTAH", "VAIN", "VALE", "VAMP", "VANE", "VANS", "VARY", "VASE", "VAST", "VATS", "VEAL", "VEER", "VEIL", "VEIN", "VELD", "VEND", "VENT", "VERB", "VERY", "VEST", "VETO", "VETS", "VIAL", "VICE", "VIED", "VIER", "VIES", "VIEW", "VILE", "VIMS", "VINE", "VINO", "VIOL", "VISA", "VISE", "VIVA", "VOID", "VOLE", "VOLT", "VOTE", "VOWS", "WADE", "WADI", "WADS", "WAFT", "WAGE", "WAGS", "WAIF", "WAIL", "WAIT", "WAKE", "WALK", "WALL", "WAND", "WANE", "WANT", "WARD", "WARE", "WARM", "WARN", "WARP", "WARS", "WART", "WARY", "WASH", "WASP", "WAST", "WATT", "WAVE", "WAVY", "WAXY", "WAYS", "WEAK", "WEAL", "WEAN", "WEAR", "WEBS", "WEDS", "WEED", "WEEK", "WEEN", "WEEP", "WEIR", "WELD", "WELL", "WELT", "WEND", "WENT", "WEPT", "WERE", "WEST", "WETS", "WHAM", "WHAP", "WHAT", "WHEE", "WHEN", "WHET", "WHEY", "WHIM", "WHIP", "WHIR", "WHOA", "WHOM", "WHOP", "WHYS", "WICK", "WIDE", "WIFE", "WIGS", "WILD", "WILE", "WILL", "WILT", "WILY", "WIMP", "WIND", "WINE", "WING", "WINK", "WINS", "WIPE", "WIRE", "WIRY", "WISE", "WISH", "WISP", "WITH", "WITS", "WOAD", "WOES", "WOKE", "WOKS", "WOLD", "WOLF", "WOMB", "WONT", "WOOD", "WOOF", "WOOL", "WOOS", "WORD", "WORE", "WORK", "WORM", "WORN", "WOVE", "WOWS", "WRAP", "WREN", "WRIT", "XMAS", "XRAY", "YAKS", "YALE", "YAMS", "YANK", "YAPS", "YARD", "YARN", "YAWL", "YAWN", "YAWS", "YEAH", "YEAR", "YEAS", "YELL", "YELP", "YENS", "YETI", "YEWS", "YOGA", "YOGI", "YOKE", "YOLK", "YORE", "YORK", "YOUR", "YOWL", "YOYO", "YUCK", "YULE", "ZANY", "ZAPS", "ZEAL", "ZEBU", "ZEES", "ZERO", "ZEST", "ZETA", "ZEUS", "ZINC", "ZION", "ZIPS", "ZONE", "ZOOM", "ZOOS", "ZULU"};
        int numberOfWords = (int) (Math.random() * 25.0D + 5.0D);
        String[] listOfWords = new String[numberOfWords];

        for (int a = 0; a < numberOfWords; ++a) {
            int rnd = (int) (Math.random() * (double) words.length);
            listOfWords[a] = words[rnd];
        }

        return listOfWords;
    }

    public static String lab23(String[] list) {
        int rnd = (int) (Math.random() * (double) list.length);
        return list[rnd];
    }

    public static Integer[] lab24() {
        int rnd = (int) (Math.random() * 40.0D + 5.0D);
        Integer[] arr = new Integer[rnd];

        int a;
        for (a = 0; a < arr.length; ++a) {
            arr[a] = (int) (Math.random() * 100.0D);
        }

        rnd = (int) (Math.random() * 10.0D);

        for (a = 0; a < rnd; ++a) {
            arr[(int) (Math.random() * (double) arr.length)] = 0;
        }

        rnd = (int) (Math.random() * 10.0D);

        for (a = 0; a < rnd; ++a) {
            arr[(int) (Math.random() * (double) arr.length)] = null;
        }

        return arr;
    }

    public static ArrayList<String> lab25Wait() {
        ArrayList<String> ret = new ArrayList<>();
        int rnd = (int) (Math.random() * 10.0D);

        for (int a = 0; a < rnd; ++a) {
            ret.add(getName25());
        }

        return ret;
    }

    public static String getName25() {
        String[] firstGirl = new String[]{"Abigail", "Alexandra", "Alison", "Amanda", "Amelia", "Amy", "Andrea", "Angela", "Anna", "Anne", "Audrey", "Ava", "Bella", "Bernadette", "Carol", "Caroline", "Carolyn", "Chloe", "Claire", "Deirdre", "Diana", "Diane", "Donna", "Dorothy", "Elizabeth", "Ella", "Emily", "Emma", "Faith", "Felicity", "Fiona", "Gabrielle", "Grace", "Hannah", "Heather", "Irene", "Jan", "Jane", "Jasmine", "Jennifer", "Jessica", "Joan", "Joanne", "Julia", "Karen", "Katherine", "Kimberly", "Kylie", "Lauren", "Leah", "Lillian", "Lily", "Lisa", "Madeleine", "Maria", "Mary", "Megan", "Melanie", "Michelle", "Molly", "Natalie", "Nicola", "Olivia", "Penelope", "Pippa", "Rachel", "Rebecca", "Rose", "Ruth", "Sally", "Samantha", "Sarah", "Sonia", "Sophie", "Stephanie", "Sue", "Theresa", "Tracey", "Una", "Vanessa", "Victoria", "Virginia", "Wanda", "Wendy", "Yvonne", "Zoe"};
        String[] firstBoy = new String[]{"Adam", "Adrian", "Alan", "Alexander", "Andrew", "Anthony", "Austin", "Benjamin", "Blake", "Boris", "Brandon", "Brian", "Cameron", "Carl", "Charles", "Christian", "Christopher", "Colin", "Connor", "Dan", "David", "Dominic", "Dylan", "Edward", "Eric", "Evan", "Frank", "Gavin", "Gordon", "Harry", "Ian", "Isaac", "Jack", "Jacob", "Jake", "James", "Jason", "Joe", "John", "Jonathan", "Joseph", "Joshua", "Julian", "Justin", "Keith", "Kevin", "Leonard", "Liam", "Lucas", "Luke", "Matt", "Max", "Michael", "Nathan", "Neil", "Nicholas", "Oliver", "Owen", "Paul", "Peter", "Phil", "Piers", "Richard", "Robert", "Ryan", "Sam", "Sean", "Sebastian", "Simon", "Stephen", "Steven", "Stewart", "Thomas", "Tim", "Trevor", "Victor", "Warren", "William"};
        String[] last = new String[]{"Abraham", "Allan", "Alsop", "Anderson", "Arnold", "Avery", "Bailey", "Baker", "Ball", "Bell", "Berry", "Black", "Blake", "Bond", "Bower", "Brown", "Buckland", "Burgess", "Butler", "Cameron", "Campbell", "Carr", "Chapman", "Churchill", "Clark", "Clarkson", "Coleman", "Cornish", "Davidson", "Davies", "Dickens", "Dowd", "Duncan", "Dyer", "Edmunds", "Ellison", "Ferguson", "Fisher", "Forsyth", "Fraser", "Gibson", "Gill", "Glover", "Graham", "Grant", "Gray", "Greene", "Hamilton", "Hardacre", "Harris", "Hart", "Hemmings", "Henderson", "Hill", "Hodges", "Howard", "Hudson", "Hughes", "Hunter", "Ince", "Jackson", "James", "Johnston", "Jones", "Kelly", "Kerr", "King", "Knox", "Lambert", "Langdon", "Lawrence", "Lee", "Lewis", "Lyman", "MacDonald", "Mackay", "Mackenzie", "MacLeod", "Manning", "Marshall", "Martin", "Mathis", "May", "McDonald", "McLean", "McGrath", "Metcalfe", "Miller", "Mills", "Mitchell", "Morgan", "Morrison", "Murray", "Nash", "Newman", "Nolan", "North", "Ogden", "Oliver", "Paige", "Parr", "Parsons", "Paterson", "Payne", "Peake", "Peters", "Piper", "Poole", "Powell", "Pullman", "Quinn", "Rampling", "Randall", "Rees", "Reid", "Roberts", "Robertson", "Ross", "Russell", "Rutherford", "Sanderson", "Scott", "Sharp", "Short", "Simpson", "Skinner", "Slater", "Smith", "Springer", "Stewart", "Sutherland", "Taylor", "Terry", "Thomson", "Tucker", "Turner", "Underwood", "Vance", "Vaughan", "Walker", "Wallace", "Walsh", "Watson", "Welch", "White", "Wilkins", "Wilson", "Wright", "Young"};
        String name = "";
        int rnd = (int) (Math.random() * 2.0D);
        if (rnd == 0) {
            rnd = (int) (Math.random() * (double) firstGirl.length);
            name = name + firstGirl[rnd];
        } else {
            rnd = (int) (Math.random() * (double) firstBoy.length);
            name = name + firstBoy[rnd];
        }

        rnd = (int) (Math.random() * (double) last.length);
        name = name + " " + last[rnd];
        return name;
    }

    public static String[] lab25Course() {
        String[] ret = new String[30];

        for (int a = 0; a < 30; ++a) {
            ret[a] = getName25();
        }

        return ret;
    }

//    public static employee[] lab27() {
//        employee[] ret = new employee[(int)(Math.random() * 5.0D + 5.0D)];
//
//        for(int a = 0; a < ret.length; ++a) {
//            ArrayList<Integer> minutes = new ArrayList<>();
//            ArrayList<Integer> hours = new ArrayList<>();
//            int rnd = (int)(Math.random() * 5.0D + 2.0D);
//
//            for(int b = 0; b < rnd; ++b) {
//                minutes.add((int)(Math.random() * 60.0D));
//                hours.add((int)(Math.random() * 4.0D));
//            }
//
//            double wage = (double)((int)(Math.random() * 1000.0D)) / 100.0D + 7.25D;
//            ret[a] = new employee((int)(Math.random() * 1000.0D + 1000.0D), wage, minutes, hours);
//        }
//
//        return ret;
//    }
}
