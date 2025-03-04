package Booking;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import CustomException.BelowOrOverLimitException;
import UserDefinedException.WrongCharacterException;
import UserDefinedException.NumberOnlyException;

public class bookingTesting{
    public static void main(String[] args) {
        // ---------- variable -------------
        String userName;
        String phoneNumber;
        ArrayList<RoomBooking> rooms = new ArrayList<>();
        String checkInDate;
        String checkOutDate;
        ArrayList<ServiceBooking> services = new ArrayList<>();
        int discount = 0;
        // ---------- variable -------------

        // ---------- temp variable --------------
        String roomTypeTemp = "";
        int numberOfRoomTemp = 1; 
        String serviceTemp = "";
        int serviceQuantitesTemp = 1;
        String input; 
        // ---------- temp variable --------------


        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the username: ");
                input = scanner.nextLine();
                WrongCharacterException character = new WrongCharacterException(input, "^(?=.*[a-zA-Z])[0-9a-zA-Z._-]+$", "Please enter only letters (uppercase or lowercase) or a mix of letters, numbers, and the following symbols: -, _, .. Numbers and symbols alone are not allowed.");
                userName = input;
                System.out.println(userName);
            break;                
            } catch (WrongCharacterException e) {
                System.out.println(e.getMessage());
            }
            
        }

        while(true){
            try {
                System.out.print("Enter the phone number: ");
                input = scanner.nextLine();
                NumberOnlyException numberOnly = new NumberOnlyException(input, "^[0-9]+$");
                phoneNumber = input;
                System.out.println(phoneNumber);
                break;
            } catch (NumberOnlyException e) {
                System.out.println(e.getMessage());
            }
        }

        while(true){
            try {
                System.out.print("Enter the room type: ");
                input = scanner.nextLine();
                WrongCharacterException character = new WrongCharacterException(input, "^[a-zA-z ]+$", "Please input only uppercase or lowercase, and space is allowed");
                roomType.add(input);

                System.out.print("Enter the number of room: ");
                input = scanner.nextLine();
                NumberOnlyException numberOnly = new NumberOnlyException(input, "^[1-9]+$", "Please Enter the number from 1 - 9. Number of room cannot less than 1");
                numberOfRoom.add(Integer.parseInt(input));
                for (String iterable_element : roomType) {
                    for(Integer number_OfRoom : numberOfRoom)
                    System.out.println(iterable_element + "  " + number_OfRoom);
                }
                break;
            } catch (WrongCharacterException e) {
                System.out.println(e.getMessage());
            }
        }

        // while (true) {
        //     try {
                
        //     } catch (Exception e) {
        //         // TODO: handle exception
        //     }
        // }
        scanner.close();
    }



    


}
