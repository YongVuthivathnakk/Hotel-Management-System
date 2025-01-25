public class Admin {
    int adminId;
    String name;
    String password;
    String email;
    String phoneNumber;
    double salary;
    boolean activeStatus;

    //Constructor

    public Admin(int adminId, String name, String password, String email, String phoneNumber, double salary, boolean activeStatus) {
        this.adminId = adminId;
        this.name = name;
        this.password = password;
        this.email = email; //Optional
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.activeStatus = activeStatus;
    }
}