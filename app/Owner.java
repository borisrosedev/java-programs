package app;

public class Owner {
    String firstname; 
    String lastname;
    String email;

    Owner(String email){
        firstname = "";
        lastname = "";
        this.email = email;
    }
    Owner(String first,  String last, String email ){
        firstname = first;
        lastname = last;
        this.email = email;

    }

}
