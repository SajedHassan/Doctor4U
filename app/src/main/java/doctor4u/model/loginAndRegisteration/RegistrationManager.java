package doctor4u.model.loginAndRegisteration;


import doctor4u.model.DTOs.RegisterDetails;
import doctor4u.model.exceptions.RegisterFailedException;

public interface RegistrationManager {

    String registerUser(RegisterDetails details) throws RegisterFailedException;

}
