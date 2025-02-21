import java.util.ArrayList;
import java.util.HashMap;

public abstract class Room {
    protected String description;
    protected int capacity;
    protected String roomType;
    protected double pricePerNight;
    protected HashMap<String, ArrayList<Integer>> roomNumber = new HashMap<>();

    

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


    public HashMap<String, ArrayList<Integer>> getRoomNumber() {
        return roomNumber;
    }


    public abstract void assignRoomNumberForEachRoomType();
}
