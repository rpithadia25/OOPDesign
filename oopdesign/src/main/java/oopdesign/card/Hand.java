package oopdesign.card;

import java.util.ArrayList;

/**
 * Created by rakshitpithadia on 8/27/17.
 */
public class Hand {

    ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<Card>();
    }

    public void clear() {
        cards.clear();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public String showHand() {

        // Show cards and total points, but only show total points if all cards face up
        StringBuffer sb = new StringBuffer();
        boolean allFaceUp = true;

        for (Card card : cards) {
            sb.append(card.toString() + "\n");
            if (!card.isFaceUp) {
                allFaceUp = false;
            }
        }

        if (allFaceUp) {
            sb.append("Total Points = " + getTotal() + "\n");
        }

        return sb.toString();
    }

    public void flipCards() {
        for (Card card : cards) {
            card.flipCard();
        }
    }

    public boolean give(Card card, Hand otherHand) {
        if (!cards.contains(card)) {
            return false;
        } else {
            cards.remove(card);
            otherHand.add(card);

            return true;
        }
    }

    public int getTotal() {
        int totalPts  = 0;
        boolean hasAce = false;

        for (int i = 0; i < cards.size(); i++) {
            totalPts += cards.get(i).getRank();

            if (cards.get(i).printRank() == "Ace") {
                hasAce = true;
            }

            if (hasAce && totalPts <= 11) {
                totalPts += 10; // Add 10 more points
            }
        }

        return totalPts;
    }
}
