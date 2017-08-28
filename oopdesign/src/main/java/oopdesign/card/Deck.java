package oopdesign.card;

/**
 * Created by rakshitpithadia on 8/27/17.
 */
public class Deck extends Hand {

    public void populate() {

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(rank, suit);
                card.flipCard();
                this.add(card);
            }
        }
    }
}
