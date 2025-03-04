package Booking;

import java.util.ArrayList;

public class BookingTest2 {

    public static void main(String[] args) {
        RoomBooking room1 = new RoomBooking("Deluxe room",2);
        ServiceBooking service1 = new ServiceBooking("Extra bed", 1);

        RoomBooking room2 = new RoomBooking("Standard room", 1);

        ArrayList<RoomBooking> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        ArrayList<ServiceBooking> serviceList = new ArrayList<>();
        serviceList.add(service1);

        for (RoomBooking room : roomList) {
            System.out.println("The room type is: "+ room.roomType);
            System.out.println("The room quantities is: " + room.roomQuantites);
        }

        for (ServiceBooking service : serviceList) {
            System.out.println("The service is: "+ service.serviceType);
            System.out.println("The service quantites is: " + service.serviceQuantities);
        }

        Booking booking1 = new Booking("Loading_duh", "0965757009", roomList, 0, "23-Mar-2025", "24-Mar-2025", serviceList);

        System.out.println(booking1);
    }
}