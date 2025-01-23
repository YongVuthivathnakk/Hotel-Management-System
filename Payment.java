class Payment{
    // attribute
    String cardNumber;
    String status;

    // constructor 1 pay by cash
    Payment(){
        status = "Pending";
    }
    
    // constructor 2 pay by card 
    Payment(String inputCardNumber){
        cardNumber = inputCardNumber;
        status = "Paid";
    }

}