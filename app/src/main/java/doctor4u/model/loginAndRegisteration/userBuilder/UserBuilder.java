package doctor4u.model.loginAndRegisteration.userBuilder;

import doctor4u.model.DTOs.DoctorDetails;
import doctor4u.model.DTOs.RegisteredUserDetails;
import doctor4u.model.users.User;


public interface UserBuilder {

    void buildUserState();
    void buildUserDetails(RegisteredUserDetails details);
    void buildDetailsAsDoctor(DoctorDetails details);
    User getUser();

}
