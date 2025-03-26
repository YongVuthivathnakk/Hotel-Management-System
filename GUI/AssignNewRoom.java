package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import Rooms.Room;
import UserDefinedException.IntegerOnlyException;
import UserDefinedException.WrongCharacterException;

public class AssignNewRoom {
    Frame frame = new Frame();
    TextInput roomTypeVariable;
    TextInput roomNumberVariable;
    AssignNewRoom(){        
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.darkGray);
        Label roomTypeLabel = new Label("Enter the room type that you want to add: "); 
        roomTypeLabel.setForeground(Color.WHITE);
        roomTypeLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        roomTypeLabel.setBounds(100,50,400,40);
        roomTypeVariable = new TextInput(100,100);
       

        Label roomNumberLabel = new Label("Enter the room number that you want to add: ");
        roomNumberLabel.setForeground(Color.WHITE);
        roomNumberLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        roomNumberLabel.setBounds(100,160,500,40);
        roomNumberVariable = new TextInput(100, 200);

        Button addNewRoomButton = new Button("Add New Room", 240, 300);
        frame.add(roomTypeVariable);
        frame.add(roomNumberVariable);
        frame.add(roomTypeLabel);
        frame.add(roomNumberLabel);
        frame.add(addNewRoomButton);

        addNewRoomButton.addActionListener(e -> {
            System.out.println("Add new room button is clicked");
            addNewRoom();
        });

        
    }
    private void addNewRoom(){
        String inputRoomType = roomTypeVariable.getText();
        String inputRoomNumber = roomNumberVariable.getText();
        String roomType;
        int roomNumber;
        if (inputRoomType.isEmpty()) {
            System.out.println("input is empty");
        }
        try{
            System.out.println("input room type: " + inputRoomType);
            WrongCharacterException wrongCharacter = new WrongCharacterException(inputRoomType, "^[a-zA-Z ]+$", "Please enter a-z or A-Z, there should be space between the word");
            roomType = inputRoomType;

            System.out.println("input room number: " + inputRoomNumber);
            IntegerOnlyException intOnly = new IntegerOnlyException(inputRoomNumber, "^(100|[1-9]\\d{2,})$", "Please enter only the number and must be equal or higher than 100");
            roomNumber = Integer.parseInt(inputRoomNumber);

            Rooms.RoomManager.assigningnNewRoom(roomType, roomNumber);
            System.out.println(Room.getRoomList().get(roomNumber));
            Room.insertIntoRoomDatabase();

        } catch(WrongCharacterException e){
            System.out.println(e.getMessage());
        } catch(IntegerOnlyException e){
            System.out.println(e.getMessage());
        }
    }
}
