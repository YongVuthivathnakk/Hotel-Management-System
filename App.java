public class App {
    public static void main(String[] args) {
        Admin admin = new Admin("John Doe", "password123", "manager@gmail.com", "1234567890", "MANAGER", "ONLINE");
        admin.changePassword("wer");
    }
}
