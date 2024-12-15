package sunyoung;

public class InvalidTransactionException extends Exception{

    public InvalidTransactionException(){
        super("잔액이 부족합니다.");
    }

    public InvalidTransactionException(String message){
        super(message);
    }
}
