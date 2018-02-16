package doctor4u.model.modelInterface;


import android.location.Location;

import java.util.ArrayList;

import doctor4u.model.DTOs.DoctorDetails;
import doctor4u.model.DTOs.RegisterDetails;
import doctor4u.model.DTOs.RegisteredUserDetails;
import doctor4u.model.notifications.Notification;
import doctor4u.model.rateables.DoctorCard;
import doctor4u.model.rateables.RatedItem;
import doctor4u.model.rateables.WorkingPlace;

public interface ModelInterface {



    void login(String userName , String password ,String type);
    boolean register(RegisterDetails details);

    ArrayList<DoctorCard> getFavoriteDoctors();

    void addDoctorIntoFavorites(DoctorCard doctor);

    ArrayList<Notification> getNotifications();

    void editUserDetails(RegisteredUserDetails details);
    void editDoctorDetails(DoctorDetails details);

    void addReview(RatedItem item,String reviewMsg);
    void addRating(RatedItem item, int rate );

    ArrayList<DoctorCard> getNearDoctors(Location location , String specialization);
    ArrayList<WorkingPlace> getNearHospitals(Location location );
    ArrayList<WorkingPlace> getNearClinics(Location location , String specialization);

    ArrayList<DoctorCard> recommendDoctors(String specialization);


    void logout();

}
