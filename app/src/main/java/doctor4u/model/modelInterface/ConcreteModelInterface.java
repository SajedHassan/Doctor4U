package doctor4u.model.modelInterface;

import android.location.Location;

import java.util.ArrayList;

import doctor4u.model.DTOs.DoctorDetails;
import doctor4u.model.DTOs.RegisterDetails;
import doctor4u.model.DTOs.RegisteredUserDetails;
import doctor4u.model.databaseManager.DatabaseSearchEngine;
import doctor4u.model.databaseManager.DatabaseWritingEngine;
import doctor4u.model.exceptions.LoginFailedException;
import doctor4u.model.exceptions.RegisterFailedException;
import doctor4u.model.loginAndRegisteration.LoginManagement;
import doctor4u.model.loginAndRegisteration.LoginManager;
import doctor4u.model.loginAndRegisteration.RegistrationManagement;
import doctor4u.model.loginAndRegisteration.RegistrationManager;
import doctor4u.model.loginAndRegisteration.userBuilder.UserBuildingEngineer;
import doctor4u.model.notifications.Notification;
import doctor4u.model.rateables.DoctorCard;
import doctor4u.model.rateables.RatedItem;
import doctor4u.model.rateables.WorkingPlace;
import doctor4u.model.ratingLogic.Rating;
import doctor4u.model.recommenders.Recommender;
import doctor4u.model.reviews.ConcreteReview;
import doctor4u.model.reviews.Review;
import doctor4u.model.users.User;
import doctor4u.model.users.usersStates.GuestUserState;

public class ConcreteModelInterface implements ModelInterface {


    private User user;
    private LoginManager loginManager;
    private RegistrationManager registrationManager;
    private DatabaseSearchEngine databaseSearchEngine;
    private DatabaseWritingEngine databaseWritingEngine;
    private UserBuildingEngineer engineer;
    private Recommender recommender;


    public ConcreteModelInterface() {
        //initialize user
        user.setState(new GuestUserState());
        engineer = new UserBuildingEngineer();

    }

    @Override
    public void login(String userName, String password, String type) {

        if(loginManager == null)
            loginManager = new LoginManagement(databaseSearchEngine,engineer);

        try {
            user = loginManager.login(userName, password);
        } catch (LoginFailedException e) {
            //TODO handle
        }


    }

    @Override
    public boolean register(RegisterDetails details) {

        if(registrationManager == null)
            registrationManager = new RegistrationManagement(databaseSearchEngine ,engineer, databaseWritingEngine);

        try {
            registrationManager.registerUser(details);
        } catch (RegisterFailedException e) {
            return false;
        }

        return true;
    }

    @Override
    public ArrayList<DoctorCard> getFavoriteDoctors() {
        return user.getFavoriteDoctors();
    }

    @Override
    public void addDoctorIntoFavorites(DoctorCard doctor) {
        user.addDoctorToFavorites(doctor);
    }

    @Override
    public ArrayList<Notification> getNotifications() {
        return user.getNotifications();
    }

    @Override
    public void editUserDetails(RegisteredUserDetails details) {
        user.setRegisteredUserDetails(details);
    }

    @Override
    public void editDoctorDetails(DoctorDetails details) {
        user.setDetailsAsDoctor(details);
    }

    @Override
    public void addReview(RatedItem item, String reviewMsg) {
        Review newReview = new ConcreteReview(user ,item,reviewMsg);// initialize
        user.addReview(newReview);
    }

    @Override
    public void addRating(RatedItem item, int rate) {
        Rating rating ;

        //Todo concretion
    }

    @Override
    public ArrayList<DoctorCard> getNearDoctors(Location location, String specialization) {
        return databaseSearchEngine.getNearDoctors(location,specialization);
    }

    @Override
    public ArrayList<WorkingPlace> getNearHospitals(Location location) {
        return databaseSearchEngine.getNearHospitals(location);
    }

    @Override
    public ArrayList<WorkingPlace> getNearClinics(Location location, String specialization) {
        return getNearClinics(location,specialization);
    }

    @Override
    public ArrayList<DoctorCard> recommendDoctors(String specialization) {
        return recommender.recommendDoctors(specialization);
    }

    @Override
    public void logout() {
        user.setState(new GuestUserState());
    }
}
