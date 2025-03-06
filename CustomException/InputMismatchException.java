package CustomException;

public class InputMismatchException extends IllegalArgumentException {
    
    public InputMismatchException(String message){
        super(message);
    }
    
}
