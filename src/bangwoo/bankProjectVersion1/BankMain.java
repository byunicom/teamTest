package bangwoo.bankProjectVersion1;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner input = new Scanner(System.in);

        boolean whatIsNumber = false;

        System.out.println("====라이언 은행 시스템===");
        System.out.println("1. 고객등록\n2. 계좌 생성\n3. 입금\n4. 출금\n5. 잔액 조회\n6. 종료");

        while (!whatIsNumber) {
            System.out.println();
            System.out.print("선택할 시스템 번호를 입력하세요: ");
            int num = input.nextInt();
            input.nextLine();

            switch (num) {
                //고객등록
                case 1:
                    System.out.println("고객 등록을 선택했습니다.");
                    System.out.print("사용할 ID를 입력하세요: ");
                    String customerId = input.nextLine();
                    System.out.print("성함을 입력하세요: ");
                    String name = input.nextLine();
                    //고객 등록 메서드
                    try {
                        bank.addCustomer(customerId, name);
                    } catch (BankOperationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                //아이디가 다르면 동일한 계좌가 생성되는 문제가 발생하는 중.
                case 2:
                    System.out.println("계좌 생성을 선택했습니다.");
                    System.out.print("ID를 입력하세요: ");
                    String customerAccountId = input.nextLine();

                    try {
                        //입력한 아이디가 있는지 확인.,,
                        Customer customer = bank.findCustomer(customerAccountId);
                        //계좌번호 입력
                        System.out.print("계좌번호를 입력하세요: ");
                        int accountNumber = input.nextInt();
                        input.nextLine(); //int입력이라서 나중에 라인입력에서 엔터가 먹힐까봐 미리 방지.

                        //계좌 생성.
                        try {
//                            try {
//                                bank.findTotalAccount(accountNumber);
//                            } catch (BankOperationException e) {
//                                customer.addAccount(customerAccountId, accountNumber);
//                            }
                            customer.addAccount(customerAccountId, accountNumber);

                         //같은 계좌 번호와 5개 초과시 발생하는 예외.
                        } catch (BankOperationException e) {
                            System.out.println(e.getMessage());
                        }

                        //아이디가 없으면 발생하는 예외
                    } catch (BankOperationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                //입금
                case 3:
                    System.out.println("입금을 선택했습니다.");
                    System.out.print("ID를 입력하세요: ");
                    String customerDepositId = input.nextLine();

                    try {
                        //customer를 새로 만들어서 같은 id 가 있으면 참조값을 복사해서 넣음.
                        Customer customer = bank.findCustomer(customerDepositId);
                        System.out.print("계좌번호를 입력하세요: ");
                        int accountNumber = input.nextInt();
                        input.nextLine();

                        try {
                            //account 객체도 새로 만들어서 같은 계좌번호가 있으면 그 계좌번호를 가지고 있는 참조값을 복사해서 넣음.
                            Account account = customer.findAccount(accountNumber);

                            //입금 과정.
                            System.out.print("입금액을 입력하세요: ");
                            int amount = input.nextInt();
                            input.nextLine(); //int입력이라서 나중에 라인입력에서 엔터가 먹힐까봐 미리 방지.

                            try {
                                account.deposit(amount);
                              //여기 예외는 입금액이 잘못됐을 때 나오는 예외.
                            } catch (InvalidTransactionException e) {
                                System.out.println(e.getMessage());
                            }

                          //여기 캐치블럭은 같은 계좌 번호가 없으면 나오는 예외
                        } catch (AccountNotFoundException e) {
                            System.out.println(e.getMessage());
                        }

                      //여기 캐치블럭은 같은 id 없으면 나오는 예외.
                    } catch (BankOperationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("입금을 선택했습니다.");
                    System.out.print("ID를 입력하세요: ");
                    String customerWithdrawId = input.nextLine();

                    try {
                        //customer를 새로 만들어서 같은 id 가 있으면 참조값을 복사해서 넣음.
                        Customer customer = bank.findCustomer(customerWithdrawId);
                        System.out.print("계좌번호를 입력하세요: ");
                        int accountNumber = input.nextInt();
                        input.nextLine();

                        try {
                            //account 객체도 새로 만들어서 같은 계좌번호가 있으면 그 계좌번호를 가지고 있는 참조값을 복사해서 넣음.
                            Account account = customer.findAccount(accountNumber);

                            //입금 과정.
                            System.out.print("출금액을 입력하세요: ");
                            int amount = input.nextInt();
                            input.nextLine(); //int입력이라서 나중에 라인입력에서 엔터가 먹힐까봐 미리 방지.

                            try {
                                account.withdraw(amount);
                                //여기 예외는 출금액이 잘못됐을 때 나오는 예외.
                            } catch (InvalidTransactionException e) {
                                System.out.println(e.getMessage());
                            }

                            //여기 캐치블럭은 같은 계좌 번호가 없으면 나오는 예외
                        } catch (AccountNotFoundException e) {
                            System.out.println(e.getMessage());
                        }

                        //여기 캐치블럭은 같은 id 없으면 나오는 예외.
                    } catch (BankOperationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("잔액 조회를 선택했습니다.");
                    System.out.print("ID를 입력하세요: ");
                    String showBalanceCustomerId = input.nextLine();

                    try {
                        //입력한 아이디가 존재하는지 확인하는 메서드.
                        Customer customer = bank.findCustomer(showBalanceCustomerId);

                        //계좌확인 과정.
                        System.out.print("계좌번호를 입력하세요: ");
                        int accountNumber = input.nextInt();
                        input.nextLine(); //int입력이라서 나중에 라인입력에서 엔터가 먹힐까봐 미리 방지.

                        //계좌를 찾고 계좌잔액확인 try블럭.
                        try {
                            //입력한 계좌번호가 있는지 확인하는 메서드
                            Account account = customer.findAccount(accountNumber);
                            //계좌잔고 알려주는 메서드.
                            account.showBalance();

                          //찾는 계좌번호가 없으면 나오는 예외.
                        } catch (AccountNotFoundException e) {
                            System.out.println(e.getMessage());
                        }

                      //아이가 없으면 나오는 예외.
                    } catch (BankOperationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    whatIsNumber = true;
            }
        }
    }
}

