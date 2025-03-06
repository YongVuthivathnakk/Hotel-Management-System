package Payment;

import java.util.InputMismatchException;
import java.util.Scanner;

import CustomException.BelowOrOverLimitException;
import Data.WriteToFile;
import UserDefinedException.DoubleOnlyException;
import UserDefinedException.IntegerOnlyException;
import UserDefinedException.WrongCharacterException;

import java.io.Writer;
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
        ArrayList<String[]> loadPaymentData = new ArrayList<>();
        // ---------- variable -------------

        // ----------  temp variable -------------
        String input = "-1";
        // ----------  temp variable -------------
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {                
                System.out.print("Enter the booking ID or 0 to exit: ");
                input = scanner.nextLine();

                IntegerOnlyException numberOnly = new IntegerOnlyException(input, "^[0-9]+$");
                if (input.equals("0")) {
                    break;
                }
                else{
                    bookingId.add(Integer.parseInt(input));
                }
            
                if (input.equals("0")) {
                    break;
                }
            } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
            }
            
        }

        while(true){
            try {
                System.out.print("Enter the total price: ");
                input = scanner.nextLine();

                DoubleOnlyException doubleOnly = new DoubleOnlyException(input, "^-?\\d+(\\.\\d+)?$");
                totalPrice = Double.parseDouble(input);
                break;
            } catch (DoubleOnlyException e) {
               System.out.println(e.getMessage());
            }
        }

        
        while (true) {            
            try {
                System.out.println("Payment method");
                System.out.println("1. Cash");
                System.out.println("2. Credit Card");
                System.out.print("Select your payment method: ");
                input = scanner.nextLine();
                IntegerOnlyException intOnly = new IntegerOnlyException(input, "^[12]$", "Please enter either number 1 or 2.");
                PaymentMethodNumber = Integer.parseInt(input);
                break;
            } catch (IntegerOnlyException e){
                System.out.println(e.getMessage());   
            }
        }
                
        if (PaymentMethodNumber == 1) {                 
            while (true) {
                try {
                    System.out.print("Enter the accepted cash: ");
                    input = scanner.nextLine();

                    DoubleOnlyException doubleOnly = new DoubleOnlyException(input, "^-?\\d+(\\.\\d+)?$");
                    acceptedCash = Integer.parseInt(input);
                    break;
                } catch (DoubleOnlyException e) {
                    System.out.println(e.getMessage());
                }
            }
            Payment cashPayment = new Payment(bookingId, acceptedCash, totalPrice);
            Payment.getPaymentList().put(cashPayment.getPaymentId(), cashPayment);
            WriteToFile.writer("Data/Payment.txt", Payment.getPaymentList());
            System.out.println(cashPayment);
        }
        else{
            while (true) {
                try {
                    System.out.println("Enter the card number: ");
                    input = scanner.nextLine();

                    WrongCharacterException wrongCharacter = new WrongCharacterException(input, "^(\\d{4}[-]?){3}\\d{4}$", "Please enter the card number in this format: XXXX-XXXX-XXXX-XXXX");
                    cardNumber = input;
                    break;
                } catch (WrongCharacterException e) {
                    System.out.println(e.getMessage());
                }
            }
            
            Payment cardPayment = new Payment(bookingId, cardNumber, totalPrice);
            Payment.getPaymentList().put(cardPayment.getPaymentId(), cardPayment);
            WriteToFile.writer("Data/Payment.txt", Payment.getPaymentList());
            System.out.println(cardPayment);
        }
        
        scanner.close();
    }

}
