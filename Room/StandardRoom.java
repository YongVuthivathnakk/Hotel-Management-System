package Room;

public class StandardRoom extends Room implements Upgradable {
    // Default constructor
    public StandardRoom(int roomNumber) {
        super(roomNumber, "Standard Room", 2, 80, "A cozy standard hotel room with basic amenities.");
    }

    // Flexible constructor
    public StandardRoom(int roomNumber, int capacity, double pricePerNight, String description) {
        super(roomNumber, "Standard Room", capacity, pricePerNight, description);
    }

    @Override
    public String getFullDescription() {
        return "Standard Room: " + getDescription() + ", Capacity: " + getCapacity() + ", Price per night: $" + getPricePerNight();
    }

    @Override
    public Room upgrade(double extraPayment) {
        double upgradeCost = 40.0; // Configurable upgrade cost
        if (extraPayment >= upgradeCost) {
            // Remove from Standard Room list
            roomNumbersForEachRoomType.get("Standard Room").remove((Integer) getRoomNumber());
            
            // Create upgraded room
            Room upgradedRoom = new DeluxeRoom(getRoomNumber());
            
            // Add to Deluxe Room list
            roomNumbersForEachRoomType.get("Deluxe Room").add(getRoomNumber());
            
            return upgradedRoom;
        }
        return this; // Return the current room if upgrade fails
    }
}