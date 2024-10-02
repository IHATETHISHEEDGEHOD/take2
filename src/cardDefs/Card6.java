package cardDefs;

/**
 * This version of the implementation of the
 * <pre>Card</pre> Domain concept breaks the client. It forces the client to
 * change code. The major benefit is the strengthening the class interface. This
 * version implements the "defensive programming" approach to defend against
 * null values. A card that can be used in a deck of standard cards.
 *
 * @author Martin P. Robillard 2017 modified by dmrho 2024
 */
public class Card6 {

    /**
     * A card's rank as an enumerated type
     */
    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }

    /**
     * A card's suit as an enumerated type
     */
    public enum Suit {
        CLUBS, DIAMONDS, SPADES, HEARTS
    }

    // The arrays of strings for names.
    public static final String[] RANKS = {"Ace", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    public static final String[] SUITS = {"Clubs", "Diamonds", "Spades", "Hearts"};

    //San=me as Card4
    private Rank aRank;
    private Suit aSuit;

    /**
     * The parameters are the instances of the enumerations and nnot integers.
     * This would break the previous code for , say
     * <pre>Card4</pre>
     *
     * @param pRank The index of the rank in RANKS
     * @param pSuit The index of the suit in SUITS
     */
    public Card6(Rank pRank, Suit pSuit) {
        // New notion of throwin an exception
        if (pRank == null || pSuit == null) {
            throw new IllegalArgumentException();
        }
        aRank = pRank;
        aSuit = pSuit;
    }

    /**
     * <i>Return type breaks previous, say Card4, code.</i>
     * @return The index in RANKS corresponding to the rank of the card.
     */
    public Rank getRank() {
        return aRank;
    }

    /**
     * <i>Return type breaks previous, say Card4, code.</i>
     * @return The index in SUITS corresponding to the suit of the card.
     */
    public Suit getSuit() {
        return aSuit;
    }

    /**
     * <i>Parameter type breaks previous, say Card4, code.</i>
     * Assigns a new rank to the card.
     *
     * @param pRank The new rank.
     */
    public void setRank(Rank pRank) {
        aRank = pRank;
    }

    /**
     * <i>Parameter type breaks previous, say Card4, code.</i>
     * Assigns a new suit to the card.
     *
     * @param pSuit The new suit.
     */
    public void setSuit(Suit pSuit) {
        aSuit = pSuit;
    }

    @Override
    public String toString() {
        return aRank + " of " + aSuit;
    }
}
