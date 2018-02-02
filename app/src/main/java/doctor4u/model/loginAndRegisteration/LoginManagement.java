package doctor4u.model.loginAndRegisteration;

import doctor4u.model.databaseManager.DatabaseSearchEngine;
import doctor4u.model.exceptions.UserNotFoundException;
import doctor4u.model.loginAndRegisteration.userBuilder.UserBuildingEngineer;
import doctor4u.model.users.User;



public class LoginManagement implements LoginManager {

    DatabaseSearchEngine engine;
    UserBuildingEngineer engineer;

    LoginAndRegistrationUtilities utilities;

    public LoginManagement(DatabaseSearchEngine engine, UserBuildingEngineer engineer){
        this.engine = engine;
        this.engineer = engineer;
        utilities = new LoginAndRegistrationUtilities();
    }

    @Override
    public User login(String userName, String password) throws UserNotFoundException {
        User user;
        if (engine.doesUserExist(userName)) {
            long id = engine.getUserIDWithUserNameAndPass(userName,password);
            user = utilities.getUser(id,engine,engineer);
        } else {
            throw new UserNotFoundException();
        }
        return user;
    }
}
