package Booking;

import java.util.ArrayList;
import java.util.HashMap;

import Room.Room;
import TimeGenerator.Time;

public class Booking {
    protected static int totalBookingId = 0;
    protected int bookingId;
    protected String userName;
    protected String phoneNumber; 
    protected ArrayList<RoomBooking> rooms;
    protected int discount;
    protected String bookingDate;
    protected String checkInDate;
    protected String checkOutDate;
    protected ArrayList<ServiceBooking> services;

    protected static HashMap <Integer, Booking> bookingList = new HashMap<Integer, Booking>();

    public Booking(String userName, String phoneNumber, int discount, String checkInDate, String checkOutDate) {
        this.bookingId = ++totalBookingId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.rooms = new ArrayList<>();
        this.discount = discount;
        this.bookingDate = Time.currentDate();
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.services = new ArrayList<>();
        
        bookingList.put(this.bookingId, this);
    }

    public void addNewBookingRoom(String roomTypes, int roomQuantites){
        RoomBooking room = new RoomBooking(roomTypes, roomQuantites);
        rooms.add(room);
        
    }

    public void addNewService (String serviceName, int serviceQuantites){
        ServiceBooking service = new ServiceBooking(serviceName, serviceQuantites);
        services.add(service);

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<RoomBooking> getRooms() {
        return rooms;
    }

    public ArrayList<ServiceBooking> getServices() {
        return services;
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

    public static HashMap<Integer, Booking> getBookingList() {
        return bookingList;
    }



    
   public static void setTotalBookingId(int totalBookingId) {
        Booking.totalBookingId = totalBookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRooms(ArrayList<RoomBooking> rooms) {
        this.rooms = rooms;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setServices(ArrayList<ServiceBooking> services) {
        this.services = services;
    }

    public static void setBookingList(HashMap<Integer, Booking> bookingList) {
        Booking.bookingList = bookingList;
    }

@Override
    public String toString() {
        StringBuilder roomDetails = new StringBuilder();
        StringBuilder serviceDetails = new StringBuilder();
        
        for (RoomBooking room : rooms) {
            roomDetails.append(room.getRoomType())  
                    .append(",")
                    .append(room.getroomQuantites()) 
                    .append(",");  
        }

        for (ServiceBooking service : services) {
            roomDetails.append(service.getService())  
                    .append(",")
                    .append(service.getServiceQuantities())
                    .append(","); 
        }


        return 
            
            getBookingId() + "," + getUserName() + "," + getPhoneNumber() + "," + getBookingDate() + "," + getCheckInDate() + ","  + getBookingDate() + "," + getCheckOutDate() + "," + roomDetails.toString() + "," + serviceDetails.toString();
}

// Booking ID,Customer name,Customer phone number, Room, RoomQty, Room Price Per Unit, Room Price, Service, ServiceQty, Service Price Per Unit, Service price, Booking date, Check-in date, Check-out date,
        
    
     
    
    // public double subRoomTotalPrice(){

    //     return ;
    // }
    
    
    // double subServiceTotalPrice(){
        
    // }
    
    // double subTotal(){
        
    // }

    // double netTotal(){}
    
    
}