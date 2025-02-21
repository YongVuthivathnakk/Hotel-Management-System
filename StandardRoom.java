import java.util.ArrayList;

public class StandardRoom extends Room {
    StandardRoom(){
        this.description = "";
        this.capacity = 2;
        this.roomType = "Standard Room";
        this.pricePerNight = 80;
    }

    ArrayList<Integer> roomNumberList = new ArrayList<Integer>();
    @Override
    public void assignRoomNumberForEachRoomType() {
        
        for(int i = 100; i<= 105; i++){
            roomNumberList.add(i);
        }

        super.roomNumber.put("Standard room", roomNumberList);
    }
    
    @Override
    public void setCapacity(int capacity) {
        super.setCapacity(capacity);
    }

    
    
}


// user superclass
// admin is user - subclass of user
// customer also user - subclass of user