package bangwoo.practice5.diceGame;

public class Player {
    private String name;
    private int score;

    //player정보 생성
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    //승리자 포인트
    public void addScore(int points) {
        score += points;
    }

    public int getScore(){
        return score;
    }

    public String getName() {
        return name;
    }
}
