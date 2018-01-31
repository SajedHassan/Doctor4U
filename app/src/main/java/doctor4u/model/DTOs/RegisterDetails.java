package doctor4u.model.DTOs;


import java.util.Date;

public class RegisterDetails {

    String userName;
    String password;
    String mail;
    String phone;
    int gender;
    Date birthDate;
    int cityID; // better than just a string

    int userType;

    int[] hospitalsID;
    int[] clinicsID;
    String profession;
    String education;


}
