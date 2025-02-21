import java.util.ArrayList;
import java.util.HashMap;

public class Payment implements Display {
    private static int totalPaymentId = 1;
    private int paymentId;
    private ArrayList<Integer> bookingId = new ArrayList<Integer>(); // to store multiple booking ID in case user has multiple bookings
    private String paymentMethod;
    private String paymentDate;
    private String paymentTime;
    private String cardNumber;
    private double accpetedCash;
    private String status;
    private double totalPrice;

    // List for storing all the past payment
    private static HashMap<Integer, Payment> paymentList = new HashMap<Integer, Payment>();


    // constructors
    // constructor 1 - Pay by cash
    public Payment(ArrayList<Integer> bookingId, double accpetedCash, double totalPrice) {
        this.paymentId = totalPaymentId++;
        this.bookingId = bookingId;
        this.accpetedCash = accpetedCash;
        this.totalPrice = totalPrice;
        this.paymentMethod = "Cash";
        this.status = "Pending";
    }
    // constructor 2 - Pay by card
    public Payment(ArrayList<Integer> bookingId, String cardNumber, double totalPrice) {
        this.paymentId = totalPaymentId++;
        this.bookingId = bookingId;
        this.cardNumber = cardNumber;
        this.totalPrice = totalPrice;
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

    public String getPaymentTime() {
        return paymentTime;
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

    public static HashMap<Integer, Payment> getPaymentList() {
        return paymentList;
    }

    // this equal method is used to check to prevent having duplicated multiple ID
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bookingId == null) ? 0 : bookingId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Payment other = (Payment) obj;
        if (bookingId == null) {
            if (other.bookingId != null)
                return false;
        } else if (!bookingId.equals(other.bookingId))
            return false;
        return true;
    }
    
    // method
    // Double netTotalCalculation(){
        
    // }
    
    // void Pay(){
        
    // }
    
    @Override
    public void display() {
        // TODO Auto-generated method stub
        
    }
    
    
}

