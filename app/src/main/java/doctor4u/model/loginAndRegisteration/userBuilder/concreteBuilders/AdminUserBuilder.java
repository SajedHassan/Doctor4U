package doctor4u.model.loginAndRegisteration.userBuilder.concreteBuilders;

import doctor4u.model.users.usersStates.AdminUserState;


public class AdminUserBuilder extends StandardBuilder {

    @Override
    public void buildUserState() {
        user.setState(new AdminUserState());
    }
}
