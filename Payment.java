class Payment{
    // attribute
    String paymentMethod;
    String[] bookingID; // booking id is needed for retriving the booking data for payment.
    // this is an array cuz some user doesn't just booking only one room.
    String paymentDate; 
    String paymentId;
    String cardNumber;
    String status;
    double totalPrice;

    // constructor 1 pay by cash
    Payment(String inputPaymentMethod, String[] inputBookingId, double inputTotalPrice, String inputPaymentId){
        paymentId = inputPaymentId;
        paymentMethod = inputPaymentMethod;
        bookingID = inputBookingId;
        totalPrice = inputTotalPrice;
        status = "Pending";
    }
    
    // constructor 2 pay by card 
    Payment(String inputPaymentMethod, String inputCardNumber, String inputPaymentDate, String[] inputBookingID, double inputTotalPrice, String inputPaymentId){
        paymentId = inputPaymentId;
        paymentMethod = inputPaymentMethod;
        cardNumber = inputCardNumber;
        paymentDate = inputPaymentDate;
        bookingID = inputBookingID;
        totalPrice = inputTotalPrice;
        status = "Paid";
    }

    

}