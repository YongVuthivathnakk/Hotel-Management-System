import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an admin object with sample data.
        Admin admin = new Admin("John Doe", "Secure@123", "john@example.com", "1234567890", "MANAGER", "ONLINE");
        
        int choice = -1;
        while (choice != 6) {
            System.out.println("\n--- Hotel Management System - Admin Panel ---");
            System.out.println("1. Change Password");
            System.out.println("2. Accept Checkout Request");
            System.out.println("3. Accept Check-In Request");
            System.out.println("4. Change Room Status");
            System.out.println("5. Extra Service Request");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear invalid input
                continue;
            }
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter current password: ");
                    String currentPassword = scanner.nextLine();
                    admin.changePassword(currentPassword);
                    break;
                case 2:
                    System.out.print("Enter checkout decision (true for accept, false for reject): ");
                    boolean checkoutDecision = scanner.nextBoolean();
                    scanner.nextLine(); // consume newline
                    admin.acceptCheckout(checkoutDecision);
                    break;
                case 3:
                    System.out.print("Enter check-in decision (true for accept, false for reject): ");
                    boolean checkInDecision = scanner.nextBoolean();
                    scanner.nextLine(); // consume newline
                    admin.acceptCheckIn(checkInDecision);
                    break;
                case 4:
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter new room status (e.g., Available, Occupied, Maintenance): ");
                    String newStatus = scanner.nextLine();
                    admin.changeRoomStatus(roomNumber, newStatus);
                    break;
                case 5:
                    // Display list of available extra services
                    System.out.println("\n--- Available Extra Services ---");
                    ArrayList<Extra> extraServiceList = new ArrayList<>();
                    extraServiceList.add(new Extra("Spa Access", "Relax in our spa facilities", 50.0));
                    extraServiceList.add(new Extra("Breakfast", "Enjoy a hearty breakfast", 20.0));
                    extraServiceList.add(new Extra("Airport Transfer", "Pickup and drop off service", 30.0));
                    
                    for (Extra service : extraServiceList) {
                        service.displayExtraDetails();
                        System.out.println("---------------------------");
                    }
                    
                    // Ask user how many services they want to select
                    System.out.print("How many extra services would you like to select? ");
                    int serviceCount = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    
                    double totalCost = 0;
                    ArrayList<Extra> selectedServices = new ArrayList<>();
                    for (int i = 0; i < serviceCount; i++) {
                        System.out.print("Enter the Extra Service ID you want to add: ");
                        int serviceId = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        
                        // Find the service with the matching extraId
                        Extra chosenService = null;
                        for (Extra service : extraServiceList) {
                            if (service.getExtraId() == serviceId) {
                                chosenService = service;
                                break;
                            }
                        }
                        if (chosenService != null) {
                            selectedServices.add(chosenService);
                            totalCost += chosenService.calculateTotalCost();
                            System.out.println(chosenService.getServiceName() + " added.");
                        } else {
                            System.out.println("Invalid Extra Service ID. Skipping.");
                        }
                    }
                    
                    System.out.println("\nSelected Extra Services:");
                    for (Extra service : selectedServices) {
                        System.out.println("- " + service.getServiceName() + " ($" + service.getPrice() + ")");
                    }
                    System.out.println("Total Extra Service Cost: $" + totalCost);
                    break;
                case 6:
                    System.out.println("Exiting Admin Panel. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
