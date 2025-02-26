public class PayByCreditCard implements PaymentMethod{
    
    
    String cardNumber;

    public void getCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double totalPrice) {
        System.out.println("The total price is: " + totalPrice);
        System.out.println("Payment is using this card: " + cardNumber);
        System.out.println("The payment is completed successfully");
        
    }

    @Override
    public String paymentType() {
        return "Credit Card";
    }

    

     
    
}
