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
    public boolean login(String loginName, String loginPassword ) {
        if(loginName == adminName && loginPassword == adminPassword) {
            return true;
        } else {
            return false;
        }
    }
}
