import java.util.ArrayList;

public class DeluxeRoom extends Room {
    DeluxeRoom(){
        this.description = "";
        this.capacity = 3;
        this.roomType = "Deluxe Room";
        this.pricePerNight = 120;
    }

    ArrayList<Integer> roomNumberList = new ArrayList<Integer>();
    @Override
    public void assignRoomNumberForEachRoomType() {
        
        for(int i = 200; i <= 205; i++){
            roomNumberList.add(i);
        }

        super.roomNumber.put("Deluxe room", roomNumberList);
    }
    

    
    
}


