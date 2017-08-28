package oopdesign.card;

/**
 * Created by rakshitpithadia on 8/27/17.
 */
public class Game {

    /**
     *  BlackJack Game:
     *  FOR each player,
     *      deal 2 cards
     *      flip all the cards
     *  FOR each player
     *      WHILE player asks for HIT AND player is not busted
     *          DEAL player another card
     *  IF there are no players still playing
     *      Show dealer's cards
     *  ELSE
     *      WHILE dealer must HIT AND dealer is not busted
     *          DEAL dealer additional card
     *  IF dealer is busted
     *      FOR each player whi is still playing
     *          THE player wins
     *  ELSE
     *      FOR each player who is still playing
     *          IF player's total > dealer's total
     *              The player wins
     *          ELSE IF the player's total < dealer's total
     *              The player loses
     */

    public static void main(String[] args) {

        // Create a Deck
        Deck d1 = new Deck();
        d1.populate();
        d1.shuffle();

        // Create playing hands
        Hand h1, h2, h3, dealer;
        h1 = new Hand();
        h2 = new Hand();
        h3 = new Hand();
        dealer = new Hand();
        Hand[] hands = {h1, h2, h3};

        // Deal cards to hands
        d1.deal(hands, 2);

        // Deal 2 cards to dealer
        d1.deal(dealer, 2);

        // Show player's hands
        for (int i = 0; i < hands.length; i++) {
            hands[i].flipCards();
            System.out.println(hands[i].showHand());
        }

        // Flip the dealer's first card
        dealer.cards.get(0).flipCard();

        // Show the dealer's cards
        System.out.println("\nDealer's Cards: \n" + dealer.showHand());
    }
}
