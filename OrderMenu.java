import java.util.Date;
import java.util.List;

public class OrderMenu {
    Date orderDate;
    List<String> item;
    List<String> itemID;
    List<Double> itemPrice;
    double totalPrice;

    // Constructor
    public OrderMenu(Date orderDate, int ID, List<String> item, List<String> itemID, List<Double> itemPrice) {
        this.orderDate = orderDate;
        this.item = item;
        this.itemID = itemID;
        this.itemPrice = itemPrice;
    }
}