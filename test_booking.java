public class test_booking {
    public static void main(String[] args) {
        Booking booking1 = new Booking("John", "0123456789", "2021-12-01", "2021-12-03", "Single", 1, 0, "2021-11-30");
        
        System.out.println("Username: " +booking1.userName);
        System.out.println("Booking ID: " + Booking.bookingId);
        

        Booking booking2 = new Booking("Jane", "0123456789", "2021-12-01", "2021-12-03", "Single", 1, 0, "2021-11-30");
        System.out.println("Username: " +booking2.userName);
        System.out.println("Booking ID: " + Booking.bookingId);
    }
}
