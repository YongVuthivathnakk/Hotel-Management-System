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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RoomBooking other = (RoomBooking) obj;
        if (roomType == null) {
            if (other.roomType != null)
                return false;
        } else if (!roomType.equals(other.roomType))
            return false;
        if (roomQuantites != other.roomQuantites)
            return false;
        return true;
    }

    
}


