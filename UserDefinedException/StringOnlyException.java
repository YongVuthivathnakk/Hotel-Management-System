package UserDefinedException;
public class StringOnlyException extends IllegalArgumentException {
    public StringOnlyException(String message){
        super(message);
    }

    public StringOnlyException (String inputString, String stringFormat) throws StringOnlyException {
        if (!inputString.matches(stringFormat)) {
            throw new StringOnlyException("Please enter letter only from a-z or A-Z");
        }
        else{
            System.out.println("The input: " + inputString + " is in correct format");
        }
    }
}
