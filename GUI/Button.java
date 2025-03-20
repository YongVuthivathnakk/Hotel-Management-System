package GUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Button extends JButton{
    Button(String text, int x, int y){
        super(text);
        this.setBounds(x, y, 150, 40);
        this.setBackground(Color.pink);
        this.setFocusable(false);
        
    }
}
