import java.util.Arrays;
import java.util.HashMap;

class Payment extends TotalPriceCalculation{
    // attribute
    static int totalPayment = 1;
    int paymentId;
    String paymentMethod;
    int[] bookingID; // booking id is needed for retriving the booking data for payment.
    // this is an array cuz some user don't just booking only one room.
    String paymentDate = currentDateAndCurrentTime.currentDate(); 
    String paymentTime = currentDateAndCurrentTime.currentTime();
    String cardNumber;
    double accpetedCash;
    String status;
    private double totalPrice = TotalPriceCalculation.netTotal;

    // List for storing all the past payment
    static HashMap<Integer, Payment> paymentList = new HashMap<Integer, Payment>();

    // constructor 1 pay by cash
    Payment(String PaymentMethod){
        this.paymentId = totalPayment++;
        this.paymentMethod = PaymentMethod;
        this.status = "Pending";
        
        paymentList.put(paymentId, this);
    }
    
    // constructor 2 pay by card 
    Payment(String PaymentMethod, String CardNumber, String PaymentDate, int[] BookingID, String PaymentId){
        this.paymentId = totalPayment++;
        this.paymentMethod = PaymentMethod;
        this.cardNumber = CardNumber;
        this.paymentDate = PaymentDate; // if pay by card the payment date is the date of payment.
        this.bookingID = BookingID;

        
        this.status = "Paid";
        paymentList.put(paymentId, this);
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(bookingID);
        return result;
    }

    @Override // this equals method will check and prevent it from paying the same bill more than once.
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Payment other = (Payment) obj;
        if (!Arrays.equals(bookingID, other.bookingID))
            return false;
        return true;
    }

    public void paymentProcess(){
        if(paymentMethod.equalsIgnoreCase("Cash")){
            PayByCash payByCash = new PayByCash();
            payByCash.pay(totalPrice);
            status = "Paid";
            System.out.println("The status is: " + status);
            
        }
        else if (paymentMethod.equalsIgnoreCase("Credit card")){
            PayByCreditCard payByCreditCard = new PayByCreditCard();
            payByCreditCard.pay(totalPrice);
            // System.out.println("The total price is: " + totalPrice);
            // System.out.println("Payment is using this card: " + cardNumber);
            // System.out.println("The payment is completed successfully");
            // System.out.println("The payment method is: " + payByCreditCard.paymentType());
            // System.out.println("The payment is made on: " + paymentDate + "at: " + paymentTime);
        }
        else{
            System.out.println("Invalid payment method");
        }
    }

   
}