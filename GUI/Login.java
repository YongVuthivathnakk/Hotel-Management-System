package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JLabel;

import com.mysql.cj.log.Log;

public class Login extends AuthenticationForm implements ActionListener {
    JLabel header = new JLabel("Login");
    JLabel statusLabel = new JLabel("");

    public Login(HashMap<String,String> userInfo) {
        super(userInfo); // Call the constructor of the superclass
        header.setForeground(Color.pink);
        header.setFont(new Font("Arial", Font.PLAIN, 35));
        header.setBounds(350, 200, 300,55);
        frame.add(header);

        statusLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        statusLabel.setBounds(150, 300, 300, 55);
        panel.add(statusLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }

}