package Room;

public class FamilyRoom extends Room implements Upgradable {
    // Default constructor
    public FamilyRoom(int roomNumber) {
        super(roomNumber, "Family Room", 5, 220, "A family-friendly room with more space and multiple beds.");
    }

    // Flexible constructor
    public FamilyRoom(int roomNumber, int capacity, double pricePerNight, String description) {
        super(roomNumber, "Family Room", capacity, pricePerNight, description);
    }

    @Override
    public String getFullDescription() {
        return "Family Room: " + getDescription() + ", Capacity: " + getCapacity() + ", Price per night: $" + getPricePerNight();
    }

    @Override
    public Room upgrade(double extraPayment) {
        double upgradeCost = 80.0; // Configurable upgrade cost
        if (extraPayment >= upgradeCost) {
            // Remove from Family Room list
            roomNumbersForEachRoomType.get("Family Room").remove((Integer) getRoomNumber());
            
            // Create upgraded room
            Room upgradedRoom = new VIPRoom(getRoomNumber());
            
            // Add to VIP Room list
            roomNumbersForEachRoomType.get("VIP Room").add(getRoomNumber());
            
            return upgradedRoom;
        }
        return this; // Return the current room if upgrade fails
    }
}