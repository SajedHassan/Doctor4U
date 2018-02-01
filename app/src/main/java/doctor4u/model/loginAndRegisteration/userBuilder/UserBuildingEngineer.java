package doctor4u.model.loginAndRegisteration.userBuilder;

import doctor4u.model.DTOs.DoctorDetails;
import doctor4u.model.DTOs.RegisteredUserDetails;
import doctor4u.model.exceptions.NoSuchUserTypeException;
import doctor4u.model.users.User;

public class UserBuildingEngineer {

    UserBuilder builder;

    public void setBuilder(String type) {
        try {
            builder = (UserBuilder) Class.forName(type).newInstance();
        } catch (Exception e) {
            throw new NoSuchUserTypeException();
        }
    }

    public User constructUser(RegisteredUserDetails userDetails, DoctorDetails doctorDetails) {
        builder.buildUserState();
        builder.buildDetailsAsDoctor(doctorDetails);
        builder.buildUserDetails(userDetails);
        return builder.getUser();
    }
}
