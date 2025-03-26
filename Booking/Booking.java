package Booking;

import java.util.ArrayList;
import java.util.HashMap;
import TimeGenerator.Time;
import Rooms.Room;
import Rooms.RoomManager;


public class Booking {
    protected static int totalBookingId = 0;
    protected int bookingId;
    protected String userName;
    protected String phoneNumber; 
    protected ArrayList<RoomBooking> roomRequirement = new ArrayList<>();
    protected HashMap<Integer, Room> rooms;
    protected int discount;
    protected String bookingDate;
    protected String checkInDate;
    protected String checkOutDate;
    protected int roomNumber;
    protected double subTotal;
    protected double netTotal;

    protected static HashMap <Integer, Booking> bookingList = new HashMap<Integer, Booking>();

    public Booking(String userName, String phoneNumber, int discount, String checkInDate, String checkOutDate) {
        this.bookingId = ++totalBookingId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.roomRequirement = new ArrayList<>();
        this.rooms = new HashMap<>();
        this.discount = discount;
        this.bookingDate = Time.currentDate();
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.subTotal = this.subTotal();
        this.netTotal = this.netTotal(subTotal);

        bookingList.put(this.bookingId, this);
    }

    public void addNewBookingRoomRequiement(String roomType, int roomQuantites){
        RoomBooking bookingRoom = new RoomBooking(roomType, roomQuantites);
        roomRequirement.add(bookingRoom);
        System.out.println("Current roomRequirement contents:");
        for (RoomBooking room : roomRequirement) {
            System.out.println(room.getRoomType() + " - " + room.getRoomQuantites());
        }
    }

    public void assignedRoomForGuest(Booking booking){ // this method is not working
        RoomManager.loadRoomData();
        for(RoomBooking roomBooking : booking.roomRequirement){
            int assignedRoomCount = 0;
            for(Room room : Room.getRoomList().values()){
                if (roomBooking.roomType.equals(room.getRoomType()) && !Room.getBookedRooms().containsKey(room.getRoomNumber())) {
                    booking.roomNumber = room.getRoomNumber();
                    Room.getBookedRooms().put(room.getRoomNumber(), room);
                    assignedRoomCount++;
                    if (assignedRoomCount == roomBooking.getRoomQuantites()) {
                        break;
                    }
                }

                if(assignedRoomCount <= roomBooking.getRoomQuantites()){
                    System.out.println("Only " + assignedRoomCount + " room is successfully assigned");
                }
            }
        }
        for(Room room : Room.getBookedRooms().values()){
            System.out.println(room);
        }
    }

    public double subTotal(){
        double subPrice = 0.0;
        for(RoomBooking roomBooking : roomRequirement){
            subPrice += RoomManager.roomPrice(roomBooking.getRoomType()) * roomBooking.getRoomQuantites();
        }
        return subPrice;
    }

    public double netTotal(double subPrice){
        double netPrice = subPrice - (subPrice * discount / 100);
        return netPrice;
    }
    

    @Override
    public String toString() {
        StringBuilder roomDetails = new StringBuilder();
        StringBuilder roomNumberDetails = new StringBuilder();
        
        for (RoomBooking room : roomRequirement) {
                roomDetails.append(room.getRoomType())  
                .append(", ")
                .append(room.getRoomQuantites()) 
                .append(", ")
                .append(RoomManager.roomPrice(room.getRoomType()))  
                .append("\n");
            
        }

        for(Room room : rooms.values()){
            roomNumberDetails.append(room.getRoomType())
            .append(",")
            .append(room.getRoomNumber())
            .append(",");
        }
        
        return bookingId + "," + userName + "," + phoneNumber + "," + bookingDate + "," + 
        checkInDate + "," + checkOutDate + "," +  discount + "," + roomDetails.toString() + "," + 
        roomNumberDetails.toString() + "," + subTotal() + "," + netTotal(subTotal());
    }
    
    public String printingReceipe(Booking booking){
        StringBuilder roomDetails = new StringBuilder();
        StringBuilder roomNumberDetails = new StringBuilder();
        
        for (RoomBooking room : roomRequirement) {
                roomDetails.append(room.getRoomType())  
                .append(", ")
                .append(room.getRoomQuantites()) 
                .append(", ")
                .append(RoomManager.roomPrice(room.getRoomType()))  
                .append("\n");
            
        }

        for(Room room : rooms.values()){
            roomNumberDetails.append(room.getRoomType())
            .append(",")
            .append(room.getRoomNumber())
            .append("\n");
        }
        
        return "------------------ Booking Information --------------------\n" +
        "Booking ID: " + bookingId + " | " +
        "Username: " + userName + "\n" +
        "Phone Number: " + phoneNumber + " | " +
        "Booking Date: " + bookingDate + "\n" +
        "Check-in Date: " + checkInDate + " | " +
        "Check-out Date: " + checkOutDate + "\n" +
        "-------------------------------------------------------------\n" +
        "Room info: \n" + roomDetails.toString() +
        "Room Number: \n" + roomNumberDetails.toString() + "\n" + 
        "-------------------------------------------------------------\n" + 
        "Sub total: " + subTotal() + "\n" + 
        "Discount: " + discount + "\n" + 
        "Net total: " + netTotal(subTotal()) + "\n";
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
        if (roomNumber != other.roomNumber)
        return false;
        return true;
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
    

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }


    public static void setBookingList(HashMap<Integer, Booking> bookingList) {
        Booking.bookingList = bookingList;
    }


    public ArrayList<RoomBooking> getRoomRequirement() {
        return roomRequirement;
    }

    public void setRoomRequirement(ArrayList<RoomBooking> roomRequirement) {
        this.roomRequirement = roomRequirement;
    }

    public HashMap<Integer, Room> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, Room> rooms) {
        this.rooms = rooms;
    }
    
}