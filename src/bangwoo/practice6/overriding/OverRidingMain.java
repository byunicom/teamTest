package bangwoo.practice6.overriding;

public class OverRidingMain {
    //실습 문제 4: 필드 오버라이딩 확인
    //부모 클래스: Parent
    //속성: message (문자열, 기본값 "부모 클래스 메시지")
    //메서드: message (문자열, 기본값 "부모 클래스 메시지")

    //자식 클래스: Child
    //속성: message (문자열, 기본값 "자식 클래스 메시지")
    //메서드: showMessage()를 오버라이딩하여 message 값을 출력.

    //메인 메서드:
    //Parent 타입의 변수에 Child 객체를 저장하고 showMessage()를 호출하세요.
    //부모 클래스의 message와 자식 클래스의 message의 차이를 확인하세요.
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.showMessage();
    }
}
