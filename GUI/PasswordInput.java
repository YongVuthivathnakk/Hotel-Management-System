package GUI;

import java.awt.Color;

import javax.swing.JPasswordField;

public class PasswordInput extends JPasswordField{
    public PasswordInput(int x, int y) {
        this.setBounds(x, y, 400, 40);
        this.setBackground(Color.white);
    }
}
