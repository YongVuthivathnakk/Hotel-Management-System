import java.time.LocalDate;

public abstract class User {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;


    public User(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
