package oopdesign.card;

/**
 * Created by rakshitpithadia on 8/26/17.
 */
public enum Suit {
    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    private final String suitText;

    Suit(String suitText) {
        this.suitText = suitText;
    }

    public String printSuit() {
        return suitText;
    }

}
