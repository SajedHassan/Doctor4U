package doctor4u.model.DTOs;

import java.util.ArrayList;
import java.util.Date;
import java.util.Stack;

import doctor4u.model.notifications.Notification;
import doctor4u.model.rateables.DoctorCard;
import doctor4u.model.ratingLogic.RateCommand;
import doctor4u.model.reviews.Review;

public class RegisteredUserDetails {

    public String userName;
    public String password;
    public int ID;
    public String mail;
    public String phone;
    public int gender;
    public Date birthDate;
    public int cityID;

    public ArrayList<DoctorCard> favoriteDoctors;
    public  ArrayList<Notification> notifications;
    public ArrayList<Review> reviews;

    public Stack<RateCommand> ratesMade;
    public Stack<RateCommand> undoneRates;

}
