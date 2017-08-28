package oopdesign.card;

/**
 * Created by rakshitpithadia on 8/26/17.
 */
public class Card {

    private Suit suit;
    private Rank rank;
    private boolean isFaceUp;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        isFaceUp = false;
    }

    public String getSuit() {
        return suit.printSuit();
    }

    public int getRank() {
        return rank.getRank();
    }

    public void flipCard() {
        isFaceUp = !isFaceUp;
    }

    @Override
    public String toString() {

        if (isFaceUp) {
            return rank.printRank() + " of " + suit.printSuit();
        } else {
            return "Card is Facing Down";
        }
    }
}
