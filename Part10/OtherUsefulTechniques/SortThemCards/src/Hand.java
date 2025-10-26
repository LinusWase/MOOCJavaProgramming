import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card){
        this.cards.add(card);
    }

    public void print(){
        for (Card c : cards) {
            String value = String.valueOf(c.getValue());
            if (c.getValue() == 11) {
                value = "J";
            } else if (c.getValue() == 12) {
                value = "Q";
            } else if (c.getValue() == 13) {
                value = "K";
            } else if (c.getValue() == 14) {
                value = "A";
            }
            System.out.println(c.getSuit() + " " + value);
        }
    }

    public void sort() {
        this.cards.sort(Card::compareTo);
    }

    @Override
    public int compareTo(Hand other) {
        int thisSum = this.cards.stream().mapToInt(Card::getValue).sum();
        int otherSum = other.cards.stream().mapToInt(Card::getValue).sum();
        return Integer.compare(thisSum, otherSum);
    }

    public void sortBySuit(){
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
