package a1212.bankProject;

public class BankOperationException extends Exception{

    public BankOperationException(){
        super("오류");
    }

    public BankOperationException(String m){
        super(m);
    }
}
