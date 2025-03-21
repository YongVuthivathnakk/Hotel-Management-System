package Booking;

import java.util.Map;


public class RoomBooking {
    protected String roomType;
    protected int roomQuantites;
    protected int roomNumber;
    
    
    public RoomBooking(String roomType, int roomQuantites){
        this.roomType = roomType;
        this.roomQuantites = roomQuantites;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRoomQuantites() {
        return roomQuantites;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomQuantites(int roomQuantites) {
        this.roomQuantites = roomQuantites;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }



    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RoomBooking other = (RoomBooking) obj;
        if (roomNumber != other.roomNumber)
            return false;
        return true;
    }    
}


