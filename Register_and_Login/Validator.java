package Register_and_Login;

import java.util.regex.Pattern;

import Booking.bookingTesting;

public class Validator {

    public boolean isEmailValid(String email) {
        // Regular expression to match valid email formats
        String emailRegex = "^[a-z]+(?:\\.[a-z]+)*@" +
                            "(?:[a-z]+\\.)+[a-zA-Z]{2,7}$";

        // Compile the regex
        Pattern p = Pattern.compile(emailRegex);
        
        // Check if email matches the pattern
        return email != null && p.matcher(email).matches();
    }

    public boolean isPhoneNumberValid(String phoneNumber) {
         // Regular expression to check if
        // the number starts with
        // 7, 8, or 9, followed by 9 digits
        String number = "^[7-9][0-9]{8,9}?$";

        if (phoneNumber.trim().matches(number)) {
            return true;
        } else {
            return false;
        }
    }

    
}
