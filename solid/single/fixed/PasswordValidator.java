public class PasswordValidator {

    private static final int MIN_PASSWORD_LENGTH = 8;
    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$";

    //Kiss: Mantener logica simple
    public boolean validate(String password){
        return password != null &&
                password.length() >= MIN_PASSWORD_LENGTH &&
                password.matches(PASSWORD_PATTERN);
    }

}
