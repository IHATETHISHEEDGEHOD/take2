package cardcodedesign;

// New notion for import
import cardDefs.Card7.Rank;
import cardDefs.Card7.Suit;

import cardDefs.Card7;

/**
 * An exercise of the card domain concept with the
 * <pre>Card7</pre> implementation.
 *
 * @author Martin P. Robillard 2017 modified by dmrho 2024
 */
public class CardCodeDesign {

    /**
     * This client class is a stand-in for any client code. This version is
     * adapted to work with Card7
     *
     * @param pArgs Not used here
     */
    public static void main(String[] pArgs) {
        // new for each syntax
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                System.out.println(new Card7(rank, suit));
            }
        }
    }
}
