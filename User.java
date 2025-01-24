public class User {
    int totalUser = 0;
    // attribute for user 
    String email;
    String password ;

    // for signin acc
    public User (String signin_email , String singin_password ){
        email = signin_email;
        password = singin_password ;
        totalUser += 1;
    }
    

}
