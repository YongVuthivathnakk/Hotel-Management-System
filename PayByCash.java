public class PayByCash implements PaymentMethod{


    double recievedCash;
    
    public void getCash(double receivingCash)
    {
        this.recievedCash = receivingCash;
    }


    @Override
    public void pay(double netTotal) {
        System.out.println("The total price is: $" + netTotal);
        System.out.println("Accpeted Cash is: $" + recievedCash);
        System.out.println("The change is: $" + (recievedCash - netTotal));
        System.out.println("The payment is completed sucessfully");
        
    }


    @Override
    public String paymentType()  {
        return "Cash";
    }
   
}

