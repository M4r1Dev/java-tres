package kameru.module;

/**
 * Interfaces for the registration service.
 */
public interface RegistrationService {

    /**
     * Registers a new user.
     *
     * @param user The user to register.
     * @return true if the registration was successful, false otherwise.
     */
    boolean registerUser(User user);

    /**
     * Validates the user data.
     *
     * @param user The user to validate.
     * @return true if the user data is valid, false otherwise.
     */
    boolean validateUser(User user);
}