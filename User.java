public class User {
    // attribute for user 
    String frist_name;
    String last_name;
    String email;
    String password ;
    String comfirm_password;
    String phone_number;
    String room_type;
    int room_number;
    int arrival_date ;
    int departure_date;

    // constructor for infor form
    public User(String newfirst_name, String newlast_name, String newemail, String newphone_number, String newroom_type, int newroom_number , int newarrival_date , int newdeparture_date) {
        frist_name = newfirst_name;
        last_name = newlast_name;
        email = newemail;
        phone_number = newphone_number;
        room_type = newroom_type;
        room_number = newroom_number;
        arrival_date = newarrival_date;
        departure_date =newdeparture_date;
    }
    // for signin acc
    public User (String signin_email , String singin_password ){
        email = signin_email;
        password = singin_password ;
    }
    // for signup acc
    public User (String signin_email , String singin_password  , String comfirm_password){
        if (password != comfirm_password) {
            System.err.println("Passwords do not match!");
        }
        email = signin_email;
        password = singin_password ;
    }

    //method for user
    static void booking(){ // for user booking

    }
    static void refundpolicy(){ // for refund 

    }
    static void extra(){ // for extra room , food , other

    }
    static void payment(){ // for payment using card or money

    }
    static void receipt(){ // for receipt when already booking using form

    }
    static boolean checkin(){ // to checkin when go in
        return true ;
    }
    static boolean checkout(){ // to checout when go out
        return true ;
    }

}
