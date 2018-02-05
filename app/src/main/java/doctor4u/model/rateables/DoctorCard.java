package doctor4u.model.rateables;


import java.util.ArrayList;

import doctor4u.model.DTOs.Contacts;
import doctor4u.model.DTOs.ScheduleDetails;
import doctor4u.model.reviews.Review;

public interface DoctorCard extends RatedItem{


    ArrayList<ScheduleDetails> getHospitalDetails(); //name to be changed
    ArrayList<ScheduleDetails> getClinicsDetails(); //name to be changed
    String getName();
    String getProfession(); // msh faker mgal y3ny eh
    int getAge();
    String getBriefDescription();
    Contacts getContacts();



    // when creating the card
    void setClinics(ArrayList<ScheduleDetails> clinics);
    void setAge(int age);
    void setContacts(Contacts contacts);
    void setDescription(String description);
    void setHospitals(ArrayList<ScheduleDetails> hospitals);
    void setNumberOfUsersRatings(int numberOfUsersRatings);
    void setName(String name);
    void setNumberOfReviews(int numberOfReviews);
    void setNumberOfViews(int numberOfViews);
    void setProfession(String profession);
    void setRating(int rating);
    void setReviews(ArrayList<Review> reviews);
}
