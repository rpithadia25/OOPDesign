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

    public void deal(Hand[] hands, int perHand) {
        for (int i = 0; i < perHand; i++ ) {
            for (int j = 0; j < hands.length; j++) {
                this.give(cards.get(0), hands[j]);
            }
        }
    }

    public void deal(Hand hand, int perHand) {
        for (int i = 0; i < perHand; i++ ) {
            this.give(cards.get(0), hand);
        }
    }

    public void flipCard(Card card) {
        card.flipCard();
    }
}
