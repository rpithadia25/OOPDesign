package oopdesign.card;

import java.util.Random;

/**
 * Created by rakshitpithadia on 8/27/17.
 */
public class Deck extends Hand {

    private Random random = new Random();

    public void populate() {

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(rank, suit);
                card.flipCard();
                this.add(card);
            }
        }
    }

    public void shuffle() {
        for (int i = cards.size() - 1; i > 0; i--) {

            // Swap a random card between the first and the last card.
            int pick = random.nextInt(i);
            Card lastCard = cards.get(i);
            cards.set(i, cards.get(pick));
            cards.set(pick, lastCard);
        }
    }
}
