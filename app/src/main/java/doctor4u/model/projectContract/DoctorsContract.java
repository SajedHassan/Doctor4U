package doctor4u.model.projectContract;


public class DoctorsContract {

    public static class UserInfo{
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_OTHER = 3;
    }

    public static class BuildersNames{

        public static final String REGISTERED_USER = "doctor4u.model.loginAndRegisteration.userBuilder.concreteBuilders.RegisteredUserBuilder";
        public static final String ADMIN_USER = "doctor4u.model.loginAndRegisteration.userBuilder.concreteBuilders.AdminUserBuilder";
        public static final String GUEST_USER = "doctor4u.model.loginAndRegisteration.userBuilder.concreteBuilders.GuestUserBuilder";
        public static final String DOCTOR_USER = "doctor4u.model.loginAndRegisteration.userBuilder.concreteBuilders.DoctorUserBuilder";


    }

}
