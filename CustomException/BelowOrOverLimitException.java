package CustomException;

public class BelowOrOverLimitException extends IllegalArgumentException {
    
    public BelowOrOverLimitException(String message){
        super(message);
    }
}