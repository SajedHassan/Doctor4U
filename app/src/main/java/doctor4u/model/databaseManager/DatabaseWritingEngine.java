package doctor4u.model.databaseManager;


import doctor4u.model.DTOs.RegisterDetails;
import doctor4u.model.DTOs.RegisteredUserDetails;

public interface DatabaseWritingEngine {

    long createNewUser(RegisterDetails details);

}
