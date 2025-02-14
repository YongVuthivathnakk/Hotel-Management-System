public class RequestForCheckOut {
    private String checkoutFullName;
    private String checkoutPhone;
    private String checkoutEmail; // Changed from "checkoutGmail" to be more generic

    // Constructor
    public RequestForCheckOut(String checkoutFullName, String checkoutPhone, String checkoutEmail) {
        this.checkoutFullName = checkoutFullName;
        this.checkoutPhone = checkoutPhone;
        this.checkoutEmail = checkoutEmail;
    }

    // Override toString() for better output readability
    public String toString() {
        return "Check-out Request:\n" +
                "Full Name: " + checkoutFullName + "\n" +
                "Phone: " + checkoutPhone + "\n" +
                "Email: " + checkoutEmail + "\n";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a check-out request
        RequestForCheckOut request = new RequestForCheckOut("Bob Smith", "777-5678", "bob@example.com");

        // Displaying the check-out request
        System.out.println(request);
    }
}
