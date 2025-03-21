package Booking;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.ReadFromFile;
import Rooms.Room;
import Rooms.RoomManager;
import SQLConnection.MySQLConnection;


// room.setRoomType(words[0]);
// room.setRoomNumber(Integer.parseInt(words[1]));
// room.setCapacity(Integer.parseInt(words[2]));
// room.setPricePerNight(Double.parseDouble(words[3]));
// Room.roomList.put(Integer.parseInt(words[1]), room);
public class BookingManager {
    public static void loadDataFromBookingFile(){
        ArrayList<String[]> lodedBookingData = new ArrayList<>();
        ReadFromFile.reader("Data/Booking.csv", lodedBookingData);
        for(String[] words : lodedBookingData){
            int bookingId = Integer.parseInt(words[0]);
            String username = words[1];
            String phoneNumber = words[2];
            String bookingDate = words[3];
            String checkInDate = words[4];
            String checkOutDate = words[5];
            int discount = Integer.parseInt(words[6]);
            String roomTypes = words[7];
            int roomQuantites = Integer.parseInt(words[8]);
            int roomPrice = Integer.parseInt(words[9]);
            Booking newBooking = new Booking(username, phoneNumber, discount, checkInDate, checkOutDate);
            newBooking.setBookingDate(bookingDate);
            newBooking.addNewBookingRoomRequiement(roomTypes, roomQuantites);
            Booking.bookingList.put(bookingId, newBooking);
            System.out.println(newBooking);
        }

    }

    public static void insertIntoRoomDatabase(){
        String sql = "INSERT INTO ROOM(USERNAME, PHONE_NUMBER, CHECK_IN_DATE, CHECK_OUT_DATE,ROOM_TYPE, ROOM_QUANTITY, SERVICE, SERVICE_QUANTITY, DISCOUNT) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(sql); 
            for (Booking booking: Booking.bookingList.values()) {
                for(RoomBooking roomInfo : Booking.roomRequirement.values()){
                    System.out.println(booking);
                    preparedStatement.setString(1, booking.userName);
                    preparedStatement.setString(2, booking.phoneNumber);
                    preparedStatement.setString(3, booking.checkInDate);
                    preparedStatement.setString(4, booking.checkOutDate);
                    preparedStatement.setString(5, roomInfo.roomType );
                }
                
                int insertData = preparedStatement.executeUpdate();
                if (insertData > 0) {
                    System.out.println("inserting new booking information into the database successfully");
                }
            }
            

        } catch (SQLException e) {
            System.out.println("Error inserting room into the database");
            e.printStackTrace();
        }
    }



}
