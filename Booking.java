class Booking {
    // attribute
    String bookingId; // booking id will keep increasing everytime this will be teached next week
    String userName;
    String bookingDate;
    int numberOfRoom;
    int discount;
    String checkInDate;
    String checkOutDate;
    String phoneNumber;
    String roomType; 

    // constructor
    Booking(String inputUserName, String inputPhoneNumber, String inputCheckInDate, String inputCheckOutDate, String inputRoomType, int inputNumberOfRoom, int inputDiscount, String inputBookingDate){
        userName = inputUserName;
        phoneNumber = inputPhoneNumber;
        checkInDate = inputCheckInDate;
        checkOutDate = inputCheckOutDate;
        roomType = inputRoomType;
        discount = inputDiscount;
        bookingDate = inputBookingDate;
    }

}
