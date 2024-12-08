package bangwoo.practice5.atmProgram;

import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args) {
        ATM atm = new ATM("Jeon", "Kim", "Lee", "Choi");

        Scanner scanner = new Scanner(System.in);
        System.out.print("성함을 입력하세요: ");
        String name = scanner.nextLine();
        atm.selectAccount(name);
        atm.performTransaction();
    }
}
