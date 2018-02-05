package doctor4u.model.rateables;


import java.util.ArrayList;

import doctor4u.model.DTOs.Contacts;
import doctor4u.model.DTOs.ScheduleDetails;
import doctor4u.model.reviews.Review;

public interface DoctorCard extends RatedItem{


    ArrayList<ScheduleDetails> getHospitalDetails(); //name to be changed
    ArrayList<ScheduleDetails> getClinicsDetails(); //name to be changed
    String getName();
    String getSpeciality();
    int getAge();
    String getBriefDescription();
    Contacts getContacts();
    int getRating();
    String getScientificDegree();


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
    void setSpeciality(String Speciality);
    void setRating(int rating);
    void setReviews(ArrayList<Review> reviews);
    void setScientificDegree(String degree); //e.g: esteshaary , a5esa2y ,...etc
}
