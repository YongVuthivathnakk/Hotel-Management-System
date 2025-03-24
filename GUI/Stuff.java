package GUI;

import java.awt.Color;

import javax.swing.JPanel;


public class Stuff {
    public static void main(String[] args) {
        Frame myFrame = new Frame();
        JPanel categoryPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        categoryPanel.setLayout(null);
        categoryPanel.setBackground(Color.DARK_GRAY);
        categoryPanel.setBounds(0,0,300,800);
        rightPanel.setLayout(null);
        rightPanel.setBackground(Color.white);
        rightPanel.setBounds(300,0,900,800);
        myFrame.getContentPane().setBackground(Color.darkGray);
        Button assignRoomButton = new Button("Assign New Room", 50, 100);
        Button readRoomButton = new Button("Load Room data", 50, 160);
        Button updateRoomButton = new Button("Update Room info",50, 220);
        Button bookingButton = new Button("Booking", 50, 280);
        Button paymentButton = new Button("Payment", 50, 340);
        categoryPanel.add(assignRoomButton);
        categoryPanel.add(readRoomButton);
        categoryPanel.add(bookingButton);
        categoryPanel.add(paymentButton);
        categoryPanel.add(updateRoomButton);
        myFrame.add(categoryPanel);
        myFrame.add(rightPanel);


        assignRoomButton.addActionListener(e ->{
            if(e.getSource() == assignRoomButton){
                System.out.println("Assign new room button is clicked");
                AssignNewRoom assignNewRoom = new AssignNewRoom();
            }
        });

        readRoomButton.addActionListener(e -> {
            if(e.getSource() == readRoomButton){
                System.out.println("Load Room data button is clicked");
                LoadRoomFromDatabase loadRoomData = new LoadRoomFromDatabase();
            }
        });

        bookingButton.addActionListener(e -> {
            if(e.getSource() == bookingButton){
                System.out.println("Booking button is clicked");
                BookingWindow bookingWindow = new BookingWindow();
            }
        });

        updateRoomButton.addActionListener(e ->{
            if(e.getSource() == updateRoomButton){
                System.out.println("Update button is clicked");
                UpdateRoomInfo updateRoomInfo = new UpdateRoomInfo();
            }
        });
    }
}
