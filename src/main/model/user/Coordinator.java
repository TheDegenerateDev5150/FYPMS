package main.model.user;

import main.utils.parameters.NotNull;

import java.util.Map;

/**
 * A class that represents a coordinator
 */
public class Coordinator implements User {
    /**
     * The ID of the coordinator
     */
    private String coordinatorID;
    /**
     * The name of the coordinator
     */
    private String coordinatorName;
    /**
     * The email of a coordinator
     */
    private String email;
    /**
     * The password of a coordinator
     */
    private String hashedPassword;

    /**
     * constructor of a new Coordinator object with the specified coordinator ID,Name and email
     *
     * @param coordinatorID   the ID of the coordinator
     * @param coordinatorName the name of the coordinator
     * @param email           the email of the coordinator
     */
    public Coordinator(String coordinatorID, String coordinatorName, String email) {
        this.coordinatorID = coordinatorID;
        this.coordinatorName = coordinatorName;
        this.email = email;
    }

    /**
     * constructor of a new Coordinator object with the specified coordinator ID and password
     *
     * @param coordinatorID   the ID of the coordinator
     * @param coordinatorName the name of the coordinator
     * @param email           the email of the coordinator
     * @param password        the password of the coordinator
     */
    public Coordinator(String coordinatorID, String coordinatorName, String email, @NotNull String password) {
        this.coordinatorID = coordinatorID;
        this.coordinatorName = coordinatorName;
        this.email = email;
        this.hashedPassword = password;
    }

    /**
     * Converts the map to a coordinator object
     *
     * @param map the map
     */
    public Coordinator(Map<String, String> map) {
        this.fromMap(map);
    }

    /**
     * default constructor
     */
    public Coordinator() {
        this.coordinatorID = "";
        this.coordinatorName = "";
        this.email = "";
    }

    /**
     * Returns a User object representing a Coordinator, created from the given map of key-value pairs.
     * The map should contain the necessary data to construct a Coordinator object.
     *
     * @param map a Map object containing key-value pairs of user data
     * @return a User object representing a Coordinator
     */
    public static User getUser(Map<String, String> map) {
        return new Coordinator(map);
    }

    /**
     * gets the user ID of the user
     *
     * @return the ID of the user
     */
    public String getID() {
        return this.coordinatorID;
    }

    /**
     * gets the name of the user
     *
     * @return name of the user
     */
    public String getUserName() {
        return this.coordinatorName;
    }

    /**
     * gets the hashed password of the user
     *
     * @return the hashed password of the user
     */
    @Override
    public String getHashedPassword() {
        return this.hashedPassword;
    }

    /**
     * sets the hashed password of the user
     *
     * @param hashedPassword the hashed password of the user
     */
    @Override
    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    /**
     * gets the email of the user
     *
     * @return the email of the user
     */
    @Override
    public String getEmail() {
        return this.email;
    }

    /**
     * setter for the email
     *
     * @param email the coordinator's email to be set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * setter for the coordinatorID
     *
     * @param coordinatorID the coordinator's ID to be set
     */
    public void setCoordinatorID(String coordinatorID) {
        this.coordinatorID = coordinatorID;
    }

    /**
     * setter for the coordinatorName
     *
     * @param coordinatorName the coordinator's name to be set
     */
    public void setCoordinatorName(String coordinatorName) {
        this.coordinatorName = coordinatorName;
    }
}
