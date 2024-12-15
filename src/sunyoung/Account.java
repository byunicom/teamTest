package sunyoung;

public class Account {

    //계좌 번호, 잔액


    int accountNum;
    int balance;
    int customerId;
    Customer customer;

    public Account(int accountNum, int customerId, Customer customer) {
        this.accountNum = accountNum;
        this.balance = 0;
        this.customerId = customerId;
        this.customer = customer;
    }
//예외발생 뜨로우 던지는거는 뜨로우스
    public void deposit(int cash){
        balance = balance + cash;
        System.out.println("\n[ 입금이 완료되었습니다. 현재 잔액: " + this.balance + "원 ]\n");

    }

    public void withdrawal(int cash){

        //잔액부족 시 예외처리

        try{
            if(balance < cash){
                throw new InvalidTransactionException("잔액 부족");
            } else {
                balance = balance - cash;
                System.out.println("\n[ 출금이 완료되었습니다. 현재 잔액: " + this.balance + "원 ]\n");
            }

        } catch(InvalidTransactionException e){

            System.out.println("\n[ 잔액 문제 발생 : 잔액이 부족합니다! ] \n");
        }




    }



    public void lookExtra(){
        System.out.println("\n [ 현재 " + this.accountNum + " 계좌에는 " + this.balance + "원이 남아있습니다. ] \n");
    }

}
