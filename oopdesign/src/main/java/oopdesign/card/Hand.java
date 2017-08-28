package oopdesign.card;

import java.util.ArrayList;

/**
 * Created by rakshitpithadia on 8/27/17.
 */
public class Hand {

    private ArrayList<Card> cards;

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

        StringBuffer sb = new StringBuffer();

        for (Card card :
                cards) {
            sb.append(card.toString() + "\n");
        }

        return sb.toString();
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
}
