package GUI;
import java.awt.Color;
import java.sql.SQLException;

import javax.swing.JButton;

import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;

import UserFolder.Guest;
import UserFolder.Staff;
import UserFolder.User;
import Data.MySQLConnection;

public class AuthenticationMenu {
    Frame frame = new Frame();
    public AuthenticationMenu(){
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setTitle("Hotel Management System");
        JButton registerButton = createButton("Guest Register", 200, 300);
        JButton userLoginButton = createButton("Guest Login", 400, 300);
        JButton staffLoginButton = createButton("Staff Login", 300, 350);
        registerButton.addActionListener((e) ->{
            System.out.println("Register button is clicked");
            if (e.getSource() == registerButton) {
                Register registerPage = new Register();
                frame.dispose();
            } 
        });
        userLoginButton.addActionListener((e) -> {
            System.out.println("Login button is clicked");
            if (e.getSource() == userLoginButton) {
                Guest guestLoginInfo = new Guest();
                try {
                    guestLoginInfo.setGuestLoginInfo();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                GuestLogin loginWindow = new GuestLogin(guestLoginInfo.getGuestLoginInfo());
                frame.dispose();
            } 
        });
        staffLoginButton.addActionListener((e) -> {
             System.out.println("Stuff login button is clicked");
             if (e.getSource() == staffLoginButton) {

                Staff staff = new Staff();
                try {
                    staff.setStaffLoginInfo();
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                
                StaffLogin loginWindow = new StaffLogin(staff.getStaffLoginInfo());
                frame.dispose();
            } 
        });
        registerButton.setBounds(200, 300, 150, 40);
        userLoginButton.setBounds(400, 300, 150, 40);
        staffLoginButton.setBounds(300, 350, 150,40);


    }

    public JButton createButton(String text, int x, int y){
        JButton button = new JButton(text);
        button.setBounds(x, y, 150, 40);
        button.setBackground(Color.pink);
        button.setFocusable(false);
        frame.add(button);
        return button;
    }

    public static void main(String[] args) {
        AuthenticationMenu menu = new AuthenticationMenu();
    }
}

