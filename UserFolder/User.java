package UserFolder;

import java.util.regex.Pattern;

import Booking.bookingTesting;

public abstract class User {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected String userName;
    protected String password;
    protected String gender;
    protected int age;


    public User(String firstName, String lastName, String userName, String gender, int age ,String email, String phoneNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
    }

    // Getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getGender() {
        return this.gender;
    }

    public String getPassword() {
        return this.password;
    }

    public int age() {
        return this.age;
    }


    // method

    public boolean login(){
        return false;
    };

    public abstract void register();
 
}
