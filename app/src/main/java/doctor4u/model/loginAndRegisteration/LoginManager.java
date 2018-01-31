package doctor4u.model.loginAndRegisteration;

import doctor4u.model.exceptions.LoginFailedException;
import doctor4u.model.users.User;

public interface LoginManager {

    User login(String userName, String password) throws LoginFailedException;

}
