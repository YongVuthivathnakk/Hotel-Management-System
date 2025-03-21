package UserFolder;

import java.sql.SQLException;
import java.util.HashMap;

import Data.MySQLConnection;
import TimeGenerator.Time;

public class Staff extends User {
    private String role;
    private double salary;
    private String hireDate = Time.currentDate();
    private HashMap<String, String> staffLoginInfo = new HashMap<String, String>();
    // private String password;

    public Staff() {
        super();
    }


    public Staff(String firstName, String lastName, String userName, String gender, int age ,String email, String phoneNumber, String password, String role, double salary, String hireDate) {
        super(firstName, lastName, userName, gender, age, email, phoneNumber, password);
        this.role = role;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    
    public HashMap<String, String> getStaffLoginInfo() {
        return staffLoginInfo;
    }
    
    public void setStaffLoginInfo() throws SQLException {
        MySQLConnection loginInfo = new MySQLConnection();
        loginInfo.selectStaffLoginInfo(staffLoginInfo);
    }

}
    
