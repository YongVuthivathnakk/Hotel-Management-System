import java.util.ArrayList;
import java.util.Scanner;

public class bookingTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your  username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter how many room type do you want to booking: ");
        int numberOfRoomType = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> roomTypesFromUser = new ArrayList<String>();
        ArrayList<Integer> roomQuantitiesFromUser = new ArrayList<Integer>();
        for(int i = 0 ; i < numberOfRoomType ; i++){
            System.out.print("Enter the room type " + (i + 1 ) + ": ");
            String roomType = scanner.nextLine();
            roomTypesFromUser.add(roomType);
            System.out.print("Enter the room quantites: ");
            int roomQuantites = scanner.nextInt();
            roomQuantitiesFromUser.add(roomQuantites);
            scanner.nextLine();
        }

        System.out.print("Enter the discount: ");
        int discount = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the check-in date: ");
        String checkInDate = scanner.nextLine();

        System.out.print("Enter the check-out date: ");
        String checkOutDate = scanner.nextLine();

        System.out.print("Enter how many service do you want to add: ");
        int numberOfService = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> servicesFromUser = new ArrayList<String>();
        ArrayList<Integer> servicesQuantitiesFromUser = new ArrayList<Integer>();
        for(int i = 0; i < numberOfService ; i++){
            System.out.print("Enter the service name: ");
            String serviceName = scanner.nextLine();
            System.out.print("Enter how many service you want to add: ");
            int serviceQuantities = scanner.nextInt();
            servicesFromUser.add(serviceName);
            servicesQuantitiesFromUser.add(serviceQuantities);
        }

        Booking booking1 = new Booking(username, phoneNumber, roomTypesFromUser, roomQuantitiesFromUser, discount, checkInDate, checkOutDate, servicesFromUser, servicesFromUser);

        System.out.println(booking1);





        scanner.close();
    }
}
