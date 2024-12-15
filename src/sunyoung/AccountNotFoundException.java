package a1212.bankProject;

public class AccountNotFoundException extends Exception{

    public AccountNotFoundException(){
        super("[ 찾을 수 없는 계좌입니다. ]");
    }

    public AccountNotFoundException(String m){
        super(m);
    }


}
