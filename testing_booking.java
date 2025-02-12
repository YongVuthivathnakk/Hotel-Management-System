public class testing_booking {
    public static void main(String[] args) {
        Booking b1 = new Booking("alice", "010293842", "25/Jun/2024", "27/Jun/2024", "Room A", 1, 0, "11/Feb/2024");
        Booking b2 = new Booking("alice", "010293842", "25/Jun/2024", "27/Jun/2024", "Room B", 1, 10, "11/Feb/2024");
        Booking b3 = new Booking("Chirst", "010293842", "25/Jun/2024", "27/Jun/2024", "Room B", 1, 20, "11/Feb/2024");
        // for(int i = 0; i < Booking.bookingList.size(); i++){
        //     System.out.println(Booking.bookingList.get(i));
        // }

        Booking.checkIfUserHasMultipleBookings("alice", "25/Jun/2024", "27/Jun/2024");
        System.out.println("Booking that made the username: alice");
        for(int i = 0; i < Booking.individualUser.size(); i++){
            System.out.println(Booking.individualUser.get(i));
        }


        // System.out.println("The current individual user array list is : " + Booking.individualUser.size());
        
        // System.out.println("the current arraylist size is: " + (Booking.bookingList.size() - Booking.individualUser.size()));
        // System.out.println("The total booking is: " + (Booking.Totalbooking - 1));
    }
}
