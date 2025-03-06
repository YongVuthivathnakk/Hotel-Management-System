package Payment;
import java.util.ArrayList;
import java.util.HashMap;
import TimeGenerator.Time;

public class Payment {
    private static int totalPaymentId = 1;
    private int paymentId;
    private ArrayList<Integer> bookingId = new ArrayList<Integer>(); // to store multiple booking ID in case user has multiple bookings
    private String paymentMethod;
    private String paymentDate;
    private String cardNumber;
    private double accpetedCash;
    private String status;
    private double totalPrice;
    private double changes;

    // List for storing all the past payment
    private static HashMap<Integer, Payment> paymentList = new HashMap<Integer, Payment>();


    // constructors
    // constructor 1 - Pay by cash
    public Payment(ArrayList<Integer> bookingId, double accpetedCash, double totalPrice) {
        this.paymentId = totalPaymentId++;
        this.bookingId = bookingId;
        this.accpetedCash = accpetedCash;
        this.totalPrice = totalPrice;
        this.paymentDate = Time.currentDate();
        this.paymentMethod = "Cash";
        this.status = "Pending";
    }
    // constructor 2 - Pay by card
    public Payment(ArrayList<Integer> bookingId, String cardNumber, double totalPrice) {
        this.paymentId = totalPaymentId++;
        this.bookingId = bookingId;
        this.cardNumber = cardNumber;
        this.totalPrice = totalPrice;
        this.paymentDate = Time.currentDate();
        this.paymentMethod = "Card";
        this.status = "Pending";
    }
    

    // getter 
    public static int getTotalPayment() {
        return totalPaymentId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public ArrayList<Integer> getBookingId() {
        return bookingId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getAccpetedCash() {
        return accpetedCash;
    }

    public String getStatus() {
        return status;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getChanges(){
        return changes;
    }

    public static HashMap<Integer, Payment> getPaymentList() {
        return paymentList;
    }

    // to string
    @Override
    public String toString() {
        return   "-----------------------------------------------------------" + "\n" +
                 "Payment information for paymentID: "+ paymentId + "\n" +
                 "BookingId: " + bookingId + "\n" +
                 "Payment Method: " + paymentMethod + "\n" +
                 "Payment Date: " + paymentDate + "\n" +
                 "Card Number: " + cardNumber + "\n" +
                 "Accepted Cash: $" + accpetedCash + "\n" +
                 "Sub Price: $" +  "\n" +
                 "Discount: " + "\n" +
                 "Total Price: $" + totalPrice + "\n" + 
                 "Changes: " + changes + "\n" +
                 "Status: " + status + "\n";
    }

    // this equal method is used to check to prevent having duplicated multiple ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Payment other = (Payment) obj;
        if (paymentId != other.paymentId)
            return false;
        return true;
    }
    
    
    // method
    Double payByCash(double acceptedCash, double totalPrice){
        Double changes = acceptedCash - totalPrice;
        this.status = "Done";
        return changes;
    }

    void payByCard(String cardNumber, double totalPrice){

    }
    

    
    
}

