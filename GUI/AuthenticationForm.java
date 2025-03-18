package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
public class AuthenticationForm {
    Frame frame = new Frame();
    Panel panel = new Panel();
    public AuthenticationForm(){

        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);

        panel.setLayout(null);
        panel.setBounds(200,250,400,300);

        Label usernameusernameLabel = new Label("Enter your username: ");
        usernameusernameLabel.setForeground(Color.white);
        usernameusernameLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        usernameusernameLabel.setBounds(50, 30, 300, 30);
        TextInput usernameInput = new TextInput(50, 70);

        Label passwordLabel = new Label("Enter your password");
        passwordLabel.setForeground(Color.white);
        passwordLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        passwordLabel.setBounds(50, 120, 300, 30);
        TextInput passwordInput = new TextInput(50, 160);

        Button button = new Button("Submit", 150, 220);

        panel.add(usernameusernameLabel);
        panel.add(usernameInput);
        panel.add(passwordLabel);
        panel.add(passwordInput);
        panel.add(button);

        frame.add(panel);
        
    }
}
