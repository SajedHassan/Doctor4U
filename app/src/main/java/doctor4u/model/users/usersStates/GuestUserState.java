package doctor4u.model.users.usersStates;

import java.util.ArrayList;

import doctor4u.model.DTOs.DoctorDetails;
import doctor4u.model.DTOs.RegisteredUserDetails;
import doctor4u.model.notifications.Notification;
import doctor4u.model.rateables.DoctorCard;
import doctor4u.model.rateables.RatedItem;
import doctor4u.model.ratingLogic.Rating;
import doctor4u.model.reviews.Review;


public class GuestUserState implements UserState {
    @Override
    public void setState(UserState state) {

    }

    @Override
    public void setRegisteredUserDetails(RegisteredUserDetails details) {

    }

    @Override
    public void addDoctorToFavorites(DoctorCard doctor) {

    }

    @Override
    public ArrayList<Notification> getNotifications() {
        return null;
    }

    @Override
    public ArrayList<DoctorCard> getFavoriteDoctors() {
        return null;
    }

    @Override
    public void setFavoriteDoctors(ArrayList<DoctorCard> doctors) {

    }

    @Override
    public void rateItem(RatedItem item, int rate) {

    }

    @Override
    public ArrayList<Rating> getPreviousRates() {
        return null;
    }

    @Override
    public void clearRateHistory() {

    }

    @Override
    public void addReview(Review item) {

    }

    @Override
    public void clearReviewHistory() {

    }

    @Override
    public void setDetailsAsDoctor(DoctorDetails details) {

    }

    @Override
    public DoctorDetails getDetailsAsDoctor() {
        return null;
    }

    @Override
    public DoctorCard getDoctorCard() {
        return null;
    }

    @Override
    public void addNotification(Notification notification_){}
}
