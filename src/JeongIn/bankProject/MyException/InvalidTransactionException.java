package bankProject.MyException;

public class InvalidTransactionException extends  Exception {
    public InvalidTransactionException(String msg) {
        super(msg);
    }
}
