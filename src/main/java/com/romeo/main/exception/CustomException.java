package com.romeo.main.exception;

// Import necessary Spring annotations for global exception handling
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * The CustomException class is a centralized exception handling mechanism 
 * that helps manage errors across the entire application. It is annotated with 
 * @ControllerAdvice, which marks this class as one that provides global exception handling
 * for Spring MVC controllers.
 * 
 * @ControllerAdvice allows us to handle exceptions thrown by any controller in one place, 
 * making error management more organized and maintainable.
 */
@ControllerAdvice
public class CustomException {

    /**
     * The handleException method is responsible for catching all exceptions 
     * of type `Exception` thrown within the controllers.
     * This method is annotated with `@ExceptionHandler`, which tells Spring to
     * invoke this method when an exception of the specified type is thrown.
     * 
     * In this case, we are handling the generic `Exception` class, meaning it will 
     * catch any exception that occurs during the request processing in the controller layer.
     * 
     * @return A string representing the name of the error page that will be rendered 
     *         when an exception is encountered.
     *         Here, it returns "error", which maps to an error view (usually an HTML page)
     *         that will be displayed to the user when an exception occurs.
     */
    @ExceptionHandler(Exception.class)
    public String handleException() {
        // Return the name of the error view (e.g., error.html or error.jsp)
        return "error";
    }
}
