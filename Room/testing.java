package Room;

public class testing {
    public static void main(String[] args) {
        Room.assignRoomNumberForEachRoomType("Standard Room", 101);
        Room.assignRoomNumberForEachRoomType("Standard Room", 102);
        Room.assignRoomNumberForEachRoomType("Standard Room", 103);
        Room.assignRoomNumberForEachRoomType("Standard Room", 104);
        
        Room.assignRoomNumberForEachRoomType("Deluxe Room", 206);
        Room.assignRoomNumberForEachRoomType("Deluxe Room", 207);
        Room.assignRoomNumberForEachRoomType("Deluxe Room", 208);
        
        Room.assignRoomNumberForEachRoomType("Standard Room", 105);
        System.out.println("Room numbers that are Standard Room" + " " + Room.roomNumbersForEachRoomType.get("Standard Room"));

        Room.assignRoomNumberForEachRoomType("Deluxe Room", 209);
        System.out.println("Room numbers that are Deluxe Room" + " " + Room.roomNumbersForEachRoomType.get("Deluxe Room"));

        Room StandardRoom = new StandardRoom();
        System.out.println(StandardRoom.description);

        System.out.println(Room.allRoomType.get("Standard Room"));
        System.out.println("The price of standard Room: $" + Room.getPricePerNightOfRoom("Standard Room"));


    }

}
