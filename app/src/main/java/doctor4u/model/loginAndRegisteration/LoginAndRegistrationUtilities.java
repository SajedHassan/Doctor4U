package doctor4u.model.loginAndRegisteration;


import doctor4u.model.databaseManager.DatabaseSearchEngine;
import doctor4u.model.loginAndRegisteration.userBuilder.UserBuildingEngineer;
import doctor4u.model.users.User;

public class LoginAndRegistrationUtilities {

    public User getUser(long id, DatabaseSearchEngine engine, UserBuildingEngineer engineer){
        String type = engine.getUserTypeByID(id);
        engineer.setBuilder(type);
        return engineer.constructUser(
                engine.getRegisteredUserDetailsByID(id),
                engine.getDoctorDetailsByID(id)
        );
    }
}
