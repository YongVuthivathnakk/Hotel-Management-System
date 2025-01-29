public class Guest {
    //personal infor of guest
    String fullName;
    String phone;
    String email;
    String address; 
    String nationality;

    //contractor
    void PersonalInformation(String fullName, String phone, String email, String address, String nationality) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.nationality = nationality;
    }
}
