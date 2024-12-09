/**
 * 실습 문제 2: TV 기능 구현하기
 * 목표: 클래스 정의와 메서드 사용 연습.
 *
 * TV라는 이름의 클래스를 정의합니다.
 * TV 클래스에는 아래와 같은 속성을 추가하세요:
 * power (전원 상태, true 또는 false)
 * channel (현재 채널, 정수형)
 * TV 클래스에는 아래와 같은 메서드를 추가하세요:
 * togglePower(): 전원 상태를 켜거나 끕니다.
 * changeChannel(int newChannel): 새로운 채널로 변경합니다.
 * main 메서드에서 TV 객체를 생성하고, 전원을 켜고 채널을 변경한 뒤 출력하세요.
 * 예상 출력 예시:
 *
 * 전원이 켜졌습니다.
 * 채널을 5번으로 변경했습니다.
 */
package dgkim.Practice;

public class TVExam {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.togglePower(true);
        tv.changeChannel(5);
    }
}
