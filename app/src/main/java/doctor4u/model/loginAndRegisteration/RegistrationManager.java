package doctor4u.model.loginAndRegisteration;


import doctor4u.model.DTOs.RegisterDetails;
import doctor4u.model.exceptions.RegisterFailedException;
import doctor4u.model.users.User;

public interface RegistrationManager {

    User registerUser(RegisterDetails details) throws RegisterFailedException;

}
