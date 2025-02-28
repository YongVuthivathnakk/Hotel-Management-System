package Register_and_Login;

import java.util.Scanner;

import UserFolder.Admin;


public class AdminLogin {
    static Admin testAdmin = new Admin("Jake", "The Dog", "JakeTheDog", "M", 18, "jakethedog@gmail.com", "8851234567", "12345678", "Online", 120.4);
       
       
        public static void main(String[] args) {
    // =================== Variable ========================
    
            Scanner input = new Scanner(System.in);
            String userName;
            String password;
    
    // ======================================================

        System.out.println("====== Admin Login ======\n\n");
        
        while(true) {
            System.out.println("Username: ");
            userName = input.nextLine().trim().replaceAll(" ", "");
            System.out.println("Passowrd: ");
            password = input.nextLine();
            if (userName.equals(testAdmin.getUserName() && password.equals(testAdmin.getPassword()))) {
                
            }
        }


    }
}
