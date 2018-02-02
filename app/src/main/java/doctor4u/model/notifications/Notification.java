package doctor4u.model.notifications;


import doctor4u.model.rateables.DoctorCard;
import doctor4u.model.users.User;

public interface Notification {

    String getNotificationMsg();
    User getNotifiedUser();
    DoctorCard getChangedDoctorCard();
    void notifyUser();

}
