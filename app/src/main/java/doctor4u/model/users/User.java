package doctor4u.model.users;

import java.util.ArrayList;

import doctor4u.model.rateables.RatedItem;
import doctor4u.model.users.usersStates.UserState;

public interface User {


    void setState(UserState state);

    void addDoctorToFavorites();

    void rateItem(RatedItem item, int rate);
    ArrayList getPreviousRates();
    void clearRateHistory();
    void addReview(RatedItem item);

    void setDetailsAsDoctor();
    void getDetailsAsDoctor();

}
