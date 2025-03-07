package Room;

public class DeluxeRoom extends Room implements Upgradable {
    // Default constructor
    public DeluxeRoom(int roomNumber) {
        super(roomNumber, "Deluxe Room", 3, 120, "A spacious deluxe room with additional amenities.");
    }

    // Flexible constructor
    public DeluxeRoom(int roomNumber, int capacity, double pricePerNight, String description) {
        super(roomNumber, "Deluxe Room", capacity, pricePerNight, description);
    }

    @Override
    public String getFullDescription() {
        return "Deluxe Room: " + getDescription() + ", Capacity: " + getCapacity() + ", Price per night: $" + getPricePerNight();
    }

    @Override
    public Room upgrade(double extraPayment) {
        double upgradeCost = 50.0; // Configurable upgrade cost
        if (extraPayment >= upgradeCost) {
            // Remove from Deluxe Room list
            roomNumbersForEachRoomType.get("Deluxe Room").remove((Integer) getRoomNumber());
            
            // Create upgraded room
            Room upgradedRoom = new Suite(getRoomNumber());
            
            // Add to Suite list
            roomNumbersForEachRoomType.get("Suite").add(getRoomNumber());
            
            return upgradedRoom;
        }
        return this; // Return the current room if upgrade fails
    }
}