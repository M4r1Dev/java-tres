package kameru.module;

/**
 * representa el nombre de un usuario en en el sistema de sitio kameru.
 */
public class User {
    private String userId;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    /**
     * constructor prederminado para la clase usuario.
     */
    public User() {
    }

    /**
     * Constructor para la clase usuario.
     *
     * @param userId      
     * @param username   
     * @param password    
     * @param email       
     * @param firstName  
     * @param lastName   
     * @param phoneNumber .
     * @param address     
     */
    public User(String userId, String username, String password, String email, String firstName, String lastName, String phoneNumber, String address) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    /**
     * obtiene el id
     *
     * @return The user ID.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * establece el id.
     *
     * @param userId 
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * obtiene el nombre.
     *
     * @return .
     */
    public String getUsername() {
        return username;
    }

    /**
     * establece el nombre de usuario.
     *
     * @param username nombre de usuario establecido.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * obtiene la contraseña.
     *
     * @return la contraseña.
     */
    public String getPassword() {
        return password;
    }

    /**
     * establecer la contraseña.
     *
     * @param password La contraseña esgtablecida.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *obtiene el email.
     *
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * establecer los detalles del correo
     * .
     *
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * obtiene el nombre.
     *
     * @return T
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * establecer el nombre.
     *
     * @param firstName The first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * obtiene el apellido
     *
     * @return .
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * establece el apellido.
     *
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * obtiene el numero.
     *
     * @return The phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * establece el numero.
     *
     * @param phoneNumber The phone number to set.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * obtiene la direccion.
     *
     * @return la direccion.
     */
    public String getAddress() {
        return address;
    }

    /**
     * establece la direccions.
     *
     * @param address la direccion.
     */
    public void setAddress(String address) {
        this.address = address;
    }
}