class Booking {
    // attribute
    String userName;
    String bookingId;
    String date;
    int numberOfRoom;
    int numberOfAdultGuest;
    int numberOfKidGuest;
    int discount;
    double price;
    String phoneNumber;

    // constructor
    Booking(String inputUserName, String inputPhoneNumber){
        userName = inputUserName;
        phoneNumber = inputPhoneNumber;
    }
}
