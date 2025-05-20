package kameru.module;

/**
 *implementacion de los registros de la interfaz de usuario.
 */
public class RegistrationServiceImpl implements RegistrationService {

    private UserRepository userRepository;

    /**
     * constructor para las clases del repositorio de usuarios.
     *
     * @param userRepository el repositorio a utilizar
     */
    public RegistrationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * registros de un nuevo usuario.
     *
     * @param user los usuarios registrados .
     * @return true if the registration was successful, false otherwise.
     */
    @Override
    public boolean registerUser(User user) {
        if (validateUser(user)) {
            userRepository.save(user);
            return true;
        }
        return false;
    }

    /**
     * valida los datos del usuario.
     *
     * @param user 
     * @return true if the user data is valid, false otherwise.
     */
    @Override
    public boolean validateUser(User user) {
        // Add validation logic here (e.g., check for empty fields, valid email format, etc.)
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            return false;
        }
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            return false;
        }
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            return false;
        }
        return true;
    }
}