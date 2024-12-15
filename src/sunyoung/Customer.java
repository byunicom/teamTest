package sunyoung;

public class Customer {
    // 고객 ID와 이름을 포함하며, 고객이 소유한 통징(어카운트)목록을 관리합니다.

    int customerId;
    String customerName;
    Account[] account;
    int password;

    public Customer(int customerId){
        this.customerId = customerId;
    }




    public Customer(int customerId, String customerName, int password) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.account = new Account[2];
        this.password = password;
    }

    public void createAccount(Account newAccount){
        Account[] newAccountList = new Account[account.length+1];
        for(int i = 0; i < account.length; i++){

            newAccountList[i] = account[i];

        }
        newAccountList[account.length] = newAccount;

        account = newAccountList;
//// int accountNum, int customerId
        System.out.println(customerName +"님의 계좌가 계좌번호 " + newAccount.accountNum + "로 생성되었습니다.\n");
    }
}
