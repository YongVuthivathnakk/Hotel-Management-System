class Payment{
    // attribute
    String paymentMethod;
    String[] bookingID; // booking id is needed for retriving the booking data for payment.
    // this is an array cuz some user don't just booking only one room.
    String paymentDate; 
    static int paymentId = 0;
    String cardNumber;
    String status;
    private double totalPrice;



    // constructor 1 pay by cash
    Payment(String PaymentMethod, String[] BookingId, double TotalPrice, String PaymentDate){
        paymentId++;
        this.paymentMethod = PaymentMethod;
        this.bookingID = BookingId;
        this.totalPrice = TotalPrice;
        this.paymentDate = PaymentDate; // if they pay by cash, the payment date supposed to be the checkout date.
        this.status = "Pending";
    }
    
    // constructor 2 pay by card 
    Payment(String PaymentMethod, String CardNumber, String PaymentDate, String[] BookingID, String PaymentId, double TotalPrice){
        paymentId++;
        this.paymentMethod = PaymentMethod;
        this.cardNumber = CardNumber;
        this.paymentDate = PaymentDate; // if pay by card the payment date is the date of payment.
        this.bookingID = BookingID;
        this.totalPrice = TotalPrice;
        this.status = "Paid";
    }

    double getTotalPrice(){
        return totalPrice;
    }

}