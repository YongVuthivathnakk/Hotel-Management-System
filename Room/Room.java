package Room;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Room {
    private int roomNumber;
    private String roomType;
    private int capacity;
    private double pricePerNight;
    private String description;

    protected static HashMap<String, ArrayList<Integer>> roomNumbersForEachRoomType = new HashMap<>();
    protected static HashMap<String, Room> allRoomType = new HashMap<>();

    // Constructor
    public Room(int roomNumber, String roomType, int capacity, double pricePerNight, String description) {
        if (roomNumber < 100) {
            throw new IllegalArgumentException("Room number must be 100 or above.");
        }
        if (pricePerNight <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.description = description;

        roomNumbersForEachRoomType.putIfAbsent(roomType, new ArrayList<>());
        roomNumbersForEachRoomType.get(roomType).add(roomNumber);

        allRoomType.putIfAbsent(roomType, this);
    }

    // Getters
    public int getRoomNumber() { 
        return roomNumber; 
    }
    public String getRoomType() { 
        return roomType; 
    }
    public int getCapacity() { 
        return capacity; 
    }
    public double getPricePerNight() { 
        return pricePerNight; 
    }
    public String getDescription() { 
        return description; 
    }

    // Abstract method for room description (Polymorphism)
    public abstract String getFullDescription();

    // Save room data to text file
    public void saveRoomData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("roomData.txt", true))) {
            String roomInfo = roomNumber + " | " + roomType + " | " + capacity + " | " + pricePerNight + " | " + description.replace(",", ";");
            writer.write(roomInfo);
            writer.newLine();
            System.out.println("Saved Room: " + roomInfo); // Debugging
        } catch (IOException e) {
            System.out.println("Error saving room data: " + e.getMessage());
        }
    }

    // Load room data from text file
    public static void loadRoomData() {
        File file = new File("roomData.txt");
        if (file.length() == 0) {
            System.out.println("The file is empty. No data to load.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isFirstLine = true; // Flag to skip the header

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false; // Skip the header line
                    continue;
                }

                // Skip blank lines
                if (line.trim().isEmpty()) {
                    System.out.println("Skipping blank line."); // Debugging
                    continue;
                }

                // Split the line by the delimiter
                String[] data = line.split(" \\| ");
                if (data.length < 5) {
                    System.out.println("Invalid data format (expected 5 parts, got " + data.length + "): " + line);
                    continue;
                }

                // Process the data
                try {
                    int roomNumber = Integer.parseInt(data[0].trim());
                    String roomType = data[1].trim();
                    int capacity = Integer.parseInt(data[2].trim());
                    double price = Double.parseDouble(data[3].trim());
                    String description = data[4].trim();

                    // Create the room object
                    Room room = null;
                    switch (roomType) {
                        case "Standard Room":
                            room = new StandardRoom(roomNumber, capacity, price, description);
                            break;
                        case "Deluxe Room":
                            room = new DeluxeRoom(roomNumber, capacity, price, description);
                            break;
                        case "Suite":
                            room = new Suite(roomNumber, capacity, price, description);
                            break;
                        case "Family Room":
                            room = new FamilyRoom(roomNumber, capacity, price, description);
                            break;
                        case "VIP Room":
                            room = new VIPRoom(roomNumber, capacity, price, description);
                            break;
                        default:
                            System.out.println("Unknown room type: " + roomType);
                            continue;
                    }

                    // Add the room to the map
                    if (room != null) {
                        allRoomType.put(roomType, room);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing room data: " + line);
                } catch (Exception e) {
                    System.out.println("Unexpected error processing line: " + line);
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading room data: " + e.getMessage());
        }
    }

    // Display all room numbers for a specific type
    public static void displayRoomsByType(String roomType) {
        System.out.println("Room numbers for " + roomType + ": " + roomNumbersForEachRoomType.get(roomType));
    }
}