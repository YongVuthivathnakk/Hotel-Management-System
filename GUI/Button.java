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

    Button(String text, int x, int y, int width, int height){
        super(text);
        this.setBounds(x, y, width, height);
        this.setBackground(Color.pink);
        this.setFocusable(false);
    }

    public void setFont(String string, int plain, String string2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFont'");
    }
}
