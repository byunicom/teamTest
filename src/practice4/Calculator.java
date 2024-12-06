package practice4;

public class Calculator {
    public int add(int a, int b) {
        System.out.println("더하기 결과: " + a + b);
        return a + b;
    }

    public int substract(int a, int b) {
        System.out.println("뺴기 결과: " + (a - b));
        return a - b;
    }

    public int multply(int a, int b) {
        System.out.println("곱하기 결과: " + (a * b));
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("나누기 결과: 무한대 입니다.");
            return a;
        } else {
            System.out.println("나누기 결과: " + ((double) a / b));
            return ((double) a / b);
        }
    }
}
