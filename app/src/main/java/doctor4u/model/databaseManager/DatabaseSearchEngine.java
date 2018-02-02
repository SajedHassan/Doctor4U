package doctor4u.model.databaseManager;


import doctor4u.model.DTOs.DoctorDetails;
import doctor4u.model.DTOs.RegisteredUserDetails;
import doctor4u.model.exceptions.WrongPasswordException;

public interface DatabaseSearchEngine {



    long getUserIDWithUserNameAndPass(String userName , String password) throws WrongPasswordException;
    boolean doesUserExist(String userName);
    DoctorDetails getDoctorDetailsByID(long id);
    RegisteredUserDetails getRegisteredUserDetailsByID(long id);
    String getUserTypeByID(long id);



}
