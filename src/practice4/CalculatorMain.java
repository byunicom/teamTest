package practice4;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(12, 256);
        calculator.substract(90, 5999);
        calculator.multply(13, 9);
        calculator.divide(123, 0);
    }
}
