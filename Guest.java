import Files.Validator;

public class Guest {
    private int guestId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String nationality;
    private String paymentMethod;


    public Guest(int guestId, String firstName, String lastName, String email, String phoneNumber, String address, String nationality, String paymentMethod) {
        Validator.validateEmail(email);
        Validator.validateName(lastName);
        Validator.validateName(lastName);
        this.guestId = guestId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.nationality = nationality;
        this.paymentMethod = paymentMethod;
    };


    // Getters and Setters
    public int getGuestId() {
        return guestId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
 
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
