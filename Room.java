import java.util.HashMap;

public class Room {
    private String roomNumber;
    private String description;
    private int capacity;
    private String roomType;
    private float pricePerNight;
    private boolean isAvailable;
    
    private static int totalRoom = 0;
    private static HashMap<String, Room> roomRegistry = new HashMap<>();
    private static HashMap<String, Float> roomTypePrices = new HashMap<>();

    // Constructor
    public Room(String roomNumber, String roomType, float pricePerNight, String description, int capacity) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
        this.description = description;
        this.isAvailable = true;
        
        roomRegistry.put(roomNumber, this);
        roomTypePrices.putIfAbsent(roomType, pricePerNight);
        totalRoom++;
    }

    // Getters
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
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setters
    public void setPricePerNight(float pricePerNight) {
        if (pricePerNight <= 0) {
            throw new IllegalArgumentException("Price per night must be greater than zero.");
        }
        this.pricePerNight = pricePerNight;
        roomTypePrices.put(this.roomType, pricePerNight);
    }
    
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Static Methods
    public static Room getRoom(String roomNumber) {
        return roomRegistry.get(roomNumber);
    }

    public static boolean removeRoom(String roomNumber) {
        if (roomRegistry.containsKey(roomNumber)) {
            roomRegistry.remove(roomNumber);
            totalRoom--;
            return true;
        }
        return false;
    }

    public static int getTotalRoom() {
        return totalRoom;
    }

    public static void listAllRooms() {
        if (roomRegistry.isEmpty()) {
            System.out.println("No rooms available.");
            return;
        }
        for (Room room : roomRegistry.values()) {
            System.out.println("Room Number: " + room.getRoomNumber() + ", Type: " + room.getRoomType() + 
                               ", Price: " + room.getPricePerNight() + ", Available: " + room.isAvailable());
        }
    }
    
    public static void listRoomTypesAndPrices() {
        if (roomTypePrices.isEmpty()) {
            System.out.println("No room types available.");
            return;
        }
        for (var entry : roomTypePrices.entrySet()) {
            System.out.println("Room Type: " + entry.getKey() + ", Price: " + entry.getValue());
        }
    }

    static {
        new Room("113", "Standard Room", 80, "Standard Room", 2);
        new Room("213", "Standard Room", 80, "Standard Room", 2);
        new Room("313", "Standard Room", 80, "Standard Room", 2);
        
        new Room("101", "Deluxe Room", 120, "Deluxe Room", 3);
        new Room("201", "Deluxe Room", 120, "Deluxe Room", 3);
        new Room("301", "Deluxe Room", 120, "Deluxe Room", 3);
        
        new Room("110", "Suite", 200, "Suite", 4);
        new Room("210", "Suite", 200, "Suite", 4);
        new Room("310", "Suite", 200, "Suite", 4);
        
        new Room("111", "Family Room", 150, "Family Room", 5);
        new Room("211", "Family Room", 150, "Family Room", 5);
    }
}
