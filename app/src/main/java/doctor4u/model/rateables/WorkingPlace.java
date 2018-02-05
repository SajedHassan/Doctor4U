package doctor4u.model.rateables;


import java.util.ArrayList;


public interface WorkingPlace extends RatedItem{

    ArrayList<DoctorCard> getWorkingDoctors();
    String getAddress();
    String getPhone();
    void addToWorkingDoctors(DoctorCard card);

}
