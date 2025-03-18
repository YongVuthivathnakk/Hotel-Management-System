package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

public class Login extends AuthenticationForm {
    Label header = new Label("Login");

    public Login() {

        header.setForeground(Color.pink);
        header.setFont(new Font("Arial", Font.PLAIN, 35));
        header.setBounds(350, 200, 300,55);

        frame.add(header);
    }
}