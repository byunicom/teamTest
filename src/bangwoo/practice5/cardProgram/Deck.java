package bangwoo.practice5.cardProgram;

import java.util.Random;

public class Deck {
    private Card[] cards = new Card[52];
    int index = 0;
    String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};

    //카드 만들기
    public void setCards() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 1; j <= 13; j++) {
                cards[index++] = new Card(j, suit[i]);
            }
        }
    }

    //섞기.
    public void shuffle() {
        Random random = new Random();
        //배열 인덱스 임의로 2개 뽑기
        for (int i = 0; i < 200; i++) {
            int x = random.nextInt(52);
            int y = random.nextInt(52);
            //뽑은 인덱스로부터 카드 배열 바꾸기
            Card temp = cards[x];
            cards[x] = cards[y];
            cards[y] = temp;
        }
    }

    //뽑기
    public Card draw() {
        Random random = new Random();
        Card card;
        int index;

        do {
            index = random.nextInt(52);
            card = cards[index];
        } while (cards[index] == null);
        cards[index] = null;
        return card;
    }
}


