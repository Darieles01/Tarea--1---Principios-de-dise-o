public class UserDataManagerFixed {
    private String username;
    private String password;
    private UsernameValidator usernameValidator;
    private PasswordValidator passwordValidator;

    //Bajo acoplamiento: Inyectar dependencias a traves del constructor
    public UserDataManagerFixed(String username, String password, UsernameValidator usernameValidator, PasswordValidator passwordValidator) {
        this.username = username;
        this.password = password;
        this.usernameValidator = usernameValidator;
        this.passwordValidator = passwordValidator;
    }

    //DRY: Metodo privado para evitar duplicaciones de validacion.
    private boolean isValid(){
        return usernameValidator.validate(username) && passwordValidator.validate(password);
    }

    //YANGI: Solo se implementa lo necesario
    public void registerUser() {
        if (isValid()) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    //DRY: Reutilizacion de logica de validacion
    public void loginUser() {
        if (isValid()) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
