package bankProject;

import bankProject.MyException.*;

/**
 *  Account 클래스
 *
 *  deposit(입금) withdraw(출금) 메서드는 입출금후 잔액을 반환
 *
 *  계좌번호는 10자리로 가정.
 */


public class Account {

    String accountNumber;
    long balance;
    String customerId;
    String customerName;

    Account() {
        this("", 0L, "", "");
    }

    Account(String accountNumber, long balance, String customerId, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerId = customerId;
        this.customerName = customerName;
    }


    long deposit(long amount) throws InvalidTransactionException {

        if(amount <= 0)
            throw new InvalidTransactionException("0원 이하의 금액 입금 시도");
        balance += amount;
        return balance;
    }

    long withdraw(long amount) throws InvalidTransactionException {

        if(amount <= 0)
            throw new InvalidTransactionException("0원 이하의 금액 출금 시도");
        else if(amount >= balance)
            throw new InvalidTransactionException("잔액 부족");

        balance -= amount;
        return balance;
    }

 }
