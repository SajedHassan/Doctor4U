package doctor4u.model.loginAndRegisteration.userBuilder.concreteBuilders;

import doctor4u.model.users.usersStates.GuestUserState;


public class GuestUserStateBuilder extends StandardBuilder{
    @Override
    public void buildUserState() {
        user.setState(new GuestUserState());
    }
}
