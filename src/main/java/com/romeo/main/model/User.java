package com.romeo.main.model;

/**
 * The `User` class represents a user entity in the system. It is a basic Java class that serves as a model 
 * for storing user-related data such as the user's name, username, email, password, contact number, and image.
 * This class is used in the application's data layer for managing user information.
 * 
 * The class uses private fields to encapsulate the user details, and public getter and setter methods to 
 * access and modify these fields. This adheres to the principles of Object-Oriented Programming (OOP), 
 * specifically encapsulation and abstraction.
 */
public class User {

    // Fields representing user attributes (private for encapsulation)
    private String name;
    private String username;
    private String email;
    private String password;
    private String contactnumber;
    private String image;

    /**
     * Default constructor for the `User` class. 
     * This constructor is provided for creating a new instance of `User` without any initial values.
     * 
     * It is a no-argument constructor, and it can be used when creating a `User` object, 
     * which will later be populated using setter methods or other methods in the application.
     */
    public User() {
    }

    // Getter and Setter methods

    /**
     * Getter for the `name` field.
     * This method returns the name of the user.
     * 
     * @return A `String` representing the user's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the `name` field.
     * This method sets the name of the user.
     * 
     * @param name The name of the user.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the `username` field.
     * This method returns the username of the user.
     * 
     * @return A `String` representing the user's username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter for the `username` field.
     * This method sets the username of the user.
     * 
     * @param username The username of the user.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for the `email` field.
     * This method returns the email address of the user.
     * 
     * @return A `String` representing the user's email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter for the `email` field.
     * This method sets the email address of the user.
     * 
     * @param email The email address of the user.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for the `password` field.
     * This method returns the password of the user.
     * 
     * @return A `String` representing the user's password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter for the `password` field.
     * This method sets the password of the user.
     * 
     * @param password The password of the user.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for the `contactnumber` field.
     * This method returns the contact number of the user.
     * 
     * @return A `String` representing the user's contact number.
     */
    public String getContactnumber() {
        return contactnumber;
    }

    /**
     * Setter for the `contactnumber` field.
     * This method sets the contact number of the user.
     * 
     * @param contactnumber The contact number of the user.
     */
    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    /**
     * Getter for the `image` field.
     * This method returns the image (e.g., profile picture) of the user.
     * 
     * @return A `String` representing the image path or URL associated with the user.
     */
    public String getImage() {
        return image;
    }

    /**
     * Setter for the `image` field.
     * This method sets the image (e.g., profile picture) for the user.
     * 
     * @param image The image path or URL associated with the user.
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * The `toString` method provides a string representation of the `User` object. 
     * This is useful for debugging and logging purposes as it allows us to print 
     * the values of the user's attributes in a readable format.
     * 
     * @return A `String` representing the user's information in the format: 
     *         "User [name=name, username=username, email=email, password=password, contactnumber=contactnumber, image=image]"
     */
    @Override
    public String toString() {
        return "User [name=" + name + ", username=" + username + ", email=" + email + ", password=" + password
                + ", contactnumber=" + contactnumber + ", image=" + image + "]";
    }
}
