package bangwoo.practice6.overriding;

public class Child extends Parent{
    String message = "자식 클래스 메세지";

    public void showMessage() {
        System.out.println(message);
    }
}
