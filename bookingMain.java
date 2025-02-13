import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class bookingMain {
    public static void main(String[] args) {
        Booking b1 = new Booking("alice", "010293842", "25/Jun/2024", "27/Jun/2024", "Standard Room", 1, 0, "11/Feb/2024");
        Booking b2 = new Booking("alice", "010293842", "25/Jun/2024", "27/Jun/2024", "Deluxe Room", 1, 10, "11/Feb/2024");
        Booking b3 = new Booking("Chirst", "010293842", "2/Jun/2024", "4/Jun/2024", "Standard Room", 1, 20, "11/Feb/2024");
        // for(int i = 0; i < Booking.bookingList.size(); i++){
        //     System.out.println(Booking.bookingList.get(i));
        // }

        System.out.println("Hash Map");
        System.out.println(Booking.bookingMap.get(1));
        System.out.println(Booking.bookingMap.get(2));
        System.out.println(Booking.bookingMap.get(3));


        

    



        // System.out.println("The current individual user array list is : " + Booking.individualUser.size());
        
        // System.out.println("the current arraylist size is: " + (Booking.bookingList.size() - Booking.individualUser.size()));
        // System.out.println("The total booking is: " + (Booking.Totalbooking - 1));

        
    }
}
