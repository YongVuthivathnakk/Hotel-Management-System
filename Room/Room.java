package Room;
import java.util.HashMap;

public abstract class Room { // abstract here is used for preventing from create Room room1 = new Room();
    protected String description;  
    protected int capacity;
    protected String roomType;
    protected double pricePerNight;
    protected int roomNumber;

    protected static HashMap<Integer, Room> roomList = new HashMap<>();    
    
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
    
    public static double getPricePerNightOfRoom(int roomNumber){
        Room room = roomList.get(roomNumber);
        if (room != null) {
            return room.pricePerNight;   
        }
        else{
            System.out.println(roomList + "is not exists");
            return -1;
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public static HashMap<Integer, Room> getRoomList() {
        return roomList;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public static void setRoomList(HashMap<Integer, Room> roomList) {
        Room.roomList = roomList;
    }

    public static void assigningnNewRoom (String roomType, int roomNumber){
        if(roomList.containsKey(roomNumber)){
            Room assignedRoom = roomList.get(roomNumber);
            System.out.println("This room number" + roomNumber + "is already assigned to : " + assignedRoom);
        }  
        
        Room newRoom = null;
        switch (roomType.toLowerCase()) {
            case "standard room":
                newRoom = new StandardRoom();
                newRoom.roomNumber = roomNumber;
                break;
            case "deluxe room":
                newRoom =  new DeluxeRoom();
                newRoom.roomNumber = roomNumber;
                break;
            case "family room": 
                newRoom = new FamilyRoom();
                newRoom.roomNumber = roomNumber;
                break;
            case "suite":
                newRoom =  new Suite();
                newRoom.roomNumber = roomNumber;
                break;
            default:
                System.out.println("This room type doesn't available in the system");
        }
        
        roomList.put(roomNumber, newRoom);
        System.out.println("The room type is: " + roomType);
        System.out.println("The room number is : " + roomNumber);
        System.out.println("New room is assigned successfully");
        
    }

    

    @Override
    public String toString() {
        return  roomType  + "," + roomNumber + "," + capacity + "," + pricePerNight + ",";
                
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Room other = (Room) obj;
        if (roomNumber != other.roomNumber)
            return false;
        return true;
    }

    
    
    
}
