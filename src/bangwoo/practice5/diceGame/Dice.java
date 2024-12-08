package bangwoo.practice5.diceGame;

public class Dice {
    private int side = 6;

    //굴리기
    public int roll() {
        return (int)(Math.random() * side + 1);
    }
}
