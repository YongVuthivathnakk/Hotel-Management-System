package Booking;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import CustomException.BelowOrOverLimitException;

public class bookingTesting{
    public static void main(String[] args) {
        // ---------- variable -------------
        String userName;
        String phoneNumber;
        ArrayList<String> roomType = new ArrayList<>();
        ArrayList<Integer> numberOfRoom = new ArrayList<>();
        String checkInDate;
        String checkOutDate;
        ArrayList<String> service = new ArrayList<>();
        ArrayList<Integer> serviceQuantities = new ArrayList<>();
        int discount = 0;
        // ---------- variable -------------

        // ---------- temp variable --------------
        String roomTypeTemp = "";
        int numberOfRoomTemp = 1; 
        String serviceTemp = "";
        int serviceQuantitesTemp = 1;
        // ---------- temp variable --------------


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the username: ");
        userName = scanner.nextLine();

        System.out.print("Enter the phone number: ");
        phoneNumber = scanner.nextLine();

        // select room type and number of room 
        while(true){
            System.out.print("Enter the room type or 0 to finish: ");
            roomTypeTemp = scanner.nextLine();

            if (roomTypeTemp.equals("0")) {
                break;
            }

            roomType.add(roomTypeTemp);
        
            while (true) {
                try {
                    System.out.print("Enter the number of room: ");
                    numberOfRoomTemp = scanner.nextInt();
    
                    if (numberOfRoomTemp < 1) {
                        throw new BelowOrOverLimitException("The number of room couldn't less than 1");
                    }
                    numberOfRoom.add(numberOfRoomTemp);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter the integer number!");
                    scanner.nextLine();
                } catch (BelowOrOverLimitException e){
                    System.out.println(e.getMessage());
                }
            }
            scanner.nextLine(); // this is used to clear buffer
        }

        System.out.print("Enter the check-in date: ");
        checkInDate = scanner.nextLine();

        System.out.print("Enter the check out-date:  ");
        checkOutDate = scanner.nextLine();

        // selecte extra service and its quantities
        System.out.println("Do you want to add any extra service?");
        System.out.println("There are two available extra service");
        System.out.println("Extra bed");
        System.out.println("Breakfast");
        while (true) {
            System.out.print("Enter The service that you want to add or 0 to finish: ");
            serviceTemp = scanner.nextLine();
            
            if (serviceTemp.equals("0")) {
                break;
            }
            
            service.add(serviceTemp);
            while(true){
                try {
                    System.out.print("Enter the number of "+ serviceTemp + " service: ");
                    serviceQuantitesTemp = scanner.nextInt();

                    if (serviceQuantitesTemp < 1) {
                        throw new BelowOrOverLimitException("The quantities of service couldn't less than 1");
                    }
                    serviceQuantities.add(serviceQuantitesTemp);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter integer number!");
                    scanner.nextLine();
                } catch (BelowOrOverLimitException e){
                    System.out.println(e.getMessage());
                }
                scanner.nextLine();
            }


 
            scanner.nextLine();
        }

        
        
        while(true){
            try {
                System.out.print("Enter the discount: ");
                discount = scanner.nextInt();
                scanner.nextLine();
                if (discount < 0 || discount > 100) {
                    throw new BelowOrOverLimitException("The range for discount input is 0 - 100");
                }
                break;
            } catch (InputMismatchException  e) {
                System.out.println("Please enter the integer number.");
                scanner.nextLine();
            } catch (BelowOrOverLimitException e){
                System.out.println(e.getMessage());
            }
        }
        
        Booking booking1 = new Booking(userName, phoneNumber, roomType, numberOfRoom, discount, checkInDate, checkOutDate, service, serviceQuantities);
        System.out.println(booking1);
        
        scanner.close();
    }


}
