package Room;

import java.util.InputMismatchException;
import java.util.Scanner;

import CustomException.BelowOrOverLimitException;

public class testing {
    public static void main(String[] args) {

        // String roomType;
        // int roomNumber;


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the type of room that you want to add: ");
        // roomType = scanner.nextLine();

        // while (true) {
        //     try {
        //         System.out.print("Enter the room number: ");
        //         roomNumber = scanner.nextInt();
        //         if (roomNumber < 100) {
        //             throw new BelowOrOverLimitException("Room number must start from 100");
        //         }
        //         break;
        //     } catch (InputMismatchException e) {
        //         System.out.println("Please enter integer number!");
        //         scanner.nextLine();
        //     } catch(BelowOrOverLimitException e) {
        //         System.out.println(e.getMessage());
        //     }
        // }
        // scanner.close();

        Room.assigningnNewRoom("standard room", 101);
        System.out.println(Room.roomList.get(101));

        Room.assigningnNewRoom("deluxe room", 320);
        System.out.println(Room.roomList.get(320));
    }

}
