package doctor4u.model.ratingLogic;

import doctor4u.model.exceptions.UnauthorizedException;


public interface RateCommand {
    //User user, RatedItem item , int rate parameters in constructor
    void rate() throws UnauthorizedException;
    void unRate() throws UnauthorizedException;


}
