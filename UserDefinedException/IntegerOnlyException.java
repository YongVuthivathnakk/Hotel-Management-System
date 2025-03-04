package UserDefinedException;

public class IntegerOnlyException extends NumberFormatException{
    public IntegerOnlyException(String message){
        super(message);
    }

    public IntegerOnlyException(String inputString, String stringFormat) throws IntegerOnlyException{
        if (!inputString.matches(stringFormat)) {
            throw new IntegerOnlyException("Please input the number from 0 - 9");
        }
        else{
            System.out.println("Your input is valid: "+ inputString);
        }
    }

    public IntegerOnlyException(String inputString, String stringFormat, String messageString) throws IntegerOnlyException{
        if (!inputString.matches(stringFormat)) {
            throw new IntegerOnlyException(messageString);
        }
        else{
            System.out.println("You input is valid  " + inputString);
        }
    }
}
