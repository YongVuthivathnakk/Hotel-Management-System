import java.util.ArrayList;
import java.util.Arrays;

class Payment{
    // attribute
    static int totalPayment = 0;
    int paymentId;
    String paymentMethod;
    String[] bookingID; // booking id is needed for retriving the booking data for payment.
    // this is an array cuz some user don't just booking only one room.
    String paymentDate; 
    String cardNumber;
    String status;
    private double totalPrice;

    // arraylist
    ArrayList<Payment> paymentlist = new ArrayList<Payment>();

    // constructor 1 pay by cash
    Payment(String PaymentMethod, String[] BookingId, double TotalPrice, String PaymentDate){
        this.paymentId = totalPayment++;
        this.paymentMethod = PaymentMethod;
        this.bookingID = BookingId;
        this.totalPrice = TotalPrice;
        this.paymentDate = PaymentDate; // if they pay by cash, the payment date supposed to be the checkout date.
        this.status = "Pending";
        
        paymentlist.add(this);
    }
    
    // constructor 2 pay by card 
    Payment(String PaymentMethod, String CardNumber, String PaymentDate, String[] BookingID, String PaymentId, double TotalPrice){
        this.paymentId = totalPayment++;
        this.paymentMethod = PaymentMethod;
        this.cardNumber = CardNumber;
        this.paymentDate = PaymentDate; // if pay by card the payment date is the date of payment.
        this.bookingID = BookingID;
        this.totalPrice = TotalPrice;
        this.status = "Paid";
        paymentlist.add(this);
    }

    double getTotalPrice(){
        return totalPrice;
    }

    @Override
    public String toString() {
        return  "---------------------------------------------" + "\n" +
                "Payment information for payment ID: " + paymentId + "\n" +
                "Payment method: " + paymentMethod + "\n" +
                "Booking ID: " + Arrays.toString(bookingID) + "\n" +
                "Payment date:" + paymentDate + "\n" +
                "Card number: " + cardNumber + "\n" +
                "Status: " + status + "\n" +
                "Total price: $" + totalPrice + "\n" +
                "---------------------------------------------";
    }

    

    
}