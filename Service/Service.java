package Service; 


public class Service {
    private String name;
    private float price;
    private String category;

    // Constructor
    public Service(String name, float price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // toString for debugging
    @Override
    public String toString() {
        return String.format(
    "Service:\n  Name: '%s'\n  Price: %.2f\n  Category: '%s'",
name, price, category
);

    }
}
