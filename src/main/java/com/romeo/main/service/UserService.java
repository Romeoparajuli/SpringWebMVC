package com.romeo.main.service;

import com.romeo.main.model.User;

/**
 * The `UserService` interface provides a contract for user-related operations in the system.
 * It defines the methods that should be implemented by any class that handles user-related functionality.
 * The `UserService` interface promotes the use of the **service layer** in the **Layered Architecture** pattern.
 * It ensures separation of concerns by defining high-level business logic for user management, leaving the actual implementation to concrete service classes.
 * 
 * Interfaces are used to decouple the business logic from the actual implementation. This allows for greater flexibility
 * and easier testing, as the service layer can be mocked in unit tests.
 * 
 * The service interface provides an abstraction for user operations such as user registration.
 */
public interface UserService {

    /**
     * Registers a new user in the system.
     * This method defines the **business logic** for user registration and may include tasks such as:
     * - Validating user input.
     * - Persisting the user data to a database.
     * - Possibly hashing the user's password before storage.
     * 
     * @param user The `User` object that contains all the necessary information for registration.
     *              This object should include fields such as `name`, `username`, `email`, `password`, etc.
     * @return An integer representing the status of the registration operation:
     *         - A positive integer indicates that the registration was successful (e.g., number of rows affected in the database).
     *         - A negative value or zero could represent failure (e.g., user already exists, invalid input, etc.).
     */
    public int registerUser(User user);

}
