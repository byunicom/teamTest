package bangwoo.practice6.bank;

public class CheckIngAccount extends BankAccount{
    int overdraftLimit;


    CheckIngAccount(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void showBalance() {
        System.out.println("잔액: " + balance + " 초과 인출 한도:" + overdraftLimit);
    }
}
