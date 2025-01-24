public class Admin {
// Admin Attributes
    public static
    String  adminName;
    String adminPassword;

// Constructor
    Admin(String newAdminName, String newAdminPassword) {
        adminName = newAdminName;
        adminPassword = newAdminPassword;
    }

// Methods

    // Login
    public boolean login(String loginName, String loginPassword ) {

        // TODO: Compare the input with the files.
        return (adminName == loginName && adminPassword == loginPassword);
    }

    public static void changeRoomStatus(String roomNum) {
        // TODO: read the files and store in a linkedlist and show all room status
        // + Promp to enter the room number that needed change
        // + Change the room status
    }

    public boolean isCheckInRequested() {
        boolean isTrue = false;
        //TODO: read the user CSV file about the request for check in
        // + set TRUE or FALSE depend on the file
        return isTrue;
    }
    
    public static void checkIn() {
        //TODO: Before Excuting check for request status by using isCheckinRequested
        // + if TRUE change the status to TRUE in user CSV file 
    }

    public boolean isCheckOutRequested() {
        boolean isTrue = false;
        //TODO: read the user CSV file about the request for check out
        // + set TRUE or FALSE depend on the file
        return isTrue;
    }
    
    public static void checkOut() {
        //TODO: Before Excuting check for request status by using isCheckinRequested
        // + if TRUE change the status to TRUE in user CSV file 

    }

    public String checkRefund() {
        return "none";
    }
}
