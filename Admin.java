public class Admin {
// Admin Attributes
    String adminName;
    String adminPassword;

// Constructor
    Admin(String newAdminName, String newAdminPassword) {
        adminName = newAdminName;
        adminPassword = newAdminPassword;
    }

// Methods

    // Login
    public boolean login(String loginName, String loginPassword ) {
        return (adminName == loginName && adminPassword == loginPassword);
    }

    public void changeRoomStatus() {

    }
    
    public String checkRefund() {
        return "Booked";
    }
    
    public void chargeForExtra() {
        
    }

    public boolean isChekedIn() {
        return true;
    }

    public void checkIn() {

    }

    public boolean isCheckOut() {
        return true;
    }

    public void checkOut() {

    }
}
