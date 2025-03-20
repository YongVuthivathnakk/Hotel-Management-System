package GUI;

import java.awt.Color;

import javax.swing.JTextField;


public class TextInput extends JTextField {
    
    public TextInput(int x, int y) {
        this.setBounds(x, y, 400, 40);
        this.setBackground(Color.white);
    }

}
