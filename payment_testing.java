public class payment_testing {
    public static void main(String[] args) {
        Payment payment1 = new Payment("Cash", new String[]{"1"}, 100.0, "2021-11-30");

        System.out.println("Payment Method: " + payment1.paymentMethod);
        System.out.println("Payment ID is: " + Payment.paymentId);
        System.out.println("Total Price: " + payment1.getTotalPrice());	
        System.out.println("Payment Date: " + payment1.paymentDate);
        System.out.println("Status: " + payment1.status);
        System.out.println("Booking ID: " + payment1.bookingID[0]);
        
        Payment payment2 = new Payment("Card", "1234567890123456", "2021-11-30", new String[]{"1"}, "1", 100.0);
        System.out.println("Payment Method: " + payment2.paymentMethod);
        System.out.println("Payment ID is: " + Payment.paymentId);
        System.out.println("Card Number: " + payment2.getCreditcard());
    }
}
