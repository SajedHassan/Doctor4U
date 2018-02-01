package doctor4u.model.loginAndRegisteration.userBuilder.concreteBuilders;

import doctor4u.model.users.usersStates.RegisteredUserState;


public class RegisteredUserBuilder extends StandardBuilder {

    @Override
    public void buildUserState() {
            user.setState(new RegisteredUserState());
    }


}
