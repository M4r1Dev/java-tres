package kameru.module; /** seguimientos */

/**
 * Controller for handling user registration requests.
 */
public class RegistrationController {

    private RegistrationService registrationService;

    /**
     * Constructor for the RegistrationController class.
     *
     * @param registrationService The registration service to use.
     */
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    /**
     * Registers a new user.
     *
     * @param user The user to register.
     * @return true if the registration was successful, false otherwise.
     */
    public boolean registerUser(User user) {
        return registrationService.registerUser(user);
    }
}