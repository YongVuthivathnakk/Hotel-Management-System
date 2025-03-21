package Rooms;

import java.util.ArrayList;
import Data.ReadFromFile;

public class RoomManager {
    public static double roomPrice(String roomType){
        RoomManager.loadRoomData();
        for (Room room : Room.getRoomList().values()) {
            if(room.getRoomType().equalsIgnoreCase(roomType)){
                return room.getPricePerNight();
            }
        }
        System.out.println("Room type: " + roomType + "is not found");
        return -1;
    }

    public static void assigningnNewRoom (String roomType, int roomNumber){
        if(Room.roomList.containsKey(roomNumber)){
            Room assignedRoom = Room.getRoomList().get(roomNumber);
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
        
        Room.roomList.put(roomNumber, newRoom);
        System.out.println("The room type is: " + roomType);
        System.out.println("The room number is : " + roomNumber);
        System.out.println("New room is assigned successfully");
        
    }

    public static void loadRoomData(){
        ArrayList<String[]> loadedRoomData = new ArrayList<>();
        ReadFromFile.reader("Data/Room_data.txt", loadedRoomData);
        for(String[] words : loadedRoomData){
            // System.out.println(Arrays.toString(words));
            if (words[0].toLowerCase().equals("standard room".toLowerCase())) {
                Room room = new StandardRoom();
                room.setRoomType(words[0]);
                room.setRoomNumber(Integer.parseInt(words[1]));
                room.setCapacity(Integer.parseInt(words[2]));
                Room.roomList.put(Integer.parseInt(words[1]), room);
            }
            else if (words[0].toLowerCase().equals("deluxe room".toLowerCase())) {
                Room room = new DeluxeRoom();
                room.setRoomType(words[0]);
                room.setRoomNumber(Integer.parseInt(words[1]));
                room.setCapacity(Integer.parseInt(words[2]));
                room.setPricePerNight(Double.parseDouble(words[3]));
                Room.roomList.put(Integer.parseInt(words[1]), room);
            }
            else if (words[0].toLowerCase().equals("family room".toLowerCase())) {
                Room room = new FamilyRoom();
                room.setRoomType(words[0]);
                room.setRoomNumber(Integer.parseInt(words[1]));
                room.setCapacity(Integer.parseInt(words[2]));
                room.setPricePerNight(Double.parseDouble(words[3]));
                Room.roomList.put(Integer.parseInt(words[1]), room);
            }
            else if (words[0].toLowerCase().equals("suite".toLowerCase())) {
                Room room = new Suite();
                room.setRoomType(words[0]);
                room.setRoomNumber(Integer.parseInt(words[1]));
                room.setCapacity(Integer.parseInt(words[2]));
                room.setPricePerNight(Double.parseDouble(words[3]));
                Room.roomList.put(Integer.parseInt(words[1]), room);
            }
            else{
                continue;
            }
        }

        System.out.println("The data are loaded into the program successfully");
        for(Room room : Room.roomList.values()){
            System.out.println(room);
        }
    }
}
