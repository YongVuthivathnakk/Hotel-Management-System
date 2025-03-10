package Service;

import java.util.ArrayList;
import java.util.Scanner;

import Data.ReadFromFile;
import Data.WriteToFile;
import UserDefinedException.DoubleOnlyException;
import UserDefinedException.IntegerOnlyException;
import UserDefinedException.StringOnlyException;

public class ServiceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ----------------- variable ---------------------
        String input = "";
        int functionNumber = 0;
        String serviceName = "";
        double price = 0.00;
        String category = "";
        // ----------------- variable ---------------------
        while (true) {
            try {
                System.out.println("1. save / write service data to file");
                System.out.println("2. load / read data from file ");
                System.out.print("Enter the function that you want to operate: ");
                input = scanner.nextLine();
                IntegerOnlyException intOnly = new IntegerOnlyException(input, "^[12]$", "Please enter either number 1 or 2 since there are only two function");
                functionNumber = Integer.parseInt(input);
                break;
            } catch (IntegerOnlyException e) {
                System.out.println(e.getMessage());
            }
        }

        if (functionNumber == 1) {
            try {
                System.out.print("Enter the service name: ");
                input = scanner.nextLine();
                StringOnlyException stringOnly = new StringOnlyException(input, "^[a-zA-Z ]+$");
                serviceName = input;
                System.out.print("Enter the price: ");
                input = scanner.nextLine();
                DoubleOnlyException doubleOnly = new DoubleOnlyException(input, "(?!0(\\.0+)?$)(\\d+(\\.\\d+)?|\\.\\d+)$");
                price = Double.parseDouble(input);
                System.out.print("Enter the service category: ");
                input = scanner.nextLine();
                StringOnlyException stringOnlyCategories = new StringOnlyException(input, "^[a-zA-Z ]+$");
                category = input;
            } catch (StringOnlyException e) {
                System.out.println(e.getMessage());
            } catch (DoubleOnlyException e){
                System.out.println(e.getMessage());
            }

            Service service = new Service(serviceName, price, category);

            WriteToFile.writer("services.txt", Service.getServiceList());
        }
        else{
            ArrayList<String[]> loadedServiceData = new ArrayList<>();
            ReadFromFile.reader("services.txt", loadedServiceData);
            for (String[] words : loadedServiceData) {
                
            }
        }

        scanner.close();
    }
}
