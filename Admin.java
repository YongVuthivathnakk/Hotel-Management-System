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
        // + Promp to enter the room number that needed change the status
        // + Change the room status
    }
    
    public static void checkIn() {
        //TODO: Before Excuting check, for request status by cheking the status in the user csv file
        // + if TRUE change the status to TRUE and change checkout status to FALSE in user CSV file 
    }
    
    public static void checkOut() {
        //TODO: Before Excuting check for request status by checking the status in the user csv file
        // + if TRUE change the status to TRUE and change checkin status to FALSE in user CSV file 

    }

    public String checkRefund() {
        // TODO: Check for refund request.
        // + If refund is requested it will check for the condition depend on the hotel policies.
        return "none";
    }
}
