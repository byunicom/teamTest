package dgkim.P1211;

public class BasicCalculator implements Calculator {
    @Override
    public int add(int a, int b) {

        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

}
