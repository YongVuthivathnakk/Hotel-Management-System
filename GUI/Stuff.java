package GUI;

import java.awt.Color;

import javax.swing.JPanel;


public class Stuff {
    public static void main(String[] args) {
        Frame myFrame = new Frame();
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(200,250,400,300);
        myFrame.getContentPane().setBackground(Color.darkGray);
        Button assignRoomButton = new Button("Assign New Room", 50, 100);
        Button readRoomButton = new Button("Load Room data", 250, 100);
        Button bookingButton = new Button("Booking", 120, 160);
        Button paymentButton = new Button("Payment", 120, 220);
        panel.add(assignRoomButton);
        panel.add(readRoomButton);
        panel.add(bookingButton);
        panel.add(paymentButton);
        myFrame.add(panel);


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
    }
}
