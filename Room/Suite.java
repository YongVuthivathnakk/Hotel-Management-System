package Room;

public class Suite extends Room implements Upgradable {
    // Default constructor
    public Suite(int roomNumber) {
        super(roomNumber, "Suite", 4, 180, "A luxurious suite with separate living area and extra facilities.");
    }

    // Flexible constructor
    public Suite(int roomNumber, int capacity, double pricePerNight, String description) {
        super(roomNumber, "Suite", capacity, pricePerNight, description);
    }

    @Override
    public String getFullDescription() {
        return "Suite: " + getDescription() + ", Capacity: " + getCapacity() + ", Price per night: $" + getPricePerNight();
    }

    @Override
    public Room upgrade(double extraPayment) {
        double upgradeCost = 70.0; // Configurable upgrade cost
        if (extraPayment >= upgradeCost) {
            // Remove from Suite list
            roomNumbersForEachRoomType.get("Suite").remove((Integer) getRoomNumber());
            
            // Create upgraded room
            Room upgradedRoom = new FamilyRoom(getRoomNumber());
            
            // Add to Family Room list
            roomNumbersForEachRoomType.get("Family Room").add(getRoomNumber());
            
            return upgradedRoom;
        }
        return this; // Return the current room if upgrade fails
    }
}