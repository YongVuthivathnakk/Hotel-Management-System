package Rooms;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
import Data.ReadFromFile;
// import Data.WriteToFile;
import UserDefinedException.IntegerOnlyException;
import UserDefinedException.WrongCharacterException;

public class testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String roomType;
        int roomNumber;
        String input;
        int functionNumber;


        while(true){
            try {
                System.out.println("here are the function that available");
                System.out.println("1. Assign new room number and save / write data to file");
                System.out.println("2. Load the program / read data from file");
                System.out.print("Enter the function number that you want to do: ");
                input = scanner.nextLine();
                IntegerOnlyException intOnly = new IntegerOnlyException(input, "^[12]$", "Please enter either number 1 or 2 since there are only two function");
                functionNumber = Integer.parseInt(input);
                break;
            } catch (IntegerOnlyException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }

        if(functionNumber == 1){
            while (true){
                try {
                    System.out.print("Enter the room type that you want to add: ");
                    input = scanner.nextLine();
                    WrongCharacterException wrongCharacter = new WrongCharacterException(input, "^[a-zA-Z ]+$", "Please enter a-z or A-Z, there should be space between the word");
                    roomType = input;
                    break;
                } catch (WrongCharacterException e) {
                    System.out.println(e.getMessage());
                }
            }
    
            while (true) {
                try {
                    System.out.print("Enter the room number: ");
                    input = scanner.nextLine();
    
                    IntegerOnlyException intOnly = new IntegerOnlyException(input, "^(100|[1-9]\\d{2,})$", "Please enter only the number and must be equal or higher than 100");
                    roomNumber = Integer.parseInt(input);
                    break;
                } catch (IntegerOnlyException e) {
                    System.out.println(e.getMessage());
                } 
            }

            Rooms.RoomManager.assigningnNewRoom(roomType, roomNumber);
            System.out.println(Room.roomList.get(roomNumber));
            Room.insertIntoRoomDatabase();
            
            // WriteToFile.writer("Data/Room_data.txt", Room.getRoomList());

        }
        else{
            System.out.println("Room List:");
            for (int key : Room.roomList.keySet()) {
                System.out.println(Room.roomList.get(key));
            }
        }
        scanner.close();
        
    }

}
