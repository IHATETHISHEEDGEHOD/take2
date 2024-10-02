package cardDefs;

/**
 * Same as Card6 but construct in accord with design by contract rather than
 * defensive programming.strategy.
 * A card that can be used in a deck of standard cards.
 *
 * @author Martin P. Robillard 2017 modified by dmrho 2024
 */
public class Card7 {

    /**
     * A card's rank.
     */
    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }

    /**
     * A card's suit.
     */
    public enum Suit {
        CLUBS, DIAMONDS, SPADES, HEARTS
    }

    public static final String[] RANKS = {"Ace", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    public static final String[] SUITS = {"Clubs", "Diamonds", "Spades", "Hearts"};

    private Rank aRank; // Invariant: != null
    private Suit aSuit; // Invariant: != null

    /**
     * <i>Note specification of pre-condition.</i>
     * @param pRank The index of the rank in RANKS
     * @param pSuit The index of the suit in SUITS
     * pre-condition pRank != null and pSuit != null
     */
    public Card7(Rank pRank, Suit pSuit) {
        // New notion of assertion.
        //Note no exception is thrown
        assert pRank != null && pSuit != null;
        aRank = pRank;
        aSuit = pSuit;
    }

    /**
     * @return The index in RANKS corresponding to the rank of the card.
     * post-condition return != null
     */
    public Rank getRank() {
        return aRank;
    }

    /**
     * @return The index in SUITS corresponding to the suit of the card.
     * post-condition return != null
     */
    public Suit getSuit() {
        return aSuit;
    }

    /**
     * Assigns a new rank to the card.
     *
     * @param pRank The new rank.
     * pre-condition pRank != null
     */
    public void setRank(Rank pRank) {
        aRank = pRank;
    }

    /**
     * Assigns a new suit to the card.
     *
     * @param pSuit The new suit.
     * pre-condition pSuit != null
     */
    public void setSuit(Suit pSuit) {
        aSuit = pSuit;
    }

    @Override
    public String toString() {
        return aRank + " of " + aSuit;
    }
}
