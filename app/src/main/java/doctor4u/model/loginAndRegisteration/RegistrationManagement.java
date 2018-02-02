package doctor4u.model.loginAndRegisteration;

import doctor4u.model.DTOs.RegisterDetails;
import doctor4u.model.databaseManager.DatabaseSearchEngine;
import doctor4u.model.databaseManager.DatabaseWritingEngine;
import doctor4u.model.exceptions.RegisterFailedException;
import doctor4u.model.loginAndRegisteration.userBuilder.UserBuildingEngineer;
import doctor4u.model.users.User;

public class RegistrationManagement implements RegistrationManager {

    DatabaseSearchEngine searchEngine;
    DatabaseWritingEngine writingEngine;
    UserBuildingEngineer engineer;
    LoginAndRegistrationUtilities utilities;

    public RegistrationManagement(DatabaseSearchEngine searchEngine,
                                  UserBuildingEngineer engineer,
                                  DatabaseWritingEngine writingEngine){
        this.searchEngine = searchEngine;
        this.engineer = engineer;
        this.writingEngine = writingEngine;
        utilities = new LoginAndRegistrationUtilities();
    }

    @Override
    public User registerUser(RegisterDetails details) throws RegisterFailedException {
        if(searchEngine.doesUserExist(details.userName)){
            throw new RegisterFailedException();
        }
        long id = writingEngine.createNewUser(details);
        return utilities.getUser(id,searchEngine,engineer);

    }
}
