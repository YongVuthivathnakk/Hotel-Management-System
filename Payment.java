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
    Payment(){
        status = "Pending";
    }
    
    // constructor 2 pay by card 
    Payment(String inputPaymentMethod, String inputCardNumber, String paymentDate, String[] bookingID, double inputPrice){
        cardNumber = inputCardNumber;
        status = "Paid";
    }

    

}