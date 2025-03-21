package UserFolder;

import java.security.Provider;
import java.sql.SQLException;
import java.util.HashMap;

import Data.MySQLConnection;


public class Guest extends User {

    private HashMap<String, String> guestLoginInfo = new HashMap<String, String>();
    private HashMap<String, Guest> guestList = new HashMap<String, Guest>();
    private String roomNumber;

    public Guest(String firstName, String lastName, String username, String gender, int age, String email, String phoneNumber, String password, String guestID, String roomNumber) {
        super(firstName, lastName, username, gender, age, email, phoneNumber, password);
        this.roomNumber = roomNumber;
    }

    public Guest() {
        super();
    }

    // public void setGuestID(String guestID) {
    //     this.guestID = guestID;
    // }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public HashMap<String, String> getGuestLoginInfo() {
        return guestLoginInfo;
    }

    public void setGuestLoginInfo() throws SQLException {
        MySQLConnection loginInfo = new MySQLConnection();
        loginInfo.selectGuestLoginInfo(guestLoginInfo);
    }

    @Override
    public void register(String firstName, String lastName, String username, String gender, int age, String email, String phoneNumber, String password) throws SQLException {
        super.register(firstName, lastName, username, gender, age, email, phoneNumber, password);
    }

    

}
