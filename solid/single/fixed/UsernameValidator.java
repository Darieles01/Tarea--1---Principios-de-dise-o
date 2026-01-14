public class UsernameValidator {
    
    private static final int MIN_USERNAME_LENGTH = 5;
    private static final String USERNAME_PATTERN = "[a-zA-Z_0-9]+";

    //Kiss: Mantener logica simple
    public boolean validate(String username){
        return username != null &&
                username.length() >= MIN_USERNAME_LENGTH &&
                username.matches(USERNAME_PATTERN);
    }
}
