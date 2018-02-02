package doctor4u.model.users;

import java.util.ArrayList;

import doctor4u.model.DTOs.DoctorDetails;
import doctor4u.model.DTOs.RegisteredUserDetails;
import doctor4u.model.notifications.ConcreteNotification;
import doctor4u.model.notifications.Notification;
import doctor4u.model.rateables.DoctorCard;
import doctor4u.model.rateables.RatedItem;
import doctor4u.model.ratingLogic.Rating;
import doctor4u.model.users.usersStates.UserState;

public interface User {


    void setState(UserState state);

    void setRegisteredUserDetails(RegisteredUserDetails details);
    void addDoctorToFavorites();

    ArrayList<Notification> getNotifications();
    ArrayList<DoctorCard> getFavoriteDoctors();
    void setFavoriteDoctors(ArrayList<DoctorCard> doctors);

    void rateItem(RatedItem item, int rate);
    ArrayList<Rating> getPreviousRates();
    void clearRateHistory();

    void addReview(RatedItem item);
    void clearReviewHistory();


    void setDetailsAsDoctor(DoctorDetails details);
    DoctorDetails getDetailsAsDoctor();
    DoctorCard getDoctorCard();

    void addNotification(Notification notification);
}
