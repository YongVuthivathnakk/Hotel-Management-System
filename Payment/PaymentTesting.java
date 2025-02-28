package Payment;

import java.util.InputMismatchException;
import java.util.Scanner;

import CustomException.BelowOrOverLimitException;

import java.util.ArrayList;


public class PaymentTesting {
    public static void main(String[] args) {

        // ---------- variable -------------
        int bookingIdTemp = 1;
        ArrayList<Integer> bookingId = new ArrayList<Integer>();
        double totalPrice;
        int PaymentMethodNumber = 0;
        double acceptedCash = 0;
        String cardNumber;
        // ---------- variable -------------
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            try {
                while (bookingIdTemp != 0 ) {
                    System.out.print("Enter the booking ID or 0 to finish : ");
                    bookingIdTemp = scanner.nextInt();
                    if (bookingIdTemp != 0) {
                        bookingId.add(bookingIdTemp);
                    }
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter integer number!");
                scanner.nextLine();
            }
        
        }

        while(true){
            try {
                System.out.print("Enter the total price: ");
                totalPrice = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
               System.out.println("Please enter either interger or double number!");
               scanner.nextLine();
            }
        }

        
        while (true) {            
            try {
                System.out.println("Payment method");
                System.out.println("1. Cash");
                System.out.println("2. Credit Card");
                System.out.print("Select your payment method: ");
                PaymentMethodNumber = scanner.nextInt();

                if (PaymentMethodNumber < 1 || PaymentMethodNumber > 2) {
                    throw new BelowOrOverLimitException("We have only two payment methods. Please enter either 1 or 2");
                }
                break;
            } catch (InputMismatchException e){
                System.out.println("Please enter the integer number!");
                scanner.nextLine();
            } catch (BelowOrOverLimitException e){
                System.out.println(e.getMessage());
            }
        }
                
        if (PaymentMethodNumber == 1) {                 
            while (true) {
                try {
                    System.out.print("Enter the accepted cash: ");
                    acceptedCash = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter either interger or double number!");
                    scanner.nextLine();
                }
            }
            Payment cashPayment = new Payment(bookingId, acceptedCash, totalPrice);
            System.out.println(cashPayment);
        }
        else{
            scanner.nextLine();
            System.out.println("Enter the card number: ");
            cardNumber = scanner.nextLine();
            Payment cardPayment = new Payment(bookingId, cardNumber, totalPrice);
            System.out.println(cardPayment);
        }
        
        scanner.close();
    }

}
