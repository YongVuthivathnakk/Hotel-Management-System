package Room;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Room { // abstract here is used for preventing from create Room room1 = new Room();
    protected String description;  
    protected int capacity;
    protected String roomType;
    protected double pricePerNight;
     

    // roomNumbers is needed to store individual room type room numbers because roomNumberForEachRoomType value
    // is ArrayList<Integer>
    protected static HashMap<String, ArrayList<Integer>> roomNumbersForEachRoomType= new HashMap<>();
    protected static HashMap<String, Room> allRoomType = new HashMap<>();    
    
    public String getDescription() {
        return description;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public String getRoomType() {
        return roomType;
    }
    
    
    public double getPricePerNight() {
        return pricePerNight;
    }
    

    public static void addRoomTypes(Room room){
        if (allRoomType.containsKey(room.roomType)) {
            System.out.println("Room Type: " + room.roomType + " is already added.");
        }
        else{
            allRoomType.put(room.roomType, room);
        }
    }
    
    public static double getPricePerNightOfRoom(String roomType){
        Room room = allRoomType.get(roomType);
        if (room != null) {
            return room.pricePerNight;   
        }
        else{
            System.out.println(roomType + "is not exists");
            return -1;
        }
    }
    
    public static void assignRoomNumberForEachRoomType(String roomType, int roomNumber){
        //this means it retrieves the existing list if a room type already has one. 
        ArrayList<Integer> roomNumbers = roomNumbersForEachRoomType.get(roomType); 
        if (roomNumbers == null) {
            roomNumbers = new ArrayList<>();
            roomNumbersForEachRoomType.put(roomType, roomNumbers);
        }

        if(roomNumbers.contains(roomNumber)){
            System.out.println("This room number is already assigned to the specific room type!");
        }
        else{
            roomNumbers.add(roomNumber);
        }

    }

    @Override
    public String toString() {
        return  "--------------------------- Room Information ---------------------------" + "\n" +
                "Room description: " + description + "\n" +
                "Capacity: " + capacity + "\n" +
                "Room type: " + roomType  + "\n" +
                "Price per night: " + pricePerNight + "\n";
    }

    
}
