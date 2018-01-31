package doctor4u.model.modelInterface;


import doctor4u.model.DTOs.RegisterDetails;

public interface ModelInterface {
    void login(String userName , String password);
    boolean register(RegisterDetails details);
}
