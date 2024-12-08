package bangwoo.practice5.atmProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    private Account[] accounts;
    private Account currentAccount;

    public ATM(String... names) {
        int count = names.length;
        accounts = new Account[count];
        for (int i = 0; i < names.length; i++) {
            accounts[i] = new Account(names[i], 0);
        }
    }

    public void selectAccount(String name) {
        int count = 0;
        for (Account account : accounts) {
            if (account.getAccountHolderName().equals(name)) {
                currentAccount = account;
                System.out.println(name + "님의 계좌가 선택되었습니다.");
                break;
            }
            count++;
        }
        if (count == accounts.length) {
            System.out.println("계좌가 없습니다.");
        }
    }

    public void performTransaction() {
        if (currentAccount == null) {
            System.out.println("이름을 다시 입력하세요.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        System.out.println("환영합니다. 전병우 은행 ATM입니다");
        System.out.println("1. 잔액 확인 || 2. 입금 || 3. 출금 || 4. 나가기");
        while (!validInput) {
            try {
                System.out.print("옵션을 선택하세요: ");
                int menu = scanner.nextInt();
                switch (menu) {
                    case 1:
                        currentAccount.checkBalance();
                        break;
                    case 2:
                        System.out.print("입금액을 입력하세요: ");
                        int depAmount = scanner.nextInt();
                        currentAccount.deposit(depAmount);
                        break;
                    case 3:
                        System.out.print("출금액을 입력하세요: ");
                        int withAmount = scanner.nextInt();
                        currentAccount.withdraw(withAmount);
                        break;
                    case 4:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    default:
                        System.out.println("잘못된 숫자 입력입니다. 다시 입력해주세요");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                break;
            }
        }
    }
}
