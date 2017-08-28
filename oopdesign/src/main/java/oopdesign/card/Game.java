package oopdesign.card;

/**
 * Created by rakshitpithadia on 8/27/17.
 */
public class Game {

    public static void main(String[] args) {

        Card c1, c2;

        c1 = new Card(Rank.ACE, Suit.HEARTS);
        c2 = new Card(Rank.JACK, Suit.HEARTS);

        // Flip Cards
        c1.flipCard();
        c2.flipCard();

        // Create a hand
        Hand h1 = new Hand();
        Hand h2 = new Hand();

        h1.add(c1);
        h1.add(c2);

        System.out.println(h1.showHand());

        h1.give(c1, h2);

        System.out.println("Hand 1 is: " + h1.showHand());
        System.out.println("Hand 2 is: " + h2.showHand());

        // Create a Deck
        Deck d1 = new Deck();
        d1.populate();
        System.out.println("Deck has the following cards: " + d1.showHand());
    }
}
