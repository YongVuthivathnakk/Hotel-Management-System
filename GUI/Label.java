package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Label extends JLabel{
    Label(String text){
        super(text);
        setForeground(Color.WHITE);
        setFont(new Font("Serif", Font.PLAIN, 24));
    }
}
