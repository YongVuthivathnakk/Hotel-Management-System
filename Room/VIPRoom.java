package Room;

public class VIPRoom extends Room implements Upgradable {
    // Default constructor
    public VIPRoom(int roomNumber) {
        super(roomNumber, "VIP Room", 6, 300, "An ultra-luxury VIP room with top-tier services.");
    }

    // Flexible constructor
    public VIPRoom(int roomNumber, int capacity, double pricePerNight, String description) {
        super(roomNumber, "VIP Room", capacity, pricePerNight, description);
    }

    @Override
    public String getFullDescription() {
        return "VIP Room: " + getDescription() + ", Capacity: " + getCapacity() + ", Price per night: $" + getPricePerNight();
    }

    @Override
    public Room upgrade(double extraPayment) {
        throw new UnsupportedOperationException("VIP Room cannot be upgraded further.");
    }
}