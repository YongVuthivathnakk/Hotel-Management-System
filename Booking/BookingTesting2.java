package Booking;

import java.util.Scanner;

import org.xml.sax.SAXException;

import Data.WriteToFile;
import UserDefinedException.IntegerOnlyException;

public class BookingTesting2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        if( functionNumber == 1){
            
        }
        scanner.close();

        Booking booking = new Booking("Loading Duh", "0965757009", 20, "2025-03-23",  "2025-03-24");
        booking.addNewBookingRoom("Standard Room", 2);
        booking.addNewBookingRoom("Deluxe Room", 1);
        booking.addNewBookingRoom("Extra bed", 1);
        System.out.println(booking);
        WriteToFile.writer("Data/Booking.txt", Booking.getBookingList());

        Booking booking2 = new Booking("Halo", "0983242844", 0, "2025-03-21", "2025-03-22");
        booking2.addNewBookingRoom("Standard Room", 1);
        booking.addNewBookingRoom("Breakfast", 1);
        System.out.println(booking2);
        WriteToFile.writer("Data/Booking.txt", Booking.getBookingList());
    }
}
