package com.romeo.main.interceptor;

// Importing necessary classes from the servlet package and Spring framework
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Importing the HandlerInterceptor interface and ModelAndView class from Spring framework
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

// Importing the User1 model class which is used for user session data
import com.romeo.main.model.User1;

/**
 * This class serves as an interceptor in the Spring MVC framework, which is used to 
 * check whether a user is logged in before proceeding with the request handling.
 * 
 * The @HandlerInterceptor interface provides three methods: preHandle(), postHandle(), and afterCompletion().
 * The main purpose of this interceptor is to ensure that users are authenticated before accessing certain resources.
 */
public class AuthHandlerInterceptor implements HandlerInterceptor {

    /**
     * This method is executed before the actual handler (controller) is invoked.
     * It checks whether a user is logged in by examining the session.
     * 
     * If the user is logged in (session contains a "loginUser" attribute), the request is allowed to proceed.
     * If the user is not logged in (session does not contain the "loginUser" attribute), the request is blocked,
     * and a message is sent to the response prompting the user to log in.
     * 
     * @param request The HttpServletRequest object that contains the incoming request data.
     * @param response The HttpServletResponse object that allows you to send a response to the client.
     * @param handler The handler (controller) that will process the request after this interceptor.
     * @return true if the request is allowed to proceed, false if it is blocked.
     * @throws Exception In case of any errors during the execution of the interceptor.
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // Logging to track the pre-handler interception
        System.out.println("pre handler interceptor");

        // Fetching the user session attribute "loginUser" to check if the user is logged in.
        User1 user1 = (User1) request.getSession().getAttribute("loginUser");

        // If the user is logged in (user1 is not null), allow the request to proceed.
        if (user1 != null) {
            return true;
        } else {
            // If the user is not logged in, send an HTML response with a "Please Login" message.
            response.getWriter().print("<h1>Please Login</h1>");
            return false;  // Blocking further request processing
        }
    }

    /**
     * This method is executed after the handler (controller) is executed, but before the view is rendered.
     * It allows for any post-processing, such as modifying the model or handling response data.
     * 
     * In this case, it does not perform any action, but can be useful for logging or analytics purposes.
     * 
     * @param request The HttpServletRequest object containing the request data.
     * @param response The HttpServletResponse object used to send the response to the client.
     * @param handler The handler (controller) that has already processed the request.
     * @param modelAndView The ModelAndView object used to return a model and view to the client.
     * @throws Exception If any exception occurs during post-processing.
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        // Logging to track the post-handler interception
        System.out.println("post handler interceptor");
    }

    /**
     * This method is executed after the entire request has been processed, and the view has been rendered.
     * It is useful for final cleanup tasks, such as logging or releasing resources.
     * 
     * @param request The HttpServletRequest object containing the request data.
     * @param response The HttpServletResponse object used to send the response.
     * @param handler The handler (controller) that has processed the request.
     * @param ex Any exception thrown during the request processing (can be null).
     * @throws Exception If any exception occurs during the cleanup.
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // Logging to track the after-completion phase of the request handling
        System.out.println("after completion interceptor");
    }
}
