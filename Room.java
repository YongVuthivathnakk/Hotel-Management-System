public class Room {
    private String roomNumber;
    private String description;
    private int capacity;
    private String roomType;
    private float  pricePerNight;
    private boolean isAvailable;


    public Room(String roomNumber, String roomType, float pricePerNight , String description, int capacity) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
        this.description = description;
        this.isAvailable = true;
    }
}
    