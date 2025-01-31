public class Admin {
    private int adminId;
    static int totalID = 0;
    private String name;
    private String password;
    private String email;
    private String phoneNumber;
    private double salary;
    private boolean status; // fale = offline, true = online
    private String shiftTimings; // New attribute (e.g., "9 AM - 5 PM")
    private String role; // A manager or other type of role 

    //Constructor

    Admin(String name,String password, String email, String phoneNumber,double salary, String shiftTimings, String role, boolean status) {
        this.adminId = ++totalID;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.status = status;
        this.shiftTimings = shiftTimings;
        this.role = role;
    }


    // Getter method
    public int getID() {
        return adminId;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public double getSalary() {
        return salary;
    }
    public boolean getStatus() {
        return status;
    }

    public String getShiftTiming() {
        return shiftTimings;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getRole() {
        return role;
    }

}