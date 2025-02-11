class Booking {
    // attribute
    static int Totalbooking = 0;
    int bookingId;
    String userName;
    String bookingDate;
    int numberOfRoom;
    int discount;
    String checkInDate;
    String checkOutDate;
    String phoneNumber;
    String roomType; 

    // constructor
    Booking(String userName, String phoneNumber, String checkInDate, String checkOutDate, String roomType, int numberOfRoom, int discount, String bookingDate){
        this.bookingId = Totalbooking++;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomType = roomType;
        this.discount = discount;
        this.bookingDate = bookingDate;
    }

}
