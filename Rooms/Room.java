package Rooms;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import SQLConnection.MySQLConnection;

public abstract class Room { // abstract here is used for preventing from create Room room1 = new Room();
    protected String description;  
    protected int capacity;
    protected String roomType;
    protected double pricePerNight;
    protected int roomNumber;

    protected static HashMap<Integer, Room> roomList = new HashMap<>();    
    protected static HashMap<Integer, Room> bookedRooms = new HashMap<>();
    
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


    private static boolean isToStringHeaderPrinted = false;
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        if (!isToStringHeaderPrinted) {
            string.append("Room Type, Room Number, Capacity, Price Per Night , Status\n");
            isToStringHeaderPrinted = true; 
        }

        string.append(roomType).append(",").append(roomNumber).append(",").append(capacity).append(",").append(pricePerNight).append(",");
        return string.toString();
                
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

    public static HashMap<Integer, Room> getBookedRooms() {
        return bookedRooms;
    }

    public static void setBookedRooms(HashMap<Integer, Room> bookedRooms) {
        Room.bookedRooms = bookedRooms;
    }

    public static void insertIntoRoomDatabase(){
        String sql = "INSERT INTO ROOM(ROOMTYPE, ROOMNUMBER, PRICEPERNIGHT, CAPACITY) VALUES(?,?,?,?)";
        try {
            PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(sql); 
            for (Room room: roomList.values()) {
                System.out.println("Room Number: " + room.roomNumber + ", Room Type: " + room.roomType + ", Price Per Night: " + room.pricePerNight + ", Capacity: " + room.capacity);
                
                preparedStatement.setString(1, room.roomType);
                preparedStatement.setInt(2, room.roomNumber);
                preparedStatement.setDouble(3, room.pricePerNight);
                preparedStatement.setInt(4, room.capacity);
                int insertData = preparedStatement.executeUpdate();
                if (insertData > 0) {
                    System.out.println("inserting new room information into the database successfully");
                }
            }
            

        } catch (SQLException e) {
            System.out.println("Error inserting room into the database");
            e.printStackTrace();
        }
    }

    public static void readFromDatabase(){
        String query = "SELECT * from room";
        Room newRoom = null;
        try (ResultSet selectResult = MySQLConnection.executeQuery(query)) {
        while(selectResult != null && selectResult.next()){
                String roomType = selectResult.getString("roomType");
                int roomNumber = selectResult.getInt("roomNumber");

                switch (roomType.toLowerCase()) {
                    case "standard room":
                        newRoom = new StandardRoom();
                        newRoom.roomNumber = roomNumber;
                        roomList.put(roomNumber, newRoom);
                        break;
                    case "deluxe room":
                        newRoom = new DeluxeRoom();
                        newRoom.roomNumber = roomNumber;
                        roomList.put(roomNumber, newRoom);
                        break;
                    case "family room":
                        newRoom = new FamilyRoom();
                        newRoom.roomNumber = roomNumber;
                        roomList.put(roomNumber, newRoom);
                        break;
                    case "suite":
                        newRoom = new Suite();
                        newRoom.roomNumber = roomNumber;
                        roomList.put(roomNumber, newRoom);
                        break;
                    default:
                        System.out.println("This room type :" + roomType + "doesn't exist");
                        break;
                }
            }
            for (Room room: roomList.values()) {
                System.out.println(room);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateRoomData(){

    }

    
    
    
    
}
