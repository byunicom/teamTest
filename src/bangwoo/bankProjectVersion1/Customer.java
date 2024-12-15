package bangwoo.bankProjectVersion1;

public class Customer {
    private String name;
    private String customerId;
    private final int MAX_ACCOUNT = 5;
    private int count = 0;
    private int personalCount;
    private Account[] personalAccounts = new Account[MAX_ACCOUNT];

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }


    public void addAccount(String customerId, int accountNumber) throws BankOperationException {
        personalCount =0;
        for (int i = 0; i < count; i++) {
            //같은 계정 계좌수 보기.
            if (personalAccounts[i] != null && personalAccounts[i].getCustomerId().equals(customerId)) {
                personalCount++;
            }

            if (personalAccounts[i] != null && personalAccounts[i].getAccountNumber() == accountNumber) {
                throw new BankOperationException("계좌번호가 같습니다. 다른 계좌번호를 입력하세요");
            }
        }

        //같은 계좌 5개 이상이면 생성 안되게 막기.
        if (personalCount >= MAX_ACCOUNT) {
            throw new BankOperationException("한 사람당 최대 계좌 갯수는 5개 입니다.");
        }
        //다 검사하면 계좌 생성
        personalAccounts[count++] = new Account(customerId, accountNumber);
        System.out.println("계좌가 생성되었습니다.");
    }


    public Account findAccount(int accountNumber) throws AccountNotFoundException {
        for (int i = 0; i < count; i++) {
            if (personalAccounts[i] != null && personalAccounts[i].getAccountNumber() == accountNumber) {
                return personalAccounts[i];
            }
        }
        throw new AccountNotFoundException("일치하는 계좌가 없습니다. 계좌를 만들어주세요.");
    }


    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Account[] getPersonalAccounts() {
        return personalAccounts;
    }

    public int getPersonalCount() {
        return personalCount;
    }

    public int getCount() {
        return count;
    }
}
