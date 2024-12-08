package bangwoo.practice5.atmProgram;

public class Account {
    private String accountHolderName;
    private double balance = 0;

    //계좌 개설
    public Account(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    //계좌 입금
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원 입급 완료 되었습니다.");
        } else {
            System.out.println("잘못 입력했습니다.");
        }
    }

    //계좌 출금
    public void withdraw(double amount) {
        if (balance > amount && amount > 0) {
            balance -= amount;
            System.out.println(amount + "원 출금 완료 되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    //계좌 확인
    public void checkBalance() {
        System.out.println("현재 계좌 잔액: " + balance + "원 입니다.");
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
