package com.romeo.main.dao; 

// Import necessary Spring classes for database interaction
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

// Import the User model class that contains user data
import com.romeo.main.model.User;

/**
 * The UserDao class is responsible for interacting with the database
 * to perform CRUD (Create, Read, Update, Delete) operations related to User entities.
 * It uses Spring's JdbcTemplate to simplify database interactions and handle 
 * common tasks such as connection management and exception handling.
 * 
 * This class is annotated with @Repository, marking it as a DAO component in the Spring context.
 * It is automatically discovered by Spring during component scanning and is made available for 
 * dependency injection in service classes.
 */
@Repository
public class UserDao {

    // The JdbcTemplate is automatically injected by Spring via Dependency Injection.
    // It is used for executing SQL queries and updates.
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * This method inserts a new user into the database.
     * It receives a User object as a parameter, extracts the user's attributes, and
     * saves them into the 'users' table in the database.
     * 
     * @param user The User object that contains the data to be inserted into the database.
     * @return int The number of rows affected by the insert operation. 
     *         A return value of 1 indicates that one row was successfully inserted.
     */
    public int saveUser(User user) {
        
        // Define the SQL query to insert a new record into the 'users' table.
        // The '?' placeholders are used to parameterize the query and prevent SQL injection.
        String query = "INSERT INTO users (name, username, email, password, contactnumber, image) VALUES (?, ?, ?, ?, ?, ?)";

        // Execute the update query using JdbcTemplate's update method.
        // The method replaces each '?' in the query with the corresponding values from the User object.
        // These values include the user's name, username, password, email, contact number, and image.
        int i = jdbcTemplate.update(query, 
                                    user.getName(), 
                                    user.getUsername(), 
                                    user.getPassword(), 
                                    user.getEmail(),
                                    user.getContactnumber(), 
                                    user.getImage());

        // The method returns the number of rows affected by the query.
        // In this case, if the insert was successful, it will return 1 (one row inserted).
        return i;
    }
}
