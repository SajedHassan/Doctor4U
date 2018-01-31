package doctor4u.model.databaseManager;


import doctor4u.model.users.User;

public interface DatabaseSearchEngine {



    User getUserByUsername(String userName);
    boolean doesUserExist();






}
