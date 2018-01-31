package doctor4u.model.reviews;

import doctor4u.model.rateables.RatedItem;
import doctor4u.model.users.User;

public interface Review {

    User getComposer();
    RatedItem getReviewedItem();
    String getTheReviewText();

}
