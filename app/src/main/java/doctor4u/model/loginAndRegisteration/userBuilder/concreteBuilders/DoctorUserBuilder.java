package doctor4u.model.loginAndRegisteration.userBuilder.concreteBuilders;


import doctor4u.model.users.usersStates.DoctorUserState;

public class DoctorUserBuilder extends StandardBuilder {
    @Override
    public void buildUserState() {
        user.setState(new DoctorUserState());
    }
}
