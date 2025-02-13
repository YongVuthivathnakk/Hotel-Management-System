import java.util.Scanner;
public class paymentMain{
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int bookingId, amountOfBookingId;
        
        System.out.print("Enter how many booking you want to want to include in this payment: ");
        amountOfBookingId = scanner.nextInt();
        for(int i = 0; i < amountOfBookingId; i++){
            System.out.print("Enter the bookingID that you want to pay: ");
            bookingId = scanner.nextInt();
            TotalPriceCalculation.BookingIds.add(bookingId);
            
        }

        Payment payment = new Payment("Cash");
        System.out.println(Payment.paymentList.get(1));
        System.out.println("----------------------------");
        payment.paymentProcess();
        
       
        
        scanner.close();
    }
}
