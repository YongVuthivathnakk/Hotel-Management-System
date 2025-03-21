package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
public class AuthenticationForm implements ActionListener{
    Frame frame = new Frame();
    Panel panel = new Panel();
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    
    Label usernameusernameLabel = new Label("Enter your username: ");
    Label passwordLabel = new Label("Enter your password");

    TextInput usernameInput = new TextInput(50, 70);
    PasswordInput passwordInput = new PasswordInput(50, 160);

    Button loginButton = new Button("Login", 150, 220);




    public AuthenticationForm(HashMap<String,String> loginInfoOrigional){
        loginInfo = loginInfoOrigional;


        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);

        panel.setLayout(null);
        panel.setBounds(200,250,400,500);

        usernameusernameLabel.setForeground(Color.white);
        usernameusernameLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        usernameusernameLabel.setBounds(50, 30, 300, 30);

        passwordLabel.setForeground(Color.white);
        passwordLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        passwordLabel.setBounds(50, 120, 300, 30);

        loginButton.addActionListener(this);

        panel.add(usernameusernameLabel);
        panel.add(usernameInput);
        panel.add(passwordLabel);
        panel.add(passwordInput);
        panel.add(loginButton);

        frame.add(panel);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}