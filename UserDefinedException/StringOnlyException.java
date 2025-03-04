package UserDefinedException;
public class StringOnlyException extends IllegalArgumentException {
    StringOnlyException(String message){
        super(message);
    }

    StringOnlyException (String inputString, String stringFormat) throws StringOnlyException {
        if (!inputString.matches(stringFormat)) {
            throw new StringOnlyException("Please enter letter only from a-z or A-Z");
        }
        else{
            System.out.println("The input: " + inputString + "is in correct format");
        }
    }
}
