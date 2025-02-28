import java.util.ArrayList;

public class FamilyRoom extends Room {
    FamilyRoom(){
        this.description = "";
        this.capacity = 5;
        this.roomType = "Family Room";
        this.pricePerNight = 150;
    }

    ArrayList<Integer> roomNumberList = new ArrayList<Integer>();
    @Override
    public void assignRoomNumberForEachRoomType() {
        
        for(int i = 210; i <= 215; i++){
            roomNumberList.add(i);
        }

        super.roomNumber.put("Family room", roomNumberList);
    }
    
}

