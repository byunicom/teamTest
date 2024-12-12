package dgkim.P1211.interFace.P1;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

        Printer c = new ConsolePrinter();
        c.print("hello");
    }

}
