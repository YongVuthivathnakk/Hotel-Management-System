public class Room {
    private String roomNumber;
    private String description;
    private int capacity;
    private String roomType;
    private float pricePerNight;
    private boolean isAvailable;
    
    private static int totalRoom = 0;

    // Constructor
    public Room(String roomNumber, String roomType, float pricePerNight, String description, int capacity) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
        this.description = description;
        this.isAvailable = true;

        totalRoom++;
    }
    //Getter and Setter
    public String getRoomNumber() {
        return roomNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public float getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(float pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public static int getTotalRoom() {
        return totalRoom;
    }
}

