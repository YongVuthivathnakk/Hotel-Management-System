package GUI;
import java.awt.Color;
import javax.swing.JButton;

import UserFolder.UserInfo;


public class AuthenticationMenu {
    Frame frame = new Frame();
    public AuthenticationMenu(){
        frame.getContentPane().setBackground(Color.darkGray);
        JButton registerButton = createButton("User Register", 200, 300);
        JButton userLoginButton = createButton("User Login", 400, 300);
        JButton stuffLoginButton = createButton("Stuff Login", 300, 350);
        registerButton.addActionListener((e) ->{
            System.out.println("Register button is clicked");
            if (e.getSource() == registerButton) {
                Register loginWindow = new Register();
                frame.dispose();
            } 
        });
        userLoginButton.addActionListener((e) -> {
            System.out.println("Login button is clicked");
            if (e.getSource() == userLoginButton) {
                UserInfo users = new UserInfo();
                AuthenticationForm loginWindow = new Login(users.getUserInfo());
                frame.dispose();
            } 
        });
        stuffLoginButton.addActionListener((e) -> {
             System.out.println("Stuff login button is clicked");
             if (e.getSource() == stuffLoginButton) {
                 UserInfo users = new UserInfo();
                 AuthenticationForm loginWindow = new Login(users.getUserInfo());
                 frame.dispose();
            } 
        });
        registerButton.setBounds(200, 300, 150, 40);
        userLoginButton.setBounds(400, 300, 150, 40);
        stuffLoginButton.setBounds(300, 350, 150,40);


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

