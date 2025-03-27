package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import UserFolder.Guest;

public class Register implements ActionListener{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    Label header = new Label("Register as a Guest");

    JLabel firstNameLabel = new JLabel("First Name: ");
    JTextField firstNameField = new JTextField();

    JLabel lastNameLabel = new JLabel("Last Name: ");
    JTextField lastNameField = new JTextField();

    JLabel emailLabel = new JLabel("Email: ");
    JTextField emailField = new JTextField();

    JLabel phoneNumberLabel = new JLabel("Phone Number: ");
    JTextField phoneNumberField = new JTextField();

    JLabel passwordLabel = new JLabel("Password: ");
    JTextField passwordField = new JTextField();

    JLabel genderLabel = new JLabel("Gender: ");
    JTextField genderField = new JTextField();

    Button submitButton = new Button("Submit", 200, 550);

    JLabel ageLabel = new JLabel("Age: ");
    JTextField ageField = new JTextField();
    JLabel usernameLabel = new JLabel("Username: ");
    JTextField usernameField = new JTextField();

    JLabel statusLabel = new JLabel();

    public Register() {
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        header.setForeground(Color.pink);
        header.setFont(new Font("Arial", Font.PLAIN, 35));
        header.setBounds(350, 50, 300, 55);

        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(0, 0, 800, 800);
        panel.setLayout(null);

        firstNameLabel.setBounds(50, 150, 100, 30);
        firstNameLabel.setForeground(Color.WHITE);
        firstNameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        firstNameField.setBounds(200, 150, 150, 30);

        lastNameLabel.setBounds(50, 200, 100, 30);
        lastNameLabel.setForeground(Color.WHITE);
        lastNameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        lastNameField.setBounds(200, 200, 150, 30);

        usernameLabel.setBounds(50, 250, 100, 30);
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        usernameField.setBounds(200, 250, 150, 30);

        emailLabel.setBounds(50, 300, 100, 30);
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        emailField.setBounds(200, 300, 150, 30);

        phoneNumberLabel.setBounds(50, 350, 100, 30);
        phoneNumberLabel.setForeground(Color.WHITE);
        phoneNumberLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        phoneNumberField.setBounds(200, 350, 150, 30);

        genderLabel.setBounds(50, 400, 100, 30);
        genderLabel.setForeground(Color.WHITE);
        genderLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        genderField.setBounds(200, 400, 150, 30);

        ageLabel.setBounds(50, 450, 100, 30);
        ageLabel.setForeground(Color.WHITE);
        ageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        ageField.setBounds(200, 450, 150, 30);

        passwordLabel.setBounds(50, 500, 100, 30);
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordField.setBounds(200, 500, 150, 30);

        submitButton.addActionListener(this);

        statusLabel.setBounds(200, 600, 300, 30);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        statusLabel.setForeground(Color.GREEN);
        statusLabel.setText("");

        panel.add(header);
        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(phoneNumberLabel);
        panel.add(phoneNumberField);
        panel.add(genderLabel);
        panel.add(genderField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(submitButton);
        panel.add(statusLabel);
        frame.setTitle("Guest Registration");
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitButton){
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String email = emailField.getText();
            String phoneNumber = phoneNumberField.getText();
            String password = passwordField.getText();
            String gender = genderField.getText();
            String username = usernameField.getText();
            int age = Integer.parseInt(ageField.getText());
            Guest newGuest = new Guest();
            try {
                newGuest.register(firstName, lastName, username, gender, age, email, phoneNumber, password);
                statusLabel.setText("Data is successfully registered !!!");
                statusLabel.setForeground(Color.GREEN);
                sleep(3);
                AuthenticationMenu menu = new AuthenticationMenu();
                frame.dispose();
            } catch (SQLException e1) {
                statusLabel.setText("Registration failed. Please try again.");
                statusLabel.setForeground(Color.RED);
                e1.printStackTrace();
            }
        }
    }



    public static void main(String[] args) {
        new Register();
    }
}
