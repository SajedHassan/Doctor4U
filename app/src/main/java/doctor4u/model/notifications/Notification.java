package doctor4u.model.notifications;


import doctor4u.model.rateables.DoctorCard;

public interface Notification {

    String getNotificationMsg();
    void getNotifiedUser();
    DoctorCard getChangedDoctorCard();
    void notifyUser();

}
