package bankProject.MyException;

public class NonNumericInputException extends Exception {
    public NonNumericInputException(String msg) {
        super(msg);
    }
}