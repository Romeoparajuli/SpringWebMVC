package com.romeo.main.model;

/**
 * The `User1` class represents a simple model for a user in the system, specifically designed to store and manage
 * a user's name. This class demonstrates fundamental Object-Oriented Programming (OOP) concepts such as **encapsulation** and **data abstraction**.
 * It includes basic functionality for storing and retrieving a user's name using getter and setter methods.
 * 
 * This class can be extended or modified to include additional user details in future applications as per the requirements.
 * The `User1` class is often used when minimal user data is required, such as a placeholder or for demonstration purposes.
 */
public class User1 {

    // Private field to store the name of the user. The field is private to ensure that it is only accessed and modified
    // through the provided getter and setter methods, following the principle of **encapsulation** in OOP.
    private String name;

    /**
     * Constructor for the `User1` class.
     * This constructor initializes a `User1` object with the specified name.
     * 
     * @param name A `String` representing the user's name. This parameter is used to set the `name` field during object creation.
     */
    public User1(String name) {
        // The constructor initializes the `name` field of the object with the provided value.
        this.name = name;
    }

    /**
     * Getter for the `name` field.
     * This method returns the value of the `name` field, allowing external access to the name of the user.
     * The `getName` method provides **read-only** access to the `name` field.
     * 
     * @return A `String` representing the name of the user.
     */
    public String getName() {
        // Returning the value of the `name` field.
        return name;
    }

    /**
     * Setter for the `name` field.
     * This method allows external code to set or update the value of the `name` field.
     * The setter method enables **write access** to the `name` field while maintaining control over how the field is modified.
     * 
     * @param name A `String` representing the new name of the user.
     */
    public void setName(String name) {
        // Updating the `name` field with the provided value.
        this.name = name;
    }
}
