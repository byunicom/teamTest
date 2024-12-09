/**
 * 실습 문제 1: 카드 게임 시뮬레이터
 * 문제 설명:
 * Deck: 52장의 카드(1~13이 각각 4번씩 등장)를 생성합니다.
 * Player: 2명의 플레이어가 게임을 진행합니다.
 * Game Rules: 각 플레이어는 번갈아 가며 카드 1장을 뽑습니다. 숫자가 높은 카드가 이깁니다. 5라운드 진행 후 점수가 높은 플레이어가 승리합니다.
 * 예상 클래스 설계
 * Card 클래스:
 *
 * 속성: int number (1~13), String suit ("Hearts", "Diamonds", "Clubs", "Spades").
 * Deck 클래스:
 *
 * 속성: Card[] cards (길이 52).
 * 메서드:
 * shuffle(): 카드 배열을 섞습니다.
 * draw(): 카드 한 장을 반환하고, 배열에서 제거합니다.
 * Player 클래스:
 *
 * 속성: String name, int score.
 * 메서드:
 * addScore(int points): 점수를 추가합니다.
 * Game 클래스:
 *
 * 속성: Player[] players, Deck deck.
 * 메서드:
 * start(): 게임을 시작하고 결과를 출력합니다.
 * 예상 출력
 * Round 1: Alice draws 10 of Hearts, Bob draws 7 of Spades -> Alice wins!
 * Round 2: Alice draws 4 of Diamonds, Bob draws 11 of Clubs -> Bob wins!
 * ...
 * Final Score: Alice 3, Bob 2 -> Alice wins the game!
 */

package dgkim.Practice4;

public class CardSimulator {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
