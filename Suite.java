import java.util.ArrayList;
public class Suite extends Room {
Suite(){
        this.description = "";
        this.capacity = 4;
        this.roomType = "Suite";
        this.pricePerNight = 200;
    }

    ArrayList<Integer> roomNumberList = new ArrayList<Integer>();
    @Override
    public void assignRoomNumberForEachRoomType() {
        
        for(int i = 110; i <= 115; i++){
            roomNumberList.add(i);
        }

        super.roomNumber.put("Suite", roomNumberList);
    }
    

   
}

