package doctor4u.model.ratingLogic;

import doctor4u.model.exceptions.UnauthorizedException;
import doctor4u.model.rateables.RatedItem;
import doctor4u.model.reviews.Rating;
import doctor4u.model.users.User;

public interface RatingManager {

    Rating rate(User user, RatedItem item , int rate) throws UnauthorizedException;

}
