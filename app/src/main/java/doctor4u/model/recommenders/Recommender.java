package doctor4u.model.recommenders;

import java.util.ArrayList;

import doctor4u.model.rateables.DoctorCard;
import doctor4u.model.rateables.RatedItem;


public interface Recommender{

    ArrayList<RatedItem> recommend(String location);
    ArrayList<DoctorCard> recommendDoctors(String specialization);


}
