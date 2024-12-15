package bankProject;


import java.util.Scanner;
import bankProject.MyException.*;

public class BankSystem {

    static Bank lionBank = new Bank();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int selectedOption = 0;


        while(true) {
            System.out.printf("=== 라이온 은행 시스템 ===%n 1. 고객 등록%n 2. 계좌 생성%n 3. 입금%n 4. 출금%n 5. 잔액 조회%n 6. 종료%n%n");
            System.out.print("메뉴 번호를 입력하세요 : ");

            input = scanner.nextLine();
            selectedOption= Integer.parseInt(input);

            switch (selectedOption) {

                case 1:
                    registerCustomer();
                    break;
                case 2:
                    createAccount();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    getAccountBalance();
                    break;
                case 6:
                    System.out.println("시스템을 종료합니다.");
                    System.exit(0);
                default :
                    System.out.println("잘못 입력하셨습니다. 1 ~ 6번 중 하나의 메뉴를 선택해주세요.");
                    break;

            }

        }
    }


    // 1. 고객 등록
    private static void registerCustomer() {

        String newCustomId = "";
        String newCustomName = "";
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%n====== 신규 고객 등록 절차를 진행합니다! ======%n");

        while(true)  {
            System.out.print("고객님이 사용하실 ID를 입력해주세요. : ");
            newCustomId = scanner.nextLine();

            if(isCustomerIdDuplicate(newCustomId) || newCustomId.isEmpty()) {
                System.out.println("해당 ID는 사용할 수 없는 아이디입니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("고객님의 이름을 입력해주세요. : ");
            newCustomName = scanner.nextLine();

            lionBank.addCustomer(newCustomId, newCustomName);

            System.out.printf("고객 등록이 완료되었습니다! %n%n");
            break;


        }

    }



    // 2. 계좌 생성
    private static void createAccount() {

        Scanner scanner = new Scanner(System.in);
        int attempt = 0, maxAttempt = 5;
        Customer customer = null;
        String newAccountNumber = "";
        String customerID = "";

        System.out.printf("%n====== 신규 계좌 개설 절차를 진행합니다! ======%n%n");


        while(attempt < maxAttempt) {
            System.out.print("1. 고객님의 ID를 입력해주세요 : ");
            customerID = scanner.nextLine();
            customer = getCustomer(customerID);
            if(customer == null) {
                System.out.printf("해당 ID는 존재하지 않습니다. ID를 다시 확인해 주세요. (누적 시도 횟수 %d/5) %n%n", ++attempt);
                continue;
            }
            break;
        }

        if(attempt >= maxAttempt) {
            System.out.printf("입력 횟수를 초과했습니다. ID를 다시 한번 확인해주세요. %n%n");
            return;
        }
            

        newAccountNumber = String.format("%010d", lionBank.accountNumTotal);
        System.out.printf("%n2. 계좌 개설 시작 %n");

        try {
            customer.addAccount(newAccountNumber);
        } catch (BankOperationException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            System.out.printf("개설할 수 있는 통장이 최대한도에 도달했습니다.%n%n");
            return;
        }

        lionBank.accountNumTotal++;

        System.out.printf("%s(%s)님의 신규 계좌 개설이 완료되었습니다. (%d/5) %n%n",customer.customerName, customer.customerId, customer.accountCount);



    }



    // 3. 입금 하기
    private static void deposit() {
        Account depositAccount = null;
        Scanner scanner = new Scanner(System.in);
        String accountNum = "";
        String amount = "";
        int attempt = 0, maxAttempt = 5;
        long balance;


        System.out.printf("%n====== 입금 절차를 시작합니다. ======%n%n");

        while(attempt < maxAttempt) {

            try {
                System.out.print("1. 입금할 계좌 번호를 입력해주세요. : ");
                accountNum = scanner.nextLine();
                depositAccount = findAccountByNumber(accountNum);
                break;

            } catch (AccountNotFoundException e) {
                System.out.println("에러 메시지 : " + e.getMessage());
                System.out.printf("존재하지 않는 계좌입니다. 다시 입력해주세요. (누적 시도 횟수 %d/5) %n%n", ++attempt);
            }

        }

        while(attempt < maxAttempt) {

            try {
                System.out.print("2. 입금할 금액을 입력해주세요 : ");
                amount = scanner.nextLine();
                isAllNumeric(amount); // 입력값이 유효한 숫자인지 체크!

                try {
                    balance = depositAccount.deposit(Long.parseLong(amount)); // 입금
                    System.out.printf("%s님의 계좌(%s)에 %d원이 입금되었습니다. 잔액 : %d %n%n",
                            depositAccount.customerName, depositAccount.accountNumber, Long.parseLong(amount), balance);
                    return;

                } catch (InvalidTransactionException e) {
                    System.out.println("에러 메시지 : " + e.getMessage());
                    System.out.printf("0원 이하의 금액은 입금할 수 없습니다. 다시 시도해주세요. (누적 시도 횟수 %d/5) %n%n", ++attempt);
                }

            } catch (NonNumericInputException e) {
                System.out.println("에러 메시지 : " + e.getMessage());
                System.out.printf("유효하지 않은 입력입니다. 숫자만 입력해주세요. (누적 시도 횟수 %d/5) %n%n", ++attempt);

            }

        }


        System.out.printf("입력 횟수를 초과했습니다. 계좌 번호 혹은 입금 금액을 다시 한번 확인해주세요. %n%n");

    }

    // 4. 출금 하기

    private static void withdraw() {

        Scanner scanner = new Scanner(System.in);
        String customerID = "";
        String accountNum = "";
        Customer customer = null;
        Account withDrawAccount = null;
        String amount = "";
        int attempt = 0, maxAttempt = 5;
        long balance;

        System.out.printf("%n====== 출금 절차를 시작합니다. ======%n%n");


        while(attempt < maxAttempt) {
            System.out.print("1. 고객님의 ID를 입력해주세요 : ");
            customerID = scanner.nextLine();
            customer = getCustomer(customerID);
            if(customer == null) {
                System.out.printf("해당 ID는 존재하지 않습니다. ID를 다시 확인해 주세요. (누적 시도 횟수 %d/5) %n%n", ++attempt);
                continue;
            }
            break;
        }

        while(attempt < maxAttempt) {

            try {
                System.out.print("2. 출금할 계좌 번호를 입력해주세요. : ");
                accountNum = scanner.nextLine();
                withDrawAccount = findAccountByNumber(accountNum);
                break;

            } catch (AccountNotFoundException e) {
                System.out.println("에러 메시지 : " + e.getMessage());
                System.out.printf("존재하지 않는 계좌입니다. 다시 입력해주세요. (누적 시도 횟수 %d/5) %n%n", ++attempt);
            }

        }

        while(attempt < maxAttempt) {

            try {
                System.out.print("3. 출금할 금액을 입력해주세요 : ");
                amount = scanner.nextLine();
                isAllNumeric(amount); // 입력값이 유효한 숫자인지 체크!

                try {
                    balance = withDrawAccount.withdraw(Long.parseLong(amount)); // 입금
                    System.out.printf("%s님의 계좌(%s)에서 %d원이 출금되었습니다. 잔액 : %d %n%n",
                            withDrawAccount.customerName, withDrawAccount.accountNumber, Long.parseLong(amount), balance);
                    return;

                } catch (InvalidTransactionException e) {
                    System.out.println("에러 메시지 : " + e.getMessage());
                    System.out.printf("0원 이하의 금액이나 잔액을 초과한 금액은 출금할 수 없습니다. 다시 시도해주세요. (누적 시도 횟수 %d/5) %n%n", ++attempt);
                }

            } catch (NonNumericInputException e) {
                System.out.println("에러 메시지 : " + e.getMessage());
                System.out.printf("유효하지 않은 입력입니다. 숫자만 입력해주세요. (누적 시도 횟수 %d/5) %n%n", ++attempt);

            }

        }


        System.out.printf("입력 횟수를 초과했습니다. 계좌 번호 혹은 입금 금액을 다시 한번 확인해주세요. %n%n");



    }



    // 5. 잔액 조회
    private static void getAccountBalance() {

        Scanner scanner = new Scanner(System.in);
        String customerID = "";
        String inputAccountNum = "";
        Account account = null;
        int attempt = 0, maxAttempt = 5;


        Customer customer = null;
        System.out.printf("%n====== 계좌 잔액 조회 절차를 진행합니다. ======%n%n");


        while(attempt < maxAttempt) {
            System.out.print("고객님의 ID를 입력해주세요 : ");
            customerID = scanner.nextLine();
            customer = getCustomer(customerID);
            if(customer == null) {
                System.out.printf("해당 ID는 존재하지 않습니다. ID를 다시 확인해 주세요. (누적 시도 횟수 %d/5) %n%n", ++attempt);
                continue;
            }
            break;
        }

        while(attempt < maxAttempt) {
            try {
                System.out.printf("2. %s(%s)님의 계좌 번호를 입력해주세요. : ",customer.customerName , customer.customerId );
                inputAccountNum = scanner.nextLine();
                account = customer.findAccount(inputAccountNum);
                System.out.printf("%n해당 계좌(%s)의 잔액 : %d원 %n%n", account.accountNumber, account.balance);
                return;
            } catch (AccountNotFoundException e) {
                System.out.println("에러 메시지 : " + e.getMessage());
                System.out.printf("해당 통장이 존재하지 않습니다. 계좌번호를 다시 확인해주세요. (누적 시도 횟수 %d/5) %n%n", ++attempt);
            }

        }

        System.out.println("최대 입력 시도 횟수를 초과하였습니다.");


    }




    private static boolean isCustomerIdDuplicate(String newCustomId) {
        for(int i = 0; i < lionBank.customerNum; i++) {
            if(newCustomId.equals(lionBank.customerList[i].customerId))
                return true;
        }
        return false;
    }


    private static Customer getCustomer(String customerName) {

        Customer customer = null;
        customer = lionBank.findCustomer(customerName);

        return customer;
    }


    // 입력받은 문자가 모두 숫자로 이루어져 있는지의 여부를 판별
    public static void isAllNumeric(String str) throws NonNumericInputException {

        char[] charArray = str.toCharArray();

        for(char ch : charArray) {
            if(ch < '0' || ch > '9')
                throw new NonNumericInputException("숫자외 문자 입력");
        }

    }


    // 입력받은 계좌번호를 기준으로 해당 계좌를 찾아서 반환, 존재하지 않으면 null을 반환
    private static Account findAccountByNumber(String accountNumber) throws AccountNotFoundException {

        for(Customer customer : lionBank.customerList) {
            for(Account account : customer.accountList) {
                if(accountNumber.equals(account.accountNumber))
                    return account;
            }
        }

        throw new AccountNotFoundException("해당 계좌는 존재하지 않음");


    }




    /*
    private static boolean isReturnKey(String input) {
        return input.equalsIgnoreCase("q");
    }
     */


}




