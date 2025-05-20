package kameru.module;

/**
 * clases.
 */
public class Main {

    public static void main(String[] args) {
        // Create instances of the necessary classes
        UserRepository userRepository = new InMemoryUserRepository();
        RegistrationService registrationService = new RegistrationServiceImpl(userRepository);
        RegistrationController registrationController = new RegistrationController(registrationService);

        // Create a new user
        User user = new User();
        user.setUserId("123");
        user.setUsername("testuser");
        user.setPassword("password");
        user.setEmail("test@example.com");
        user.setFirstName("Test");
        user.setLastName("User");
        user.setPhoneNumber("123-456-7890");
        user.setAddress("123 Main St");

        // Register the user
        boolean registrationResult = registrationController.registerUser(user);

        // Print the registration result
        if (registrationResult) {
            System.out.println("User registered successfully!");
        } else {
            System.out.println("User registration failed.");
        }
    }
}