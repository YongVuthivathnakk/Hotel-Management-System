
public class Menu {
    private int ID;
    private static int totalID = 0;
    private String name;
    private String category; // Food and Drinks
    private double price;

    //Constructor
    public Menu(String name, String category, double price) {
        this.ID = ++totalID;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Methods
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getItemID() {
        return ID;
    }
}
