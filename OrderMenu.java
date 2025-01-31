
import java.time.LocalDateTime;

public class OrderMenu {    
    private int orderID; 
    private static int totalID = 0;
    private LocalDateTime orderDate;
    private Menu[] items;  // List of Menu objects instead of just item names
    private double totalPrice;

    // Constructor
    public OrderMenu(LocalDateTime orderDate, Menu[] items) {
        orderID = ++totalID;
        this.orderDate = orderDate;
        this.items = items;
    }

    // Getter Method
    public int getID() {
        return orderID;
    }

    

}