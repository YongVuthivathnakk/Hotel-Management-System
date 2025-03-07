package Room;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import Data.ReadFromFile;
import Data.WriteToFile;
import UserDefinedException.IntegerOnlyException;
import UserDefinedException.WrongCharacterException;

public class testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String roomType;
        int roomNumber;
        String input;
        int functionNumber;
        ArrayList<String[]> loadData = new ArrayList<>();

        while(true){
            try {
                System.out.println("here are the function that available");
                System.out.println("1. Assign new room number and save / write data to file");
                System.out.println("2. Load the program / read data from file");
                System.out.print("Enter the function number that you want to do: ");
                input = scanner.nextLine();
                functionNumber = Integer.parseInt(input);
                IntegerOnlyException intOnly = new IntegerOnlyException(input, "^[12]$", "Please enter either number 1 or 2 since there are only two function");

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

            Room.assigningnNewRoom(roomType, roomNumber);
            System.out.println(Room.roomList.get(roomNumber));
            WriteToFile.writer("Data/Room_data.txt", Room.getRoomList());

        }
        else{
            ReadFromFile.reader("Data/Room_data.txt", loadData);
            HashMap<Integer, Room> roomlist = new HashMap<>();
            for(String[] words : loadData){
                // System.out.println(Arrays.toString(words));
                if (words[0].toLowerCase().equals("standard room".toLowerCase())) {
                    Room room = new StandardRoom();
                    room.setRoomType(words[0]);
                    room.setRoomNumber(Integer.parseInt(words[1]));
                    room.setCapacity(Integer.parseInt(words[2]));
                    room.setPricePerNight(Double.parseDouble(words[3]));
                    roomlist.put(Integer.parseInt(words[1]), room);
                }
                else{
                    continue;
                }
    
            }
    
            for(Room room : roomlist.values()){
                System.out.println(room);
            }
        }

        scanner.close();
        
    }

}
