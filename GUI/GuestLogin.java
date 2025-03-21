package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.HashMap;

public class GuestLogin extends Login {

    public GuestLogin(HashMap<String, String> userInfo) {
        super(userInfo);
        frame.setTitle("Guest Login");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // super.actionPerformed(e);
        if(e.getSource() == loginButton) {
            String username = usernameInput.getText();
            String password = String.valueOf(passwordInput.getPassword());
            if(loginInfo.containsKey(username)) {
                if(loginInfo.get(username).equals(password)) {
                    GuestPage guestFrame = new GuestPage(username);
                    frame.dispose();
                    statusLabel.setForeground(Color.GREEN);
                    statusLabel.setText("Login successful!");
                } else {
                    statusLabel.setForeground(Color.RED);
                    statusLabel.setText("Incorrect password.");
                }
            } else {
                statusLabel.setForeground(Color.RED);
                statusLabel.setText("Username not found.");
            }
        }
    }
    
}
