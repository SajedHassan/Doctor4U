package doctor4u.model.rateables;

import java.util.ArrayList;

import doctor4u.model.DTOs.Contacts;
import doctor4u.model.DTOs.ScheduleDetails;
import doctor4u.model.reviews.Review;

public class ConcreteDoctorCard implements DoctorCard {


    private ArrayList<ScheduleDetails> hospitals;
    private ArrayList<ScheduleDetails> clinics;
    private ArrayList<Review> reviews;
    private int rating;
    private int numberOfUsersRatings;
    private int numberOfViews;
    private int numberOfReviews;
    private String name;
    private String speciality;
    private int age;
    private String description;
    private Contacts contacts;
    private String scientificDegree;


    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public String getScientificDegree() {
        return null;
    }

    @Override
    public int getNumberOfUsersRated() {
        return numberOfUsersRatings;
    }

    @Override
    public int getNumberOfViews() {
        return numberOfViews;
    }


    @Override
    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    @Override
    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public ArrayList<ScheduleDetails> getHospitalDetails() {
        return hospitals;
    }
    @Override
    public ArrayList<ScheduleDetails> getClinicsDetails() {
        return clinics;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSpeciality() { return speciality; }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getBriefDescription() {
        return description;
    }

    @Override
    public Contacts getContacts() {
        return contacts;
    }

    @Override
    public void setClinics(ArrayList<ScheduleDetails> clinics) {
        this.clinics = clinics;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setHospitals(ArrayList<ScheduleDetails> hospitals) {
        this.hospitals = hospitals;
    }

    @Override
    public void setNumberOfUsersRatings(int numberOfUsersRatings) {
        this.numberOfUsersRatings = numberOfUsersRatings;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setNumberOfReviews(int numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    @Override
    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }

    @Override
    public void setSpeciality(String Speciality) { this.speciality = Speciality; }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public void setScientificDegree(String scientificDegree) { this.scientificDegree = scientificDegree; }
}
