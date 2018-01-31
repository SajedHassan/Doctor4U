package doctor4u.model.recommenders;


public interface RecommendersFactory {


    Recommender getRecommender(int type);
    //recommenders for hospitals, clinics and doctors


}
