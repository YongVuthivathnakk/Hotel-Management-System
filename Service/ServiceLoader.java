package Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServiceLoader {
    public static List<Service> loadServicesFromFile(String filename) {
        List<Service> services = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    float price = Float.parseFloat(parts[1].trim());
                    String category = parts[2].trim();

                    Service service = new Service(name, price, category);
                    services.add(service);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return services;
    }
}
