public interface PaymentMethod {
    public void pay(double totalPrice);
    public String paymentType();
}
