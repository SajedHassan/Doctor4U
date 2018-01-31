package doctor4u.model.rateables;


public interface DoctorCard extends RatedItem{


    void getHospitals();
    void getTimesAvailableAtHospital(); //name to be changed

    void getClinics();
    void getTimesAvailableAtClinics(); //name to be changed

}
