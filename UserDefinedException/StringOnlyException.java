package UserDefinedException;

public class StringOnlyException extends IllegalArgumentException {
    public StringOnlyException(String message){
        super(message);
    }
    public StringOnlyException(String inputString, String stringFormat) throws StringOnlyException{
        if (!inputString.matches(stringFormat)) {
            throw new StringOnlyException("Only string is allowed");
        }
        else{
            System.out.println("The string is valid " + inputString);
        }
    }
}
