package doctor4u.model.ratingLogic;


import doctor4u.model.rateables.RatedItem;
import doctor4u.model.users.User;

public interface Rating {
    User getRatter();
    RatedItem getRatedItem();
    int getRating();
}
