/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardDefs;

/**
 * This version improves encapsulation by constraining the values for ranks and
 * suits to instances of an enumerated type. So the internal representation
 * changes but the client does not know. The way that this is done makes the
 * class backward compatible for the client. It is assumed that in the actual
 * use the class would be named <pre>Card</pre> in all cases.The interface will
 * remain the same and the implementations will change
 * A card that can be used in a deck of standard cards.
 *
 * @author Martin P. Robillard 2017 modified by dmrho 2024
 */
public class Card5 {

    /**
     * A card's rank as an enumerated type.
     */
    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }

    /**
     * A card's suit s an enumerated type.
     */
    public enum Suit {
        CLUBS, DIAMONDS, SPADES, HEARTS
    }

    //Fpr previous way
    public static final String[] RANKS = {"Ace", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

     //Fpr previous way
    public static final String[] SUITS = {"Clubs", "Diamonds", "Spades", "Hearts"};

    private Rank aRank; // Note the difference not an int; different name
    private Suit aSuit; // Note the difference not an int; different name 

    /**
     * <i>The interface is not changed from Card3.</i>
     * @param pRank The index of the rank in RANKS
     * @param pSuit The index of the suit in SUITS
     */
    public Card5(int pRank, int pSuit) {
        // the implementation is changed.
        aRank = Rank.values()[pRank];
        aSuit = Suit.values()[pSuit];
    }

    /**
     * <i>The interface is not changed from Card3.</i>
     * @return The index in RANKS corresponding to the rank of the card.
     */
    public int getRank() {
        // the implementation is changed.
        return aRank.ordinal();
    }

    /**
     * <i>The interface is not changed from Card3.</i>
     * @return The index in SUITS corresponding to the suit of the card.
     */
    public int getSuit() {
        // the implementation is changed.
        return aSuit.ordinal();
    }

    /**
     * <i>The interface is not changed from Card3.</i>
     * Assigns a new rank to the card.
     *
     * @param pRank The new rank.
     */
    public void setRank(int pRank) {
        // the implementation is changed.
        aRank = Rank.values()[pRank];
    }

    /**
     * <i>The interface is not changed from Card3.</i>
     * Assigns a new suit to the card.
     *
     * @param pSuit The new suit.
     */
    public void setSuit(int pSuit) {
        // the implementation is changed.
        aSuit = Suit.values()[pSuit];
    }

    @Override
    public String toString() {
        // the implementation is changed.
        return aRank + " of " + aSuit;
    }
}
