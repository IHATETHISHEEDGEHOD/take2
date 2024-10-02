package cardDefs;

/**
 * Builds on Card1 by hiding the decision about the internal representation of a
 * card. class is an attempt to apply the principle of information hiding. 
 * 
 * A card that can be used in a deck of standard cards.
 *
 * @author Martin P. Robillard 2017 modified by dmrho 2024
 */
public class Card2 {

    // Might there be a better name for this field or state?
    private int aId = 0; // the default value of an int is 0

    /**
     * <i>A better name might be needed here. Also note the use of magic
     * numbers.</i>
     *
     * @param pCardId [0,52] inclusive
     */
    public Card2(int pCardId) {
        aId = pCardId;
    }

    /**
     * <i>Note the use of magic numbers.</i>
     *
     * @return [0,52] the id of the card
     */
    public int getId() {
        return aId;
    }

    /**
     * <i>Note the use of magic numbers.</i>
     *
     * @param pId [0,52] the id of the card
     */
    public void setId(int pId) {
        aId = pId;
    }
}
