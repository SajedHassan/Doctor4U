package doctor4u.model.DTOs;


import java.util.Date;

public class RegisterDetails {

    public String userName;
    public String password;
    public String mail;
    public String phone;
    public int gender;
    public Date birthDate;
    public int cityID; // better than just a string

    public int userType;

    public int[] hospitalsID;
    public int[] clinicsID;
    public String profession;
    public String education;


}
