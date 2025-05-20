package kameru.module;

/**
 * interfaces para usar un repositorio.
 */
public interface UserRepository {

    /**
     * guardar un usuario.
     *
     * @param user el usuario que se guarda.
     */
    void save(User user);

    /**
     * encuentra un usuario por nombre de usuario
     *
     * @param username El nombre de usuario que se buscara.
     * @return el usuario con el nombre de usuario dado en el username
     */
    User findByUsername(String username);
}