package Room;

import java.util.InputMismatchException;
import java.util.Scanner;

import CustomException.BelowOrOverLimitException;

public class testing {
    public static void main(String[] args) {

        String roomType;
        int roomNumber;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of room that you want to add: ");
        roomType = scanner.nextLine();

        while (true) {
            try {
                System.out.print("Enter the room number: ");
                roomNumber = scanner.nextInt();
                if (roomNumber < 100) {
                    throw new BelowOrOverLimitException("Room number must start from 100");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter integer number!");
                scanner.nextLine();
            } catch(BelowOrOverLimitException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();

        Room.assignRoomNumberForEachRoomType(roomType, roomNumber);

        Room.assignRoomNumberForEachRoomType("Standard Room", 101);
        Room.assignRoomNumberForEachRoomType("Standard Room", 102);
        Room.assignRoomNumberForEachRoomType("Standard Room", 103);
        Room.assignRoomNumberForEachRoomType("Standard Room", 104);
        
        Room.assignRoomNumberForEachRoomType("Deluxe Room", 206);
        Room.assignRoomNumberForEachRoomType("Deluxe Room", 207);
        Room.assignRoomNumberForEachRoomType("Deluxe Room", 208);
        
        Room.assignRoomNumberForEachRoomType("Standard Room", 105);
        System.out.println("Room numbers that are Standard Room" + " " + Room.roomNumbersForEachRoomType.get("Standard Room"));

        Room.assignRoomNumberForEachRoomType("Deluxe Room", 209);
        System.out.println("Room numbers that are Deluxe Room" + " " + Room.roomNumbersForEachRoomType.get("Deluxe Room"));

        System.out.println("Room number that are suite" + " " + Room.roomNumbersForEachRoomType.get("Suite"));

    }

}
