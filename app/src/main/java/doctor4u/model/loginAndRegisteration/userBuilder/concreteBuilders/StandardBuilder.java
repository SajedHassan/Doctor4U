package doctor4u.model.loginAndRegisteration.userBuilder.concreteBuilders;

import doctor4u.model.DTOs.DoctorDetails;
import doctor4u.model.DTOs.RegisteredUserDetails;
import doctor4u.model.loginAndRegisteration.userBuilder.UserBuilder;
import doctor4u.model.users.User;



public abstract class StandardBuilder implements UserBuilder {
    protected User user;

    @Override
    public void buildUserDetails(RegisteredUserDetails details) {
        user.setRegisteredUserDetails(details);
    }

    @Override
    public void buildDetailsAsDoctor(DoctorDetails details) {
        user.setDetailsAsDoctor(details);
    }

    @Override
    public User getUser() {
        return user;
    }
}
