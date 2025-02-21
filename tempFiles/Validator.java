package Files;
public class Validator {

    // check email
    public static void validateEmail(String email) {
        if(email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email: " + email);
        }
    }

    // check name
    public static void validateName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    // check password
    public static void validatePassword(String password) {
        if(password == null || password.length() < 6){
            throw new IllegalArgumentException("Password must be at least 6 characters long");
        }
    }
}
