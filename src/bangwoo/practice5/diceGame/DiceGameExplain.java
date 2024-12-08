package bangwoo.practice5.diceGame;

public class DiceGameExplain {
    //실습 문제 2: 간단한 주사위 게임
    //문제 설명:
    //2~4명의 플레이어가 순서대로 주사위를 굴립니다.
    //각 플레이어는 5번의 기회를 가지며, 가장 높은 총 점수를 얻은 사람이 승리합니다.

    //예상 클래스 설계
    //Die 클래스:
    //
    //속성: int sides (주사위 면 수, 기본값 6).
    //메서드: roll() (1~6 사이의 난수를 반환).
    //Player 클래스:
    //
    //속성: String name, int score.
    //메서드:
    //addScore(int points): 점수를 추가합니다.
    //DiceGame 클래스:
    //
    //속성: Player[] players, Die die.
    //메서드:
    //play(): 각 플레이어가 주사위를 굴리고 점수를 기록합니다.
    //getWinner(): 최고 점수 플레이어를 출력합니다.

    //예상 출력
    //Round 1:
    //Alice rolls 4
    //Bob rolls 6
    //Charlie rolls 2
    //
    //Round 2:
    //Alice rolls 5
    //Bob rolls 1
    //Charlie rolls 3
    //
    //Final Scores:
    //Alice: 9, Bob: 7, Charlie: 5
    //Winner: Alice!
}
