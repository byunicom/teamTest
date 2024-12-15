package bangwoo.bankProjectVersion1;

public class Account {
    private int accountNumber;
    private String customerId;
    private int balance;

    public Account(String customerId, int accountNumber) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }


    public void deposit(int amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("입금액이 유효하지 않습니다.");
        }
        balance += amount;
        System.out.println(amount + "원 입금 되었습니다.");
    }


    public void withdraw(int amount) throws InvalidTransactionException {
        if (amount > balance) {
            throw new InvalidTransactionException("잔액이 부족합니다. 현재 잔액: " + balance);
        }
        balance -= amount;
        System.out.println(amount + "원 출금 되었습니다.");
    }

    public void showBalance() {
        int balance = getBalance();
        System.out.println("현재 잔액: " + balance+ "원 입니다.");
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getBalance() {
        return balance;
    }
}
