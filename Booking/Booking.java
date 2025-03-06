package Booking;

import java.util.ArrayList;
import java.util.HashMap;

import TimeGenerator.Time;

public class Booking {
    private static int totalBookingId = 0;
    private int bookingId;
    private String userName;
    private String phoneNumber; 
    private ArrayList<RoomBooking> rooms = new ArrayList<RoomBooking>();
    private int discount;
    private String bookingDate;
    private String checkInDate;
    private String checkOutDate;
    private ArrayList<ServiceBooking> services = new ArrayList<ServiceBooking>();

    private static HashMap <Integer, Booking> bookingList = new HashMap<Integer, Booking>();

    public Booking(String userName, String phoneNumer, ArrayList<RoomBooking> rooms, int discount, String checkInDate, String checkOutDate, ArrayList<ServiceBooking> services) {
        this.bookingId = ++totalBookingId;
        this.userName = userName;
        this.phoneNumber = phoneNumer;
        this.rooms = rooms;
        this.discount = discount;
        this.bookingDate = Time.currentDate();
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.services = services;
        
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

   @Override
    public String toString() {
        StringBuilder roomDetails = new StringBuilder();
        StringBuilder serviceDetails = new StringBuilder();
        
        for (RoomBooking room : rooms) {
            roomDetails.append(room.getRoomType())  
                    .append("\t\t")
                    .append(room.getroomQuantites()) 
                    .append("\n");  
        }

        for (ServiceBooking service : services) {
            roomDetails.append(service.getService())  
                    .append("\t\t")
                    .append(service.getServiceQuantities())
                    .append("\n"); 
        }


        return "                            Booking Information                                    " + "\n" + 
            "-----------------------------------------------------------------------------------" + "\n" + 
            "Booking ID: " + getBookingId() + "\t\t\t" + "Booking date: " + getBookingDate() + "\n" +
            "Customer name: " + getUserName() + "\t\t" + "Customer phone number: " + getPhoneNumber() + "\n" +
            "Check-in date: " + getCheckInDate() + "\t" + "Check-out date: " + getCheckOutDate() + "\n" +
            "Room / Service" + "\t\t\t" + "Qty" + "\t" + "Price Per Unit" + "\t" + "Price" + "\n" +
            roomDetails.toString() + "\n" +
            serviceDetails.toString();
}


        
    
     
    
    // public double subRoomTotalPrice(){

    //     return ;
    // }
    
    
    // double subServiceTotalPrice(){
        
    // }
    
    // double subTotal(){
        
    // }

    // double netTotal(){}
    
    
}