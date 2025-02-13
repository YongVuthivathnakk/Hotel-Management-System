import java.util.ArrayList;
import java.util.HashMap;

public class TotalPriceCalculation { // This will be the super class for payByCash and payByCreditCard, as both classess need to calculate the toal payment, including discount for the charges.

    // algorithm
    // 1. ask admin to input all the booking ID
    // 2. use that booking Id to find the object inside the bookinglist and access it the object that contain that booking ID
    // 3. in booking object there is room type use that room type and access to the room class and access its price 
    // 4. take that price and sum all them up
    // 5. calculate for the disount if any

    double subTotal = 0.00;
    static double netTotal = 0.00;

    HashMap<Integer,String> roomTypeList = new HashMap<Integer,String>();

    public double calculateSubTotal(ArrayList<Integer> bookingIds){
        for(int bookingId : bookingIds){  // by this for loop we will get the room type that the user booked, and we will take this to get the roomprice for calculation
            Booking BookingInfo = Booking.bookingMap.get(bookingId);
            String bookedRoomType = BookingInfo.roomType;
            roomTypeList.put(1, bookedRoomType);
        }

        


        return subTotal;
    }


    public double calculateNetTotal(int discount){
        double discountAmount = 0.00;
        discountAmount = (subTotal * discount) / 100;
        netTotal = subTotal - discountAmount;
        return netTotal;
    }    
    
}