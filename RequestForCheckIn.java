public class RequestForCheckIn {
    private String checkinFullName;
    private String checkinPhone;
    private String checkinEmail;  // Changed to "Email" (not "Gmail" to be more generic)

    // Constructor
    public RequestForCheckIn(String checkinFullName, String checkinPhone, String checkinEmail) {
        this.checkinFullName = checkinFullName;
        this.checkinPhone = checkinPhone;
        this.checkinEmail = checkinEmail;
    }

    // Override toString() for better output
    public String toString() {
        return "Check-in Request:\n" +
                "Full Name: " + checkinFullName + "\n" +
                "Phone: " + checkinPhone + "\n" +
                "Email: " + checkinEmail + "\n";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a check-in request
        RequestForCheckIn request = new RequestForCheckIn("Alice Brown", "555-1234", "alice@example.com");

        // Displaying the check-in request
        System.out.println(request);
    }
}
