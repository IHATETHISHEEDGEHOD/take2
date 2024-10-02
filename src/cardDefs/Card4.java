package cardDefs;

/**
 * Demonstrates the benefits of information hiding. We change the internal
 * representation of a card from Card3 but the class's interface remains the
 * same and client does not have to change. <i>Was the notion of the internal
 * representation ever explained in this documentation?</i>
 * A card that can be used in a deck of standard cards.
 *
 * @author Martin P. Robillard 2017 modified by dmrho 2024
 */
public class Card4 {

    public static final String[] RANKS = {"Ace", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    public static final String[] SUITS = {"Clubs", "Diamonds", "Spades", "Hearts"};

    private int aRank = 0;
    private int aSuit = 0;

    /**
     * <i>The interface is not changed from Card3.</i>
     *
     * @param pRank The index of the rank in RANKS
     * @param pSuit The index of the suit in SUITS
     */
    public Card4(int pRank, int pSuit) {
        // the implementation is changed.
        aRank = pRank;
        aSuit = pSuit;
    }

    /**
     * <i>The interface is not changed from Card3.</i>
     *
     * @return The index in RANKS corresponding to the rank of the card.
     */
    public int getRank() {
        // the implementation is changed.
        return aRank;
    }

    /**
     * <i>The interface is not changed from Card3.</i>
     *
     * @return The index in SUITS corresponding to the suit of the card.
     */
    public int getSuit() {
        // the implementation is changed.
        return aSuit;
    }

    /**
     * Assigns a new rank to the card. <i>The interface is not changed from
     * Card3.</i>
     *
     * @param pRank The new rank.
     */
    public void setRank(int pRank) {
        // the implementation is changed.
        aRank = pRank;
    }

    /**
     * Assigns a new suit to the card. <i>The interface is not changed from
     * Card3.</i>
     *
     * @param pSuit The new suit.
     */
    public void setSuit(int pSuit) {
        // the implementation is changed.
        aSuit = pSuit;
    }

    @Override
    public String toString() {
        // the implementation is changed.
        return RANKS[getRank()] + " of " + SUITS[getSuit()];
    }
}
