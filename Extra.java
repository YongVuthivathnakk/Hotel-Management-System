import java.util.HashMap;

public class Extra {
    private String name;
    private float price;
    private String category;
    private static HashMap<String, Extra> predefinedExtras = new HashMap<>();

    // Constructor
    public Extra(String name, float price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters
    public String getName() { return name; }
    public float getPrice() { return price; }
    public String getCategory() { return category; }

    // Setters
    public void setPrice(float price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }
        this.price = price;
    }

    // Static methods to manage predefined extras
    public static void addPredefinedExtra(String name, float price, String category) {
        predefinedExtras.put(name, new Extra(name, price, category));
    }

    public static Extra getPredefinedExtra(String name) {
        return predefinedExtras.get(name);
    }

    public static void listPredefinedExtras() {
        if (predefinedExtras.isEmpty()) {
            System.out.println("No predefined extras available.");
            return;
        }
        for (Extra extra : predefinedExtras.values()) {
            System.out.println("Extra: " + extra.getName() + ", Price: $" + extra.getPrice() + ", Category: " + extra.getCategory());
        }
    }
    
    static {
        addPredefinedExtra("Pillow", 5, "Bedding");
        addPredefinedExtra("Bed", 50, "Furniture");
        addPredefinedExtra("Breakfast", 15, "Food");
        addPredefinedExtra("Airport Pickup", 30, "Transport");
        addPredefinedExtra("Spa Access", 50, "Wellness");
    }
}
