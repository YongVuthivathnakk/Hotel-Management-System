package Room;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoomInitializer {
    public static List<Room> createRooms() {
        System.out.println("Creating Rooms...");
        List<Room> rooms = new ArrayList<>();

        try {
            // Clear the file before saving new data
            clearRoomDataFile();

            // Standard Rooms (101-105)
            for (int i = 101; i <= 105; i++) {
                Room room = new StandardRoom(i);
                rooms.add(room);
                room.saveRoomData();  // Save room data to file
                System.out.println("Created Standard Room: " + i); // Debugging
            }

            // Deluxe Rooms (201-205)
            for (int i = 201; i <= 205; i++) {
                Room room = new DeluxeRoom(i);
                rooms.add(room);
                room.saveRoomData();
                System.out.println("Created Deluxe Room: " + i); // Debugging
            }

            // Suite Rooms (301-305)
            for (int i = 301; i <= 305; i++) {
                Room room = new Suite(i);
                rooms.add(room);
                room.saveRoomData();
                System.out.println("Created Suite: " + i); // Debugging
            }

            // Family Rooms (401-405)
            for (int i = 401; i <= 405; i++) {
                Room room = new FamilyRoom(i);
                rooms.add(room);
                room.saveRoomData();
                System.out.println("Created Family Room: " + i); // Debugging
            }

            // VIP Rooms (501-505)
            for (int i = 501; i <= 505; i++) {
                Room room = new VIPRoom(i);
                rooms.add(room);
                room.saveRoomData();
                System.out.println("Created VIP Room: " + i); // Debugging
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error creating rooms: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }

        System.out.println("Rooms successfully created!");
        return rooms;  // Return the list of rooms
    }

    private static void clearRoomDataFile() {
        String filePath = "roomData.txt";
        File file = new File(filePath);
        System.out.println("File path: " + file.getAbsolutePath()); // Debugging

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write the header
            String header = "roomNumber | roomType | capacity | pricePerNight | description";
            writer.write(header);
            writer.newLine();
            System.out.println("Cleared roomData.txt file and added header."); // Debugging
        } catch (IOException e) {
            System.out.println("Error clearing room data file: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }
}