package dgkim.P1211.interFace.P3;

public class AdvanceCalculator implements Multipliable {

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        int add;
        int subtract;

        Calculator calculator = new BasicCalculator();

        add = calculator.add(a, b);
        subtract = calculator.subtract(a, b);
        System.out.println(add);
        System.out.println(subtract);

        System.out.println("--------------------------");

        a=30;
        b=15;

        Calculator calculator1 = new AdvanceCalculator();
        add = calculator1.add(a,b);
        subtract = calculator1.subtract(a,b);
        System.out.println(add);
        System.out.println(subtract);

        System.out.println("--------------------------");

        AdvanceCalculator calculator2 = new AdvanceCalculator();

        int multiply = calculator2.multiply(a,b);
        System.out.println(multiply);
    }
}
