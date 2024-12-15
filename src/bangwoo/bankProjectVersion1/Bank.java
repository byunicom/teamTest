package bangwoo.bankProjectVersion1;


public class Bank {
    final int MAX_CUSTOMER = 100;
    private Customer[] customers = new Customer[MAX_CUSTOMER];
    private int count;
//    private Account[] totalAccount = new Account[5000];


    public void addCustomer(String customerId, String name) throws BankOperationException {
        for (int i = 0; i < count; i++) {
            if (customerId.equals(customers[i].getCustomerId())) {
                throw new BankOperationException("이미 등록된 ID 입니다.");
            }
        }
        if (count >= MAX_CUSTOMER) {
            throw new BankOperationException("고객 수가 최대입니다.");
        } else if (customerId.equals("")) {
            throw new BankOperationException("ID는 최소 한글자는 입력해주세요.");
        } else {
            customers[count++] = new Customer(customerId, name);
            System.out.println("고객 등록이 완료되었습니다.");
        }
    }


    public Customer findCustomer(String customerId) throws BankOperationException {
        //같은 id가 있는지 반복문으로 돌리기
        for (int i = 0; i < count; i++) {
            if (customerId.equals(customers[i].getCustomerId())) {
                return customers[i];
            }
        }
        throw new BankOperationException("일치하는 ID가 없습니다. 고객을 등록하세요.");
    }

//    public void findTotalAccount(int accountNumber) throws BankOperationException {
//        //전체 계좌 새로운 totalAccount에 넣기
//
//        if (customers.length != 0) {
//
//
//            for (int i = 0; i < count; i++) {
//                if (customers[i].getPersonalAccounts() == null) {
//                    throw new BankOperationException("계좌를 생성해야된다.");
//                }
//                for (int j = 0; j < customers[i].getPersonalAccounts().length; j++) {
//                    totalAccount[i] = customers[i].getPersonalAccounts()[j];
//                }
//
//            }
//        }
//        for (int i = 0; i < count; i++) {
//            if (totalAccount[i].getAccountNumber() == accountNumber) {
//                throw new BankOperationException("같은 계좌번호가 존재합니다. 다른 계좌번호를 입력하세요");
//            } else {
//                System.out.println("아몰랑");
//            }
//        }
//    }
}
