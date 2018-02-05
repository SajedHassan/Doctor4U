package doctor4u.model.databaseManager;


import java.util.ArrayList;

import doctor4u.model.DTOs.DoctorDetails;
import doctor4u.model.DTOs.RegisteredUserDetails;
import doctor4u.model.exceptions.WrongPasswordException;

public interface DatabaseSearchEngine {



    long getUserIDWithUserNameAndPass(String userName , String password) throws WrongPasswordException;
    boolean doesUserExist(String userName);
    DoctorDetails getDoctorDetailsByID(long id);
    ArrayList<DoctorDetails> getDoctorsByHospitalID(long id);
    ArrayList<DoctorDetails> getDoctorsByCityID(int cityID);
    ArrayList<DoctorDetails> getDoctorsBySpecialization(String Speciality);
    RegisteredUserDetails getRegisteredUserDetailsByID(long id);
    String getUserTypeByID(long id);



}
