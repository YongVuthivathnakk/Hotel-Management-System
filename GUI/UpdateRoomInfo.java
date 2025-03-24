package GUI;

import java.awt.Color;

import javax.swing.JPanel;

public class UpdateRoomInfo {
    UpdateRoomInfo(){
        Frame frame = new Frame();
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(250, 250, 700, 300);
        panel.setBackground(Color.DARK_GRAY);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        Label enterExistRoomLabel = new Label("Room number that you want to modify");
        enterExistRoomLabel.setBounds(30, 10, 400, 30);
        TextInput roomNumberInput = new TextInput(30, 40);
   

        Label attributLabel = new Label("Attribute that you want to update");
        attributLabel.setBounds(30, 80, 400, 30);
        TextInput updateAttributeInput = new TextInput(30, 110);

        Label newDataLabel = new Label("New data");
        newDataLabel.setBounds(30, 150, 400, 30);
        TextInput newDataInput = new TextInput(30, 180);

        Button updateButton = new Button("Update", 275,240,150,40);

        
        panel.add(enterExistRoomLabel);
        panel.add(roomNumberInput);
        panel.add(attributLabel);
        panel.add(updateAttributeInput);
        panel.add(newDataLabel);
        panel.add(newDataInput);
        panel.add(updateButton);
        frame.add(panel);
    }


}
