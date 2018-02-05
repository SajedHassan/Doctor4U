package doctor4u.model.reviews;


import doctor4u.model.rateables.RatedItem;
import doctor4u.model.users.User;

public class ConcreteReview implements Review {

    User composer;
    RatedItem item;
    String review;

    public ConcreteReview(
            User composer,
            RatedItem item,
            String review){
        this.composer =  composer;
        this.item = item;
        this.review = review;
    }

    @Override
    public User getComposer() {
        return composer;
    }

    @Override
    public RatedItem getReviewedItem() {
        return item;
    }

    @Override
    public String getTheReviewText() {
        return review;
    }
}
