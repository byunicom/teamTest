/**
 * 실습 문제 3: 간단한 계산기 만들기
 * 목표: 클래스와 메서드 사용을 복습.
 *
 * Calculator라는 클래스를 정의합니다.
 * Calculator 클래스에는 아래와 같은 메서드를 추가하세요:
 * add(int a, int b): 두 수를 더한 결과를 반환합니다.
 * subtract(int a, int b): 두 수를 뺀 결과를 반환합니다.
 * multiply(int a, int b): 두 수를 곱한 결과를 반환합니다.
 * divide(int a, int b): 두 수를 나눈 결과를 반환합니다.
 * main 메서드에서 Calculator 객체를 생성하고, 위 메서드들을 호출해 결과를 출력하세요.
 * 예상 출력 예시:
 *
 * 더하기 결과: 15
 * 빼기 결과: 5
 * 곱하기 결과: 50
 * 나누기 결과: 2
 */
package Practice;

public class CalculatorExam {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //#1. 메서드에서 계산하고, 해당 메서드에서 출력값까지 바로 표현하는 방법
        calculator.add(10,5);

        //#2. 메서드에서 값을 반환받아서 표현하는 방법
        int result=calculator.subtract(10, 5);
        System.out.println("빼기 결과: "+result);

        //#1. 방식으로 처리하였음.
        calculator.multiply(10,5);
        calculator.divide(10,5);

    }
}
