package bangwoo.practice6.bank;

public class SavingAccount extends BankAccount {
    int interestRate;

    SavingAccount(int interestRate) {
        this.interestRate = interestRate;
    }


    public void showBalance() {
        System.out.println("잔액 :" + balance + " 이자율: " + interestRate) ;
    }
}
