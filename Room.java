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



    public void setDescription(String description) {
        this.description = description;
    }



    public int getCapacity() {
        return capacity;
    }



    public void setCapacity(int capacity) {
        if (capacity < 2 ) {
            System.out.println("The capacity of room must be at least 2");
        }
        else{
            this.capacity = capacity;
        }
    }



    public String getRoomType() {
        return roomType;
    }



    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }



    public double getPricePerNight() {
        return pricePerNight;
    }



    public void setPricePerNight(double pricePerNight) {
        if(pricePerNight <= 0){
            System.out.println("The price could not be equal or smaller than 0");
        }
        else{
            this.pricePerNight = pricePerNight;
        }
    }

    public HashMap<String, ArrayList<Integer>> getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(HashMap<String, ArrayList<Integer>> roomNumber) {
        this.roomNumber = roomNumber;
    }



    public abstract void assignRoomNumberForEachRoomType();
}
