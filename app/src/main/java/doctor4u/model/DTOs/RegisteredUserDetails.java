package doctor4u.model.DTOs;

import java.util.ArrayList;
import java.util.Date;
import java.util.Stack;

import doctor4u.model.notifications.Notification;
import doctor4u.model.rateables.DoctorCard;
import doctor4u.model.ratingLogic.RateCommand;
import doctor4u.model.reviews.Review;

public class RegisteredUserDetails {

    String userName;
    String password;
    int ID;
    String mail;
    String phone;
    int gender;
    Date birthDate;
    int cityID;

    ArrayList<DoctorCard> favoriteDoctors;
    ArrayList<Notification> notifications;
    ArrayList<Review> reviews;

    Stack<RateCommand> ratesMade;
    Stack<RateCommand> undoneRates;

}
