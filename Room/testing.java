package Room;

public class testing {
    public static void main(String[] args) {
        // Clear data before loading to prevent duplication
        System.out.println("Cleared roomNumbersForEachRoomType map."); // Debugging
        Room.roomNumbersForEachRoomType.clear();

        // Load previous room data from file
        System.out.println("Loading room data..."); // Debugging
        Room.loadRoomData(); // Load previous data

        // Create and save new rooms
        System.out.println("Creating rooms..."); // Debugging
        RoomInitializer.createRooms(); // Create and save new rooms

        // Display all rooms
        System.out.println("\nRoom Numbers By Type:");
        Room.displayRoomsByType("Standard Room");
        Room.displayRoomsByType("Deluxe Room");
        Room.displayRoomsByType("Suite");
        Room.displayRoomsByType("Family Room");
        Room.displayRoomsByType("VIP Room");
    }
}