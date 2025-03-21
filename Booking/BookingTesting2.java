package Booking;

import java.util.ArrayList;
import java.util.Scanner;

import Data.ReadFromFile;
import Data.WriteToFile;
import Rooms.RoomManager;
import UserDefinedException.IntegerOnlyException;

import UserDefinedException.WrongCharacterException;

public class BookingTesting2 {
    public static void main(String[] args) {

        // ---------- variable -------------
        String userName = "";
        String phoneNumber = "";
        String checkInDate = "";
        String checkOutDate = "";
        int discount = 0;
        
        // ---------- variable -------------

        // ---------- temp variable --------------
        String roomTypeTemp = "";
        int numberOfRoomTemp = 1; 
        String input; 

        // ---------- temp variable --------------
        Scanner scanner = new Scanner(System.in);
        int functionNumber;
        while(true){
            try {
                System.out.println("here are the function that available");
                System.out.println("1. Booking new Room / write data to file");
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

        if( functionNumber == 1){

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

            while(true){
                try {
                    System.out.print("Enter the room type that you want to add or no to stop: ");
                    input = scanner.nextLine();
                    if (input.equalsIgnoreCase("no")) {     
                        break;
                    }
                    WrongCharacterException character = new WrongCharacterException(input, "^[a-zA-z ]+$", "Please input only uppercase or lowercase, and space is allowed");

                    roomTypeTemp = input;

                    System.out.print("Enter the number of room: ");
                    input = scanner.nextLine();
                    IntegerOnlyException numberOnly = new IntegerOnlyException(input, "^[1-9]+$", "Please Enter the number from 1 - 9. Number of room cannot less than 1");
                    numberOfRoomTemp =Integer.parseInt(input);
                } catch (WrongCharacterException e) {
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
            Booking bookingRoom = new Booking(userName, phoneNumber, discount, checkInDate, checkOutDate);
            bookingRoom.addNewBookingRoomRequiement(roomTypeTemp, numberOfRoomTemp);
            bookingRoom.assignedRoomForGuest(bookingRoom); 
            Booking.bookingList.put(bookingRoom.bookingId, bookingRoom);
            System.out.println(bookingRoom.printingReceipe(bookingRoom));
            
            // BookingManager.loadDataFromBookingFile(); This line is error
            WriteToFile.writer("Data/Booking.csv", Booking.getBookingList());
            System.out.println("Data successfully written to file");
        }
        else{
            System.out.println("Loading the program.");
        }
        scanner.close();


    }
}
