package UserDefinedException;

public class WrongCharacterException extends IllegalArgumentException {
    public WrongCharacterException(String message){
        super(message);
    }
    public WrongCharacterException(String inputString, String stringFormat) throws WrongCharacterException{
        if (!inputString.matches(stringFormat)) {
            throw new WrongCharacterException("Please enter only letters (uppercase or lowercase) or a mix of letters, numbers, and the following symbols: -, _, .. Numbers and symbols alone are not allowed.");
        }
        else{
            System.out.println("The string is valid " + inputString);
        }
    }

    public WrongCharacterException(String inputString, String stringFormat, String messageString) throws WrongCharacterException{
        if (!inputString.matches(stringFormat)) {
            throw new WrongCharacterException(messageString);
        }
        else{
            System.out.println("The string is valid " + inputString);
        }
    }
}
