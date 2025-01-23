import java.util.Scanner;
public class testingPayment {
    public static void main(String[] args) {
        String cardNumber;
        String paymentMethod;
        Scanner readInput = new Scanner(System.in);

        System.out.print("Enter your payment method cash or card: ");
        paymentMethod = readInput.nextLine();
        
        if (paymentMethod.equals("cash")) {
            Payment payment1 = new Payment();
            System.out.println("The payment method is: " + paymentMethod);
            System.out.println("The card number is: " + payment1.status);
        }
        
        else if (paymentMethod.equals("card")){
            System.out.print("Enter your card number: ");
            cardNumber = readInput.nextLine();
            Payment payment1 = new Payment(cardNumber);
            System.out.println("The payment method is: "+ paymentMethod);
            System.out.println("The card number is: " + payment1.cardNumber);
            System.out.println("The payment method is: " + payment1.status);
        }
        else{
            System.out.println("Invalid input");
        }
     
        
        
        readInput.close();
    }
}
