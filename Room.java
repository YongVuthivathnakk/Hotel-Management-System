public class Room {
    private int roomNumber;
    private String roomType;
    private float  pricePerNight;
    private boolean isAvailable;

    public Room(int roomNumber, String roomType, float pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;
    }
}
    