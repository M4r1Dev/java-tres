package kameru.module;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementacion of the UserRepository interface that stores users in memory.
 */
public class InMemoryUserRepository implements UserRepository {

    private Map<String, User> users = new HashMap<>();

    /**
     * Saves a user to the in-memory store.
     *
     * @param user The user to save.
     */
    @Override
    public void save(User user) {
        users.put(user.getUsername(), user);
    }

    /**
     * Finds a user by username in the in-memory store.
     *
     * @param username The username to search for.
     * @return The user with the given username, or null if not found.
     */
    @Override
    public User findByUsername(String username) {
        return users.get(username);
    }
}