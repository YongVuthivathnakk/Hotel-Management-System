package Rooms;
public class FamilyRoom extends Room {
    public FamilyRoom() {
        super();
        this.setDescription("Comfortable family room with two queen beds.");
        this.setCapacity(2);
        this.setRoomType("Family Room");
        this.setPricePerNight(280);
    }
}
