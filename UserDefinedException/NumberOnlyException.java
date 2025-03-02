package UserDefinedException;

public class NumberOnlyException extends NumberFormatException{
    public NumberOnlyException(String message){
        super(message);
    }

    public NumberOnlyException(String inputString, String stringFormat) throws NumberOnlyException{
        if (!inputString.matches(stringFormat)) {
            throw new NumberOnlyException("Please input the number from 0 - 9");
        }
        else{
            System.out.println("Your input is valid: "+ inputString);
        }
    }
}
