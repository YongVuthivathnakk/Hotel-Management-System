package Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import com.mysql.cj.exceptions.CJCommunicationsException;
import com.mysql.cj.jdbc.exceptions.CommunicationsException;

import java.sql.ResultSet;

public class MySQLConnection {

    private static Connection connection = null;
    private static final String URL = "jdbc:mysql://localhost:3306/hotel";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    // Establish the connection
    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                System.out.println("Connected to MySQL successfully!");
            }catch (CJCommunicationsException e) {
                System.out.println("please check ur db server");
               
            }
            catch (CommunicationsException e) {
                System.out.println("please check ur db server");
                
            }
            catch (SQLSyntaxErrorException e) {
                System.out.println("Connection failed!");
                
            }
            catch (SQLException e) {
                System.out.println("Connection failed!");
                
            }
        }
        return connection;
    }

    // Execute a query (SELECT)
    public static ResultSet executeQuery(String query) {
        try {
            Statement statement = getConnection().createStatement();
            return statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Query execution failed!");
            e.printStackTrace();
        }
        return null;
    }

    // Execute an update (INSERT, UPDATE, DELETE)
    public static int executeUpdate(String query) {
        try {
            Statement statement = getConnection().createStatement();
            return statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Update execution failed!");
            e.printStackTrace();
        }
        return 0;
    }


    public static void insertData() {

    }


    // Close the connection
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                System.out.println("Failed to close the connection!");
                e.printStackTrace();
            }
        }
    }

    // Insert to 
    public static void insertRoomID() throws SQLException{
        // Test the connection
        getConnection();
        Statement stm = connection.createStatement();
        int id = 10;
        // Executing the SQL Query
        String sql = "INSERT INTO Room (roomID) VALUES ("+ id + ")";  // Syntax of MySQL data insertion
        
        stm.executeUpdate(sql);
    
        System.out.println("Insert Complete!!");

        closeConnection();
        }

        public void insertGuestInfo(String firstName, String lastName, String username, String password, String email, String phoneNumber, int Age, String Gender) throws SQLException {
        getConnection();
        String sql = "INSERT INTO USER (First_Name, Last_Name, Username, Password, Email, Phone_Number, Age, Gender) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, username);
            pstmt.setString(4, password);
            pstmt.setString(5, email);
            pstmt.setString(6, phoneNumber);
            pstmt.setInt(7, Age);
            pstmt.setString(8, Gender);
            pstmt.executeUpdate();
            System.out.println("User inserted successfully!");
        } catch (SQLException e) {
            System.out.println("Failed to insert user!");
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }




    // Select data

    public void selectGuestLoginInfo(HashMap<String, String> loginInfo) throws SQLException {
        getConnection();
        Statement stm = connection.createStatement();
        System.out.println("Getting user info...");
        String sql = "SELECT Username, Password FROM USER;";
        ResultSet rs = stm.executeQuery(sql);
        if (!rs.isBeforeFirst()) {
            System.out.println("No data found.");
        } else {
            System.out.println("Data found, processing...");
        }
        while (rs.next()) {
            String username = rs.getString("Username");
            String password = rs.getString("Password");
            loginInfo.put(username, password);
            System.out.println("Retrieved - Username: " + username + ", Password: " + password);
        }
        closeConnection();
    }

    public static void selectStaffLoginInfo(HashMap<String, String> staffLoginInfo) throws SQLException {
        getConnection();
        Statement stm = connection.createStatement();
        System.out.println("Getting user info...");
        String sql = "SELECT Staff_Username, Password FROM STAFF;";
        ResultSet rs = stm.executeQuery(sql);
        if (!rs.isBeforeFirst()) {
            System.out.println("No data found.");
        } else {
            System.out.println("Data found, processing...");
        }
        while (rs.next()) {
            String username = rs.getString("Staff_Username");
            String password = rs.getString("Password");
            staffLoginInfo.put(username, password);
            System.out.println("Retrieved - Username: " + username + ", Password: " + password);
        }
        closeConnection();
    }
    

    public static void selectRoomID() throws SQLException {
        getConnection();
        Statement stm = connection.createStatement();
        System.out.println("Selecting roomId from Room.....");
        String sql = "Select * from Room;";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            int id = rs.getInt("roomID");
            System.out.println(id);
        }
        closeConnection();
    }


    public static void main(String[] args) throws SQLException {
        MySQLConnection newConnection = new MySQLConnection();
        HashMap<String,String> loginInfo = new HashMap<String,String>();
        newConnection.selectStaffLoginInfo(loginInfo);
        // newConnection.insertGuestInfo("Jake", "Marten", "Jakethedog", "123", "jakethedog@gmail.com", "8851234567", 20, "M");

        // newConnection.selectGuestLoginInfo(loginInfo);
        System.out.println(loginInfo);
    }
}