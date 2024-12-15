package bankProject;

import bankProject.MyException.*;


public class Customer {

    String customerId;
    String customerName;
    int accountCount = 0;
    Account[] accountList = new Account[5];


    Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }


    void addAccount(String accountNumber) throws BankOperationException {

        if(accountCount >= 5)
            throw new BankOperationException("계좌 개설 한도 초과 (5/5)");

        Account NewAccount = new Account(accountNumber,0, customerId, customerName);
        accountList[accountCount++] = NewAccount;

    }

    Account findAccount(String accountNum) throws AccountNotFoundException {
        Account account = null;
        for(int i = 0; i < accountCount; i++) {
            if(accountNum.equals(accountList[i].accountNumber))
                account = accountList[i];
        }

        if(account == null)
            throw new AccountNotFoundException("해당 계좌 없음");

        return account;

    }
}




