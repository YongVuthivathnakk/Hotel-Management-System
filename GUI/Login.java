package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.HashMap;

import javax.swing.JLabel;

public class Login extends AuthenticationForm {
    JLabel header = new JLabel("Login");

    public Login(HashMap<String,String> userInfo) {
        super(userInfo); // Call the constructor of the superclass
        header.setForeground(Color.pink);
        header.setFont(new Font("Arial", Font.PLAIN, 35));
        header.setBounds(350, 200, 300,55);
        frame.add(header);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }

    
}