package Rooms;


public class StandardRoom extends Room {
    public StandardRoom(){ // constructor
        super();
        this.setDescription("Modern standard room with city view");
        this.setCapacity(2);
        this.setRoomType("Standard Room");
        this.setPricePerNight(80);
    }    
}

