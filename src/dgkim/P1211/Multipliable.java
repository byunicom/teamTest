package dgkim.P1211;

public interface Multipliable extends Calculator {
    @Override
    default int add(int a, int b) {
        return a+b;
    }

    @Override
    default int subtract(int a, int b) {
        return a-b;
    }

    int multiply(int a, int b);

}
