import java.util.ArrayList;

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
    static ArrayList<Booking> bookingList = new ArrayList<Booking>(); 

    // array list to store individual user booking history
    static ArrayList<Booking> individualUser = new ArrayList<Booking>();

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

        bookingList.add(this);
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
        result = prime * result + bookingId;
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        result = prime * result + ((bookingDate == null) ? 0 : bookingDate.hashCode());
        result = prime * result + numberOfRoom;
        result = prime * result + discount;
        result = prime * result + ((checkInDate == null) ? 0 : checkInDate.hashCode());
        result = prime * result + ((checkOutDate == null) ? 0 : checkOutDate.hashCode());
        result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
        result = prime * result + ((roomType == null) ? 0 : roomType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Booking other = (Booking) obj;
        if (bookingId != other.bookingId)
            return false;
        if (userName == null) {
            if (other.userName != null)
                return false;
        } else if (!userName.equals(other.userName))
            return false;
        if (bookingDate == null) {
            if (other.bookingDate != null)
                return false;
        } else if (!bookingDate.equals(other.bookingDate))
            return false;
        if (numberOfRoom != other.numberOfRoom)
            return false;
        if (discount != other.discount)
            return false;
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
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        } else if (!phoneNumber.equals(other.phoneNumber))
            return false;
        if (roomType == null) {
            if (other.roomType != null)
                return false;
        } else if (!roomType.equals(other.roomType))
            return false;
        return true;
    }

    static void checkIfUserHasMultipleBookings(String name, String checkInDate, String checkOutDate) {
        Booking temp = new Booking(name, "", checkInDate, checkOutDate, "", 0, 0, checkOutDate);
        
        for (Booking b : bookingList) {
            if (b.equals(temp)) {  // Uses the overridden equals method
                if (!individualUser.contains(b)) {  // Avoid duplicates
                    individualUser.add(b);
                }
            }
        }
    }
    
    
    

    // equals
    // in here i want to use equal to check the object in bookingList by name and see if the condition follow this:
    // if the same user has multiple booking, that the checkin and checkout date are the same, store the booking ID of that object in the arraylist. The purpose of doing this so that we can use that data for payment.
    
    

    // Equal is used in order to compare the meaning     

    
    

    // problem1 since there are no price in booking class, so how can we get the price for each booking to sum the total price.

    // problem2 fix the access control of discount attribute, neither public nor private fit for this attribute since it should be able to do some checking before allowing the use the discount, cuz if there are no checking, the user could just enter the discount for 100% and they pay for nothing so we should fix this problem.
} 

