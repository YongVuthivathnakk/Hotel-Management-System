package Service;

import java.util.HashMap;

public class Service {
    protected String name;
    protected double price;
    protected String category;
    protected static HashMap<String, Service> serviceList = new HashMap<>();


    // Constructor
    public Service(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;

        serviceList.put(category, this);

    }



    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static HashMap<String, Service> getServiceList() {
        return serviceList;
    }



    public static void setServiceList(HashMap<String, Service> serviceList) {
        Service.serviceList = serviceList;
    }
    
    @Override
    public String toString() {
        return name + "," + price + "," + category + ",";

    }







}
