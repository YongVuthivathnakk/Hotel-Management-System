import java.util.HashMap;

class Booking {
    // attribute
    static int Totalbooking = 1;
    int bookingId;
    String userName;
    String bookingDate;
    int numberOfRoom;
    int discount;
    String checkInDate;
    String checkOutDate;
    String phoneNumber;
    String roomType; 

    // array list to store all the booking history
    static HashMap<Integer,Booking> bookingMap = new HashMap<Integer, Booking>();     

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
        this.numberOfRoom = numberOfRoom;

        bookingMap.put(bookingId, this);
        
    }

    // toString
    @Override
    public String toString() {
        return  "---------------------------------------" + "\n" +
                "Booking information for bookingId:" + bookingId + "\n" + 
                "---------------------------------------" + "\n" +
                "Username: " + userName + "\n" +
                "Booking date: " + bookingDate + "\n" +
                "Number of room: " + numberOfRoom + "\n" +
                "Room type:" + roomType + "\n" + 
                "Discount: " + discount + "%" +"\n" + 
                "Check-in date: " + checkInDate + "\n" +
                "Check-out date: " + checkOutDate + "\n" +
                "Phone number: " + phoneNumber + "\n" +
                "---------------------------------------" + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((checkInDate == null) ? 0 : checkInDate.hashCode());
        result = prime * result + ((checkOutDate == null) ? 0 : checkOutDate.hashCode());
        result = prime * result + ((roomType == null) ? 0 : roomType.hashCode());
        return result;
    }

    @Override // this equals method is use to prevent users booking the same room on the same check in and check out date. By this method if multiple user booking the same room on the same date it will return true.
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Booking other = (Booking) obj;
        if (checkInDate == null) {
            if (other.checkInDate != null)
                return false;
        } else if (!checkInDate.equals(other.checkInDate))
            return false;
        if (checkOutDate == null) {
            if (other.checkOutDate != null)
                return false;
        } else if (!checkOutDate.equals(other.checkOutDate))
            return false;
        if (roomType == null) {
            if (other.roomType != null)
                return false;
        } else if (!roomType.equals(other.roomType))
            return false;
        return true;
    }

    
    // problem1 since there are no price in booking class, so how can we get the price for each booking to sum the total price.

    // problem2 fix the access control of discount attribute, neither public nor private fit for this attribute since it should be able to do some checking before allowing the use the discount, cuz if there are no checking, the user could just enter the discount for 100% and they pay for nothing so we should fix this problem.
    

} 

