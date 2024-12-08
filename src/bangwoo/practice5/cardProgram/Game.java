package bangwoo.practice5.cardProgram;

public class Game {
    private Player[] players;
    private Deck deck;

    //player 생성.
    public Game(String player1, String player2) {
        players = new Player[2];
        players[0] = new Player(player1);
        players[1] = new Player(player2);
    }

    //게임 시작
    public void start() {
        System.out.println("게임 시작.");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print("라운드 " + i + ": ");
            playRound();
            System.out.println();
            if (players[0].getScore() == 3 || players[1].getScore() == 3) {
                break;
            }
        }
        System.out.println();
        printWinner();
    }

    //라운드 진행.
    private void playRound() {
        deck = new Deck();
        deck.setCards();
        deck.shuffle();
        Card card1 = deck.draw();
        Card card2 = deck.draw();
        System.out.println(players[0].getName() + " 가(이) " + card1 + "을 뽑았다." + ", " + players[1].getName() + " 가(이) " + card2 + "을 뽑았다.");

        if (card1.getNumber() > card2.getNumber()) {
            players[0].addScore(1);
            System.out.println(players[0].getName() + "가(이) 라운드 승리!!");
        } else if (card1.getNumber() < card2.getNumber()) {
            players[1].addScore(1);
            System.out.println(players[1].getName() + "가(이) 라운드 승리!!");
        } else {
            System.out.println("카드 넘버가 같으므로, 두 플레이어 모두 점수를 얻지 못했습니다.");
        }
    }

    //우승자 발표
    public void printWinner() {
        if (players[0].getScore() > players[1].getScore()) {
            if (players[0].getScore() == 3) {
                System.out.println(players[0].getName() + " " + players[0].getScore() + ", " + players[1].getName() + " " + players[1].getScore() + "-> " + players[0].getName() + " 최종 우승!!!!!!");
            }
        } else if (players[0].getScore() < players[1].getScore()) {
            if (players[1].getScore() == 3) {
                System.out.println(players[1].getName() + " " + players[1].getScore() + ", " + players[0].getName() + " " + players[0].getScore() + "-> " + players[1].getName() + " 최종 우승!!!!!!");
            }
        } else {
            System.out.println("동점으로 우승자가 없습니다!!");
        }
    }
}

