package com.romeo.main.controller;

// Importing necessary classes from the javax.servlet and Spring framework for session handling
import javax.servlet.http.HttpSession;

// Importing necessary annotations from the Spring framework
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This class acts as a controller for user-related operations in the application.
 * It handles the requests for user profile viewing and user logout functionality.
 * 
 * The @Controller annotation marks this class as a Spring MVC controller.
 * The @RequestMapping annotation defines the base path '/user' for all request mappings in this controller.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    
    /**
     * This method handles the GET request for displaying the user's profile page.
     * 
     * @param session The HttpSession object is injected to allow session management, although it's not used here directly.
     * @return A String representing the logical view name "Userprofile", which will be resolved by the view resolver.
     *         The corresponding view (e.g., a JSP or HTML page) will be returned to the client.
     */
    @RequestMapping(path = "/Profile", method = RequestMethod.GET)
    public String profile(HttpSession session) {
        // This method is responsible for displaying the profile of the logged-in user.
        // It simply returns the view name for the profile page.
        return "Userprofile";  // This refers to the view name, which will resolve to a JSP or HTML file (e.g., /WEB-INF/jsp/Userprofile.jsp)
    }
    
    /**
     * This method handles the GET request for logging out the user.
     * It removes the "loginUser" attribute from the session, effectively logging the user out.
     * After logging out, it redirects the user to the home page ("/index").
     * 
     * @param session The HttpSession object used to manage the session and remove the login attribute.
     * @return A String representing a redirect to the home page.
     *         After logging out, the user is redirected to the index page.
     */
    @RequestMapping(path = "/Logout", method = RequestMethod.GET)
    public String profilelogout(HttpSession session) {
        // Removes the "loginUser" attribute from the session, effectively logging out the user.
        session.removeAttribute("loginUser");  // This ensures that the session no longer contains user information.
        
        // Redirects the user to the home page (index.jsp or equivalent).
        return "redirect:/index";  // 'redirect:' is a Spring MVC prefix that tells Spring to perform a redirect to the specified URL.
    }
}
