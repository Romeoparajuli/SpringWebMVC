package com.romeo.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romeo.main.dao.UserDao;
import com.romeo.main.model.User;

/**
 * The `UserServiceImpl` class is the implementation of the `UserService` interface.
 * It defines the actual business logic for user-related operations such as registering a user.
 * This class serves as a bridge between the controller (which handles user requests) and the data access layer (represented by the `UserDao` class).
 * 
 * By annotating the class with `@Service`, we mark it as a Spring-managed bean that provides business logic for user management.
 * Spring will automatically detect and manage this class as a service component, making it available for dependency injection throughout the application.
 * 
 * This implementation leverages the DAO pattern by calling the `UserDao` class to persist user data in the database.
 * 
 * The `UserServiceImpl` class promotes the **separation of concerns** by delegating the database-related tasks to the `UserDao` class,
 * allowing the business logic to remain clean and focused on high-level operations.
 */
@Service
public class UserServiceImpl implements UserService {

    // Injecting the `UserDao` bean to interact with the database layer
    @Autowired
    private UserDao userDao;

    /**
     * Registers a new user in the system.
     * This method handles the user registration logic and delegates the actual saving process to the DAO layer (`UserDao`).
     * The method accepts a `User` object which contains all the necessary data for user registration, such as name, email, password, etc.
     * 
     * The service layer (in this case, `UserServiceImpl`) is responsible for implementing the business rules of the system, 
     * while the data access layer (in this case, `UserDao`) handles the persistence operations (e.g., saving data to the database).
     *
     * @param user The `User` object containing the user's details to be registered.
     * @return An integer indicating the result of the registration operation. 
     *         The integer value corresponds to the number of rows affected in the database, usually returned by the `saveUser` method in the DAO layer.
     *         A positive number typically indicates a successful operation, while a negative number might indicate failure.
     */
    @Override
    public int registerUser(User user) {
        // Calling the DAO layer to save the user to the database
        int i = userDao.saveUser(user);

        // Returning the result of the save operation (number of affected rows)
        return i;
    }
}
