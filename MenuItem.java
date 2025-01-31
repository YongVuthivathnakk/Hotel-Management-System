

public class MenuItem {
    private int itemId;
    private static int totalID = 0;
    private String name;
    private String description;
    private double price;
    private String category; // FOOD, SNACK, DRINK
    private boolean isAvailable;

    public MenuItem(String name, double price, String category) {
        this.itemId = ++totalID;
        this.name = name;
        this.price = price;
        this.category = category;
        this.isAvailable = true;
    }

    // Getters
    public int getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public double getPrice() {
        return price;
    }


    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return isAvailable; 
    }
    

    // Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}