package bangwoo.practice6.bank;

public class BankMain {
    public static void main(String[] args) {
        //실습 문제 2: 은행 계좌 클래스 상속 및 필드 오버라이딩
        //부모 클래스: BankAccount
        //속성: balance (잔액, 정수형)
        //메서드 :showBalance(): 잔액을 출력.

        //자식 클래스:
        //SavingsAccount (저축 계좌): interestRate (이자율, 정수형).
        //showBalance() 메서드를 오버라이딩하여 잔액과 이자율을 함께 출력.
        //CheckingAccount (당좌 계좌): overdraftLimit (초과 인출 한도, 정수형).
        //showBalance() 메서드를 오버라이딩하여 잔액과 초과 인출 한도를 함께 출력.

        //메인 메서드:
        //SavingsAccount와 CheckingAccount 객체를 생성하고, showBalance()를 호출하여 결과를 출력하세요

        BankAccount b1 = new SavingAccount( 4);
        BankAccount b2 = new CheckIngAccount(10000);

        b1.showBalance();
        b2.showBalance();
    }
}
