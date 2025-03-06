package Booking;

public class RoomBooking {
    protected String roomType;
    protected int roomQuantites;

    RoomBooking(String roomType, int roomQuantites){
        this.roomType = roomType;
        this.roomQuantites = roomQuantites;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getroomQuantites() {
        return roomQuantites;
    }

    
}


