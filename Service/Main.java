package Service;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Print current working directory for debugging
        System.out.println("Current directory: " + System.getProperty("user.dir"));
        
        try {
            List<Service> services = ServiceLoader.loadServicesFromFile("Hotel-Management-System/Service/services.txt");

            System.out.println("📌 Loaded Services:");
            for (Service service : services) {
                System.out.println(service);
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
