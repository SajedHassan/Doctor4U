package doctor4u.model.notifications;


import doctor4u.model.rateables.DoctorCard;
import doctor4u.model.users.User;


public class ConcreteNotification implements Notification{

    String msg;
    User user;
    DoctorCard doctor;

    public ConcreteNotification(String msg, User user, DoctorCard doctor){
        this.msg = msg;
        this.user = user;
        this.doctor = doctor;
    }
    @Override
    public String getNotificationMsg() {
        return msg;
    }
    @Override
    public User getNotifiedUser() {
        return user;
    }
    @Override
    public DoctorCard getChangedDoctorCard() {
        return doctor;
    }
    @Override
    public void notifyUser() {
        user.addNotification(this);
    }
}
