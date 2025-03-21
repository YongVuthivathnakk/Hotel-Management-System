package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuestPage implements ActionListener{
    Frame frame = new Frame();
    JPanel panel = new JPanel();
    Label welcomeLabel = new Label();
    
    // Constructor
    public GuestPage(String username) {

        welcomeLabel.setText("Welcome " + username);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,24));
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setBounds(325, 0, 200, 50);

        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(null);
        panel.setBounds(0,0, 800,800);
        panel.add(welcomeLabel);
        
        frame.add(panel);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}