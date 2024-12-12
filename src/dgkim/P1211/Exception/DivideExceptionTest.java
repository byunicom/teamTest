package dgkim.P1211.Exception;

public class DivideExceptionTest {
//    int a;
//    int b;

    public int divide(int a, int b){
            return a/b;
    }

    public static void main(String[] args) {
        DivideExceptionTest divideExceptionTest = new DivideExceptionTest();
        try {
            System.out.println(divideExceptionTest.divide(20, 10));
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
