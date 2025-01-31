import java.time.LocalDateTime;

public class OrderMenu {
    private String orderId;
    private Room room;
    private MenuItem[] items;
    private int[] quantities;    
    private double totalAmount;
    private String status; // PENDING, PREPARING, DELIVERED
    private LocalDateTime orderTime;
    private LocalDateTime deliveryTime;
    private int itemCount;

    OrderMenu(String orderId, Room room) {
        this.orderId = orderId;
        this.room = room;
        this.items = new MenuItem[100]; // Initialize with a fixed size (adjust as needed)
        this.quantities = new int[100];
        this.status = "PENDING";
        this.orderTime = LocalDateTime.now();
    }

    // Getters
    public void addItem(MenuItem item, int quantity) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            quantities[itemCount] = quantity;
            totalAmount += item.getPrice() * quantity;
            itemCount++; // Increment the item count
        } else { // Error check
            System.out.println("Cannot add more items. Order is full.");
        }
    }

    public String getOrderId() {
        return orderId;
    }

    public Room getRoom() {
        return room;
    }

    public MenuItem[] getItems() {
        return items;
    }

    public int[] getQuantities() {
        return quantities;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public int getItemCount() {
        return itemCount;
    }

    // Setters
    public void setStatus(String status) {
        this.status = status;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    

}