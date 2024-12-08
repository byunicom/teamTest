package bangwoo.practice5.cardProgram;

public class CardGameMain {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Game game = new Game("김씨", "박씨");

        deck.setCards();
        deck.shuffle();

        game.start();
    }
}
