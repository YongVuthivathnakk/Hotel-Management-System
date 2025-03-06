package UserDefinedException;

public class DoubleOnlyException extends NumberFormatException{
    public DoubleOnlyException(String message){
        super(message);
    }

    public DoubleOnlyException (String inputString, String stringFormat) throws DoubleOnlyException{
        if (!inputString.matches(stringFormat)) {
            throw new DoubleOnlyException ("Please enter the decimal number!");
        }
        else{
            System.out.println("You input is: " + inputString + " Correctly formatted");
        }
    }
}
