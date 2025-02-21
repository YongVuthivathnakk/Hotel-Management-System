import java.util.ArrayList;
import java.util.HashMap;

public class Booking implements Display {
    private static int totalBookingId = 1;
    private int bookingId;
    private String userName;
    private String phoneNumer; 
    ArrayList<String> roomTypes = new ArrayList<String>();
    ArrayList<Integer> roomQuantites = new ArrayList<Integer>();
    private int discount;
    private String bookingDate;
    private String checkInDate;
    private String checkOutDate;
    ArrayList<String> services = new ArrayList<String>();
    ArrayList<String> serviceQuantities = new ArrayList<String>();

    private static HashMap <Integer, Booking> bookingList = new HashMap<Integer, Booking>();

    public Booking(String userName, String phoneNumer, ArrayList<String> roomTypes, ArrayList<Integer> roomQuantites, int discount, String checkInDate, String checkOutDate, ArrayList<String> services, ArrayList<String> serviceQuantities) {
        this.bookingId = totalBookingId++;
        this.userName = userName;
        this.phoneNumer = phoneNumer;
        this.roomTypes = roomTypes;
        this.roomQuantites = roomQuantites;
        this.discount = discount;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.services = services;
        this.serviceQuantities = serviceQuantities;
        this.bookingDate = Time.currentDate();
    
        bookingList.put(this.bookingId, this);
    }

    public static int getTotalBookingId() {
        return totalBookingId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumer() {
        return phoneNumer;
    }

    public ArrayList<String> getRoomTypes() {
        return roomTypes;
    }

    public ArrayList<Integer> getRoomQuantites() {
        return roomQuantites;
    }

    public int getDiscount() {
        return discount;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public ArrayList<String> getServices() {
        return services;
    }

    public ArrayList<String> getServiceQuantities() {
        return serviceQuantities;
    }

    public static HashMap<Integer, Booking> getBookingList() {
        return bookingList;
    }

    @Override
    public String toString() {
        return "                            Booking Information                                    " + "\n" + 
               "-----------------------------------------------------------------------------------" + "\n" + 
               "Booking ID: " + getBookingId() + "\t\t\t" + "Booking date: " + getBookingDate() + "\n" +
               "Customer name: " + getUserName() + "\t\t" + "Customer phone number: " + getPhoneNumer() + "\n" +
               "Check-in date: " + getCheckInDate() + "\t\t" + "Check-out date: " + getCheckOutDate() + "\n" +
               "Room / Service" + "\t\t\t" + "Qty" + "\t" + "Price Per Unit" + "\t" + "Price" + "\n" +
               getRoomTypes() + "\t\t\t" + getRoomQuantites() + "\t\t\t";

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((roomTypes == null) ? 0 : roomTypes.hashCode());
        result = prime * result + ((checkInDate == null) ? 0 : checkInDate.hashCode());
        result = prime * result + ((checkOutDate == null) ? 0 : checkOutDate.hashCode());
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
        if (roomTypes == null) {
            if (other.roomTypes != null)
                return false;
        } else if (!roomTypes.equals(other.roomTypes))
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
        return true;
    }

    
    // double subRoomTotalPrice(){
        
    // }
    
    
    // double subServiceTotalPrice(){
        
    // }
    
    // double subTotal(){
        
    // }
    
    @Override
    public void display() {
        // TODO Auto-generated method stub
        
    } 
    
    
    
    
}