package Booking;
import java.util.Scanner;
import Data.WriteToFile;
import java.util.ArrayList;
import UserDefinedException.WrongCharacterException;
import UserDefinedException.IntegerOnlyException;
import UserDefinedException.StringOnlyException;

public class bookingTesting{
    public static void main(String[] args) {
        // ---------- variable -------------
        String userName;
        String phoneNumber;
        String checkInDate;
        String checkOutDate;
        int discount = 0;
        ArrayList<RoomBooking> bookedRooms = new ArrayList<>();
        ArrayList<ServiceBooking> bookedService = new ArrayList<>();
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
                IntegerOnlyException numberOnly = new IntegerOnlyException(input, "^[0-9]+$");
                phoneNumber = input;
                System.out.println(phoneNumber);
                break;
            } catch (IntegerOnlyException e) {
                System.out.println(e.getMessage());
            }
        }

        while(true){
            try {
                System.out.print("Enter the room type: ");
                input = scanner.nextLine();
                WrongCharacterException character = new WrongCharacterException(input, "^[a-zA-z ]+$", "Please input only uppercase or lowercase, and space is allowed");
                roomTypeTemp = input;
                
                System.out.print("Enter the number of room: ");
                input = scanner.nextLine();
                IntegerOnlyException numberOnly = new IntegerOnlyException(input, "^[1-9]+$", "Please Enter the number from 1 - 9. Number of room cannot less than 1");
                numberOfRoomTemp =Integer.parseInt(input);
                RoomBooking bookingRoom = new RoomBooking(roomTypeTemp, numberOfRoomTemp);
                bookedRooms.add(bookingRoom);
                break;
            } catch (WrongCharacterException e) {
                System.out.println(e.getMessage());
            } catch (IntegerOnlyException e){
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Enter the service that you want to add: ");
                input = scanner.nextLine();

                StringOnlyException stringOnly = new StringOnlyException(input, "^[a-zA-z ]+$");
                serviceTemp = input;

                if (!serviceTemp.toLowerCase().equals("no")) {     
                    System.out.print("Enter the number of service that you want to add: ");
                    input = scanner.nextLine();
                    IntegerOnlyException numberOnly = new IntegerOnlyException(input, "^[1-9]+$", "Please Enter the number from 1 - 9. Number of room cannot less than 1");
                    serviceQuantitesTemp = Integer.parseInt(input);
                }
                else{
                    serviceQuantitesTemp = 0;
                }


                ServiceBooking bookingService = new ServiceBooking(serviceTemp, serviceQuantitesTemp);
                bookedService.add(bookingService);

                break;
            } catch (StringOnlyException e) {
                System.out.println(e.getMessage());
            } catch (IntegerOnlyException e){
                System.out.println(e.getMessage());
            }

        }

        while (true) {
            try {
                System.out.print("Enter the discount: ");
                input = scanner.nextLine();
                IntegerOnlyException numberOnly = new IntegerOnlyException(input, "^(100|[1-9]?[0-9])$", "Please enter number in the range between 0 - 100");
                discount = Integer.parseInt(input);
                break;
            } catch (IntegerOnlyException e) {
                System.out.println(e.getMessage());
            }
        }


        while (true){
            try {
                System.out.print("Enter the check-in date: ");
                input = scanner.nextLine();
                WrongCharacterException wrongCharacter = new WrongCharacterException(input, "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$", "Please enter the the date in this format: YYYY-MM-DD");

                checkInDate = input;
                break;
                
            } catch (WrongCharacterException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true){
            try {
                System.out.print("Enter the check-out date: ");
                input = scanner.nextLine();
                WrongCharacterException wrongCharacter = new WrongCharacterException(input, "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$", "Please enter the the date in this format: YYYY-MM-DD");

                checkOutDate = input;
                break;
                
            } catch (WrongCharacterException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();

        Booking booking= new Booking(userName, phoneNumber, bookedRooms, discount, checkInDate, checkOutDate, bookedService);
        Booking.bookingList.put(booking.bookingId, booking);
        WriteToFile.writer("Data/Booking.txt", Booking.getBookingList());
        System.out.println(booking);
    }



    


}
