package bangwoo.practice5.diceGame;

public class DiceGame {
    private Player[] players = new Player[4];
    Dice dice = new Dice();

    //게임 할 사람
    public DiceGame(String name1, String name2, String name3, String name4) {
        players[0] = new Player(name1);
        players[1] = new Player(name2);
        players[2] = new Player(name3);
        players[3] = new Player(name4);
    }

    //게임하기
    public void play() {
        System.out.println("게임 시작!!\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println("라운드 " + i);
            playGround();
            System.out.println();
        }
        getWinner();
    }

    //게임진행
    private void playGround() {
        dice = new Dice();
        int dice1 = dice.roll();
        int dice2 = dice.roll();
        int dice3 = dice.roll();
        int dice4 = dice.roll();

        players[0].addScore(dice1);
        players[1].addScore(dice2);
        players[2].addScore(dice3);
        players[3].addScore(dice4);

        for (Player player : players) {
            System.out.println(player.getName() + " rolls " + dice.roll());
        }
    }

    //게임 승리자 정하기
    private void getWinner() {
        System.out.println("최종 점수!!");
        //총 점수 출력
        for (int i = 0; i < players.length; i++) {
            System.out.print(players[i].getName() + ": " + players[i].getScore());
            if (i < players.length - 1) {
                System.out.print(", ");
            }
        }

        int highestScore = 0;
        Player winner = null;
        boolean tie = false;
        for (Player player : players) {
            if (player.getScore() > highestScore) {
                highestScore = player.getScore();
                winner = player;
                tie = false;
            } else if (player.getScore() == highestScore) {
                tie = true;
            }
        }
        if (tie) {
            System.out.println("\n여러 플레이어가 같은 점수로 무승부");
        } else if (winner != null) {
            System.out.println("\n최종우승자: " + winner.getName() + "!!!");
        }
    }
}

