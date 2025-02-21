

public class Employee extends User implements Display {
    private int id;
    private String role;
    private double salary;
    private String hireDate;
    private String password;
    private static int totalId = 0;


    public Employee(String firstName, String lastName, String userName, String email, String phoneNumber, String role, double salary, String hireDate, String password) {
        super(firstName, lastName, userName, email, phoneNumber, password);
        this.id = ++totalId;
        this.role = role;
        this.salary = salary;
        this.hireDate = hireDate;
    }



    // Getters
    
    // Email
    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return super.getEmail();
    }


    @Override
    public String getFirstName() {
        // TODO Auto-generated method stub
        return super.getFirstName();
    }



    @Override
    public String getLastName() {
        // TODO Auto-generated method stub
        return super.getLastName();
    }



    @Override
    public String getPhoneNumber() {
        // TODO Auto-generated method stub
        return super.getPhoneNumber();
    }

    // ID
    public int getId() {
        return this.id;
    }

    // Role
    public String getRole() {
        return role;
    }

        // HireDate
    public String getHireDate() {
        return hireDate;
    }


    // Method
    
    @Override
    public void display() {
        // TODO Auto-generated method stub
        
    }


}
