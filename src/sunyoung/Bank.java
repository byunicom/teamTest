package sunyoung;



import java.util.Scanner;

public class Bank {
    // 고객을 등록하고 고객의 정보를 조회합니다.
    static int limitCustomer = 20;
    Customer customerList[];
    int customerCount;

    public Bank(){
        this.customerList = new Customer[limitCustomer];
        this.customerCount = 0;

    }

    public void introduce(){


        while (true){

            System.out.println("=== 은행 시스템 ===\n" +
                    "1. 고객 등록\n" +
                    "2. 계좌 생성\n" +
                    "3. 입금\n" +
                    "4. 출금\n" +
                    "5. 잔액 조회\n" +
                    "6. 종료");


            Scanner sc = new Scanner(System.in);

            int input = sc.nextInt();
            switch (input){
                case 1:
                    System.out.println("새 고객으로서 사용하실 이름, 아이디, 비밀번호를 정해서 입력하세요 : ");
                    // + 첫 개설 통장 번호를
                    System.out.print("이름 : ");
                    String name = sc.next();
                    System.out.print("아이디(숫자만) : ");
                    int id = sc.nextInt();
                    System.out.print("비밀번호(숫자만) : ");
                    int password = sc.nextInt();
//                System.out.println("통장 번호 : ");
//                int accountNum = sc.nextInt();
                    enrollCustomer(new Customer(id, name, password));
                    //customerList[customerList.length] = enrollCustomer(new Customer(id, name));
//                System.out.println(customerList[customerList.length].customerName + "님의 아이디 " +
//                        customerList[customerList.length].customerId + "가 등록 완료 ");
                    // break;
                    break;
                case 2:
                    System.out.print("계좌를 생성할 고객님의 아이디를 입력하세요 : ");
                    int idForAccount = sc.nextInt();
                    System.out.print("비밀번호도 입력하세요 : ");
                    int passwordForAccount = sc.nextInt();

                    Customer c = null;
                    boolean presence = false;
                    int l = -1;


                    for(int i = 0; i < customerList.length; i++){
                        if(customerList[i] != null && idForAccount == customerList[i].customerId && passwordForAccount == customerList[i].password) {
                            presence = true;
                            c = customerList[i];
                            l = i;
                            break;
                            //customerList[i].createAccount(new Account(, idForAccount));
// int accountNum, int customerId
                        }

                    } // idForAccount

                    int ll = l;

                    try{
                        if (presence){
                            System.out.print("해당 계정이 존재합니다. 앞으로 쓸 계좌번호를 정해주세요 : ");
                            int accountNum = sc.nextInt();
                            customerList[ll].createAccount(new Account(accountNum, idForAccount, customerList[ll]));
                        } else throw new AccountNotFoundException();

                    } catch (AccountNotFoundException e){
                        System.out.println("아이디나 비밀번호를 다시 생각해서 입력해주세요. \n");
                    }



                    break;
                case 3:
                    System.out.print("입금할 통장 계좌번호를 입력하세요 : ");
                    int accountForDeposit = sc.nextInt();
                    // Account(int accountNum, int customerId)
//                    for(int i = 0; i < )
//                    if(accountForDeposit == )
                    boolean accountFound = false;

                    for (int i = 0; i < customerList.length; i++) {
                        if (customerList[i] != null) { // 고객 정보가 null이 아닌지 확인
                            for (Account acc : customerList[i].account) { // 고객의 모든 계좌 확인
                                if (acc != null && acc.accountNum == accountForDeposit) { // 계좌 번호 일치 확인
                                    accountFound = true;
                                    System.out.print("입금할 금액을 입력하세요 : ");
                                    int depositAmount = sc.nextInt();
                                    acc.deposit(depositAmount); // 입금 처리
                                    //System.out.println("입금이 완료되었습니다. 현재 잔액: " + acc.balance + "원");
                                    break;
                                }
                            }
                        }
                        if (accountFound) break; // 계좌를 찾으면 더 이상 루프를 돌지 않음
                    }

                    try{

                        if (!accountFound) {
                            throw new AccountNotFoundException();
                            //System.out.println("해당 계좌를 찾을 수 없습니다.");
                        }

                    }catch (AccountNotFoundException e){

                        System.out.println(e);


                        //System.out.println("\n[ 해당 계좌가 없습니다. 다시 생각해주세요. ] \n");
                    }



                    break;
                case 4:
                    System.out.print("출금할 통장 계좌번호를 입력하세요 : ");

                    int accountforWithdrawal = sc.nextInt();

                    System.out.println("비밀번호를 입력하세요 : ");

                    int passwordforWithdrawal = sc.nextInt();

                    boolean accountFound2 = false;

                    for (int i = 0; i < customerList.length; i++) {
                        if (customerList[i] != null) { // 고객 정보가 null이 아닌지 확인
                            for (Account acc : customerList[i].account) { // 고객의 모든 계좌 확인
                                if (acc != null && acc.accountNum == accountforWithdrawal && acc.customer.password == passwordforWithdrawal) { // 계좌 번호 일치 확인
                                    accountFound2 = true;
                                    System.out.print("출금할 금액을 입력하세요 : ");
                                    int withdrawalAmount = sc.nextInt();
                                    acc.withdrawal(withdrawalAmount);

                                    break;
                                }
                            }
                        }
                        if (accountFound2) break; // 계좌를 찾으면 더 이상 루프를 돌지 않음
                    }

                    try{

                        if (!accountFound2) {
                            throw new AccountNotFoundException();
                            //System.out.println("해당 계좌를 찾을 수 없습니다.");
                        }

                    }catch (AccountNotFoundException e){
                        System.out.println(e);
                    }



                    break;
//
                case 5:
                    System.out.println("잔액을 확인할 통장 계좌번호를 입력하세요 : ");

                    int lookForExtra = sc.nextInt();

                    System.out.println("비밀번호도 입력하세요 : ");

                    int lookForExtraPw = sc.nextInt();

                    boolean accountFound3 = false;

                    for (int i = 0; i < customerList.length; i++) {
                        if (customerList[i] != null) { // 고객 정보가 null이 아닌지 확인
                            for (Account acc : customerList[i].account) { // 고객의 모든 계좌 확인
                                if (acc != null && acc.accountNum == lookForExtra && acc.customer.password == lookForExtraPw) { // 계좌 번호 일치 확인
                                    accountFound3 = true;
                                    acc.lookExtra();

                                    break;
                                }
                            }
                        }
                        if (accountFound3) break; // 계좌를 찾으면 더 이상 루프를 돌지 않음
                    }

                    try{

                        if (!accountFound3) {
                            throw new AccountNotFoundException();
                            //System.out.println("해당 계좌를 찾을 수 없습니다.");
                        }

                    }catch (AccountNotFoundException e){

                        System.out.println(e);
                        //System.out.println("다시 생각해주세요, 아이디나 비밀번호가 맞지 않습니다. \n");
                    }

                    break;


                case 6:
                    System.out.println("[ 종료합니다. ]");
                    break;




            }

        }



    }

    public void enrollCustomer(Customer newCustomer){

        if (customerCount >= customerList.length){
            Customer[] newCustomerList = new Customer[customerList.length +1];
            for(int i = 0; i < customerList.length; i++){
                newCustomerList[i] = customerList[i];
            }
            customerList = newCustomerList;


        }

        customerList[customerCount++] = newCustomer;
        System.out.println(customerList[customerCount-1].customerName +"님의 아이디 " +
                customerList[customerCount-1].customerId + " 등록 완료\n");

//        customerList[customerCount++] = newCustomer;
//        System.out.println(customerList[customerList.length].customerName +"님의 아이디" +
//                customerList[customerList.length].customerId + "가 등록 완료");
        //customerList[customerList.length] = newCustomer;



    }

    public void findCustomer(int customerId){

        for(int i = 0; i < customerList.length; i++){
            if(customerList[i].customerId == customerId){
                System.out.println("해당 계좌번호의 고객님이 존재합니다.");
                System.out.println(customerList[i].customerName + "고객님! ");
                System.out.println("현재 총 " + customerList[i].account.length + "개의 통장을 보유하고 계세요.");
            }// else throw new
        }


    }


}
