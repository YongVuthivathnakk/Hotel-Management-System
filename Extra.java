public class Extra {
    private final int extraId;
    private static int totalExtraId = 0;
    private String serviceName;
    private String description;
    private double price;

    public Extra(String serviceName, String description, double price) {
        this.extraId = ++totalExtraId;
        this.serviceName = serviceName;
        this.description = description;
        this.price = price;
    }

    // Getters
    public int getExtraId() {
        return extraId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    // Setters (if needed)
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Returns the cost of this extra service (only price, since quantity is not needed)
    public double calculateTotalCost() {
        return this.price;
    }

    // Displays details of the extra service
    public void displayExtraDetails() {
        System.out.println("Extra Service ID: " + extraId);
        System.out.println("Service Name: " + serviceName);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
    }
}
