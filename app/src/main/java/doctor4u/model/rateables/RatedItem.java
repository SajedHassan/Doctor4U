package doctor4u.model.rateables;

import java.util.ArrayList;

import doctor4u.model.reviews.Review;
import doctor4u.model.users.User;



public interface RatedItem {
    int getRating();
    int getNumberOfUsersRated();

    int getNumberOfViews();

    int getNumberOfReviews();
    ArrayList<Review> getReviews();

}
