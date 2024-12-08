package bangwoo.practice5.cardProgram;

public class Card {
    private int number;
    private String suit;

    public Card(int number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return suit + "의 " + number;
    }
}
