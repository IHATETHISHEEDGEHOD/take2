package cardDefs;

/**
 * Builds on Card2 by improved hiding of decision about the internal
 * representation of a card, and allows access to the card's representation
 * using domain concepts rather than the internal representation. A better
 * example of information hiding. A card that can be used in a deck of standard
 * cards.
 *
 * @author Martin P. Robillard 2017 modified by dmrho 2024
 */
public class Card3 {
    // An effort to specify rank constants.

    public static final String[] RANKS = {"Ace", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    // An effort to specify suit constants.
    public static final String[] SUITS = {"Clubs", "Diamonds", "Spades", "Hearts"};

    private int aId = 0;

    /**
     * <i> This would be a place to explain the intent of the definition. Should
     * the formal parameters be tested to see whether they correspond to the
     * domain concept?</i>
     *
     * @param pRank The index of the rank in RANKS
     * @param pSuit The index of the suit in SUITS
     */
    public Card3(int pRank, int pSuit) {
        aId = pSuit * RANKS.length + pRank;
    }

    /**
     * <i>Note that the method does not return the rank.</i>
     *
     * @return The index in RANKS corresponding to the rank of the card.
     */
    public int getRank() {
        return aId % RANKS.length;
    }

    /**
     * * <i>Note that the method does not return the suit.</i>
     *
     * @return The index in SUITS corresponding to the suit of the card.
     */
    public int getSuit() {
        return aId / RANKS.length;
    }

    /**
     * Assigns a new rank to the card.<i>Perhaps the intention of the
     * calculation of the calculation should be documented?</i>
     *
     * @param pRank The new rank. <i>It is an int not the rank as a string that
     * is passed in.</i>
     */
    public void setRank(int pRank) {
        aId = getSuit() * RANKS.length + pRank;
    }

    /**
     * Assigns a new suit to the card. <i>Perhaps the intention of the
     * calculation of the calculation should be documented?</i>
     *
     * @param pSuit The new suit. <i>It is an int not the suit as a string that
     * is passed in.</i>
     */
    public void setSuit(int pSuit) {
        aId = pSuit * RANKS.length + getRank();
    }

    /**
     * Construct a reasonable string that describes the card.
     *
     * @return a string representation of the card
     */
    // New concept follows
    @Override
    public String toString() {
        return RANKS[getRank()] + " of " + SUITS[getSuit()];
    }
}
