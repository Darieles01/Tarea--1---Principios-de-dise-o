public class Main {
public static void main(String[] args) {
        UsernameValidator usernameValidator = new UsernameValidator();
        PasswordValidator passwordValidator = new PasswordValidator();

        UserDataManagerFixed userManager = new UserDataManagerFixed("john_doe", "Password123", usernameValidator, passwordValidator);
        userManager.registerUser();
        userManager.loginUser();
    }
}
