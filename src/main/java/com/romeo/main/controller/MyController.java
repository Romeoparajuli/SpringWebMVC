package com.romeo.main.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.romeo.main.model.User;
import com.romeo.main.model.User1;
import com.romeo.main.service.UserService;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    // Autowired UserService to handle business logic related to user management
    // such as user registration, login, etc.
    @Autowired
    private UserService userService;

    /**
     * Handles GET request to the '/homePage' URL. This method is responsible for
     * rendering the "homepage" view, which is typically the landing page.
     *
     * @return ModelAndView - A ModelAndView object that resolves the "homepage"
     *         view.
     */
    @GetMapping("/homePage")
    public ModelAndView openHelloPage1() {
	// Logging to indicate that the method is being executed
	System.out.println("open hello page method executed");

	// Creating and returning a ModelAndView object that corresponds to the
	// "homepage" view.
	ModelAndView mAndView = new ModelAndView("homepage");

	return mAndView; // The view name ("homepage") is automatically resolved by Spring.
    }

    /**
     * Handles GET request to the '/Loginpage' URL. This method renders the "login"
     * view, which is where users can authenticate themselves.
     * 
     * @param sessions - The HttpSession object to manage session data (user login
     *                 state).
     * @return String - The name of the view to be rendered ("login").
     */
    @RequestMapping(path = "/Loginpage", method = RequestMethod.GET)
    public String openHomePage(HttpSession sessions) {
	// Logging the entry to the login page method.
	System.out.println("im in login page");

	// Returning the name of the view to be rendered, in this case, the "login"
	// page.
	return "login";
    }

    /**
     * Handles POST request to the '/signin' URL. This method simulates user login
     * by storing a user object in the session. The User1 object here represents a
     * mock user that is added to the session for this example.
     * 
     * @param sessions - The HttpSession object used to store user login information
     *                 in the session.
     * @return String - The view name ("login") to display the login page.
     */
    @RequestMapping(path = "/signin")
    public String openHomePage1(HttpSession sessions) {
	// Logging to indicate that the signin method is triggered.
	System.out.println("im in login page again ");
	System.out.println("login handle garni method ");

	// Creating a User1 object with the name "romeo" and setting it as an attribute
	// in the session.
	sessions.setAttribute("loginUser", new User1("romeo"));

	// Returning the name of the view, in this case, the "login" view for further
	// login processing.
	return "login";
    }

    /**
     * Simulates an exception for testing error handling. The method attempts to
     * parse a non-numeric string ("romeo") into an integer, which will throw a
     * NumberFormatException.
     * 
     * @return String - The view name ("helloPage") that will not be executed due to
     *         the exception.
     */
    @GetMapping("/homePage")
    public String openHelloPage() {
	// This line will throw a NumberFormatException because "romeo" cannot be parsed
	// into an integer.
	Integer.parseInt("romeo");

	// The below return statement will not be reached due to the exception.
	return "helloPage"; // This line is unreachable in case of an exception.
    }

    /**
     * Handles global exceptions thrown within the controller. This method is
     * triggered when any uncaught exception is thrown during the request
     * processing. It returns an error view to inform the user that something went
     * wrong.
     * 
     * @return String - The name of the view ("error") to display when an exception
     *         occurs.
     */
    @ExceptionHandler(Exception.class)
    public String handleException() {
	// Returning an error view to display when an exception occurs.
	return "error"; // The "error" view will be rendered to inform the user of an issue.
    }

    /**
     * Handles a GET request to the '/google' URL and performs a redirect to
     * Google's homepage. This is an example of a simple HTTP redirect.
     * 
     * @return String - The redirect view pointing to Google's homepage.
     */
    @RequestMapping(path = "/google") // First method for redirecting to Google
    public String redirectPage1() {
	// Logging that the redirection is happening.
	System.out.println("redirecting to google");

	// Returning a redirect view that points to the external URL (Google).
	return "redirect:https://www.google.com";
    }

    /**
     * Handles a GET request to the '/google' URL and performs a redirect to
     * Google's homepage. This is a second method using the RedirectView object for
     * more control over the redirection.
     * 
     * @return RedirectView - An object that encapsulates the redirection URL
     *         (Google).
     */
    @RequestMapping(path = "/google") // Second method for redirecting to Google using RedirectView
    public RedirectView redirectPage() {
	// Logging the redirection process.
	System.out.println("redirecting to google");

	// Creating a RedirectView object to handle the redirection process.
	RedirectView redirect = new RedirectView();

	// Setting the URL to redirect to.
	redirect.setUrl("https://www.google.com");

	// Returning the RedirectView object to perform the redirection.
	return redirect;
    }

    /**
     * Handles POST request to the '/google' URL. This method performs a search on
     * Google using a keyword passed as a request parameter. The keyword is used to
     * construct a Google search URL, which the user is redirected to.
     *
     * @param keyword - The search term entered by the user in the form.
     * @return String - A redirect to the constructed Google search URL.
     */
    @RequestMapping(path = "/google", method = RequestMethod.POST)
    public String search(@RequestParam("keyword") String keyword) {
	// Construct the Google search URL with the provided keyword.
	String urlString = "https://www.google.com/search?q=" + keyword;

	// Redirecting the user to the constructed Google search URL.
	return "redirect:" + urlString;
    }

    /**
     * Handles GET request to the '/aboutUs' URL. This method is responsible for
     * rendering the "AboutUS" page, which typically contains information about the
     * organization or application.
     *
     * @return String - The name of the view ("AboutUS") to be rendered.
     */
    @GetMapping("/aboutUs")
    public String getAboutPage() {
	// Logging to indicate that the "About Us" page method is being executed.
	System.out.println("About Us page method executed");

	// Returning the view name "AboutUS" to display the About Us page.
	return "AboutUS";
    }

    /**
     * Handles GET request to the '/regform' URL. This method is responsible for
     * rendering the registration form page where users can input their details.
     *
     * @return String - The name of the view ("Reg") that displays the registration
     *         form.
     */
    @GetMapping("/regform")
    public String getFormPage() {
	// Returning the view name "Reg" which renders the registration form.
	return "Reg";
    }

    /**
     * Handles POST request to the '/createUser' URL for user registration. This
     * method processes the user registration form data and saves the user using the
     * UserService. It also provides a success message once the registration is
     * complete.
     *
     * @param user  - The user object populated with data from the registration
     *              form.
     * @param image - A string representing the image (could be the file path or
     *              URL).
     * @param model - The Model object used to pass attributes to the view.
     * @return String - A view name ("Sucess") to display the registration success
     *         page.
     */
    @RequestMapping(path = "/createUser", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute User user, @RequestParam("image") String image, Model model) {
	// Registering the user using the UserService's registerUser method.
	userService.registerUser(user);

	// Adding a success message to the model which will be displayed on the success
	// page.
	model.addAttribute("msg", "Registration Successful");

	// Logging the user details for debugging purposes.
	System.out.println(user);

	// Returning the view name "Sucess" to display a registration success page.
	return "Sucess";
    }

    /**
     * Handles POST request to '/submitForm' URL. This method simulates handling
     * form submission using the traditional `HttpServletRequest` object. It
     * retrieves form field data such as name, username, email, password, and
     * contact number, and logs them for debugging.
     *
     * @param request - The HttpServletRequest object used to get form parameters
     *                directly.
     * @return String - The name of the view ("profile") to be rendered after the
     *         form is submitted.
     */
    @PostMapping("/submitForm")
    public String handleMyForm(HttpServletRequest request) {
	// Retrieving form field data using the HttpServletRequest object.
	String name = request.getParameter("fullName");
	String username = request.getParameter("username");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	String contact = request.getParameter("contactNumber");

	// Logging the form data for debugging purposes.
	System.err.println(".............................");
	System.out.println("name: " + name);
	System.out.println("username: " + username);
	System.out.println("email: " + email);
	System.out.println("password: " + password);
	System.out.println("contact: " + contact);
	System.err.println(".............................");

	// Returning the view name "profile" to render the user profile page.
	return "profile";
    }

    // Method to handle the form submission where user data is captured from the
    // frontend and passed into the controller
    @PostMapping("/submitForm")
    public String handleMyForm(@RequestParam("fullName") String name, @RequestParam("username") String username,
	    @RequestParam("email") String email, @RequestParam("password") String password,
	    @RequestParam("contactNumber") String contactNumber, Model model) {

	// Debugging: Output the received data to the console to verify that form inputs
	// are being passed correctly.
	// This is an essential step during development to ensure that the data received
	// from the front-end matches the expected format.
	System.err.println("............................."); // Start of the log separator for better clarity
	System.out.println("name: " + name); // Prints the name entered by the user
	System.out.println("username: " + username); // Prints the username entered by the user
	System.out.println("email: " + email); // Prints the email entered by the user
	System.out.println("password: " + password); // Prints the password entered by the user
	System.out.println("contact: " + contactNumber); // Prints the contact number entered by the user
	System.err.println("............................."); // End of the log separator

	// Add the individual form data attributes to the model so they can be accessed
	// in the JSP view (profile.jsp).
	// The model serves as a container for attributes, which can then be rendered in
	// the HTML view.
	model.addAttribute("name", name); // Adding name to the model attribute for view access
	model.addAttribute("username", username); // Adding username to the model attribute for view access
	model.addAttribute("email", email); // Adding email to the model attribute for view access
	model.addAttribute("password", password); // Adding password to the model attribute for view access
	model.addAttribute("contactNumber", contactNumber); // Adding contact number to the model attribute for view
							    // access

	// Returning the name of the view ("profile") that will render the attributes
	// added to the model.
	// The view resolver will take care of returning the appropriate JSP page to the
	// user with the data from the model.
	return "profile"; // Returns "profile.jsp", which will display the data added to the model.
    }

    // A second method using a Java object to store and process form data, which is
    // an object-oriented approach.
    // Instead of passing individual parameters from the form, we create a `User`
    // object that encapsulates all the fields.
    @PostMapping("/submitForm")
    public String handleMyForm1(@RequestParam("fullName") String name, @RequestParam("username") String username,
	    @RequestParam("email") String email, @RequestParam("password") String password,
	    @RequestParam("contactNumber") String contactNumber, Model model) {

	// Log the form data to the console for debugging purposes. This helps to
	// confirm if the data was received correctly from the front-end.
	System.err.println(".............................");
	System.out.println("name: " + name);
	System.out.println("username: " + username);
	System.out.println("email: " + email);
	System.out.println("password: " + password);
	System.out.println("contact: " + contactNumber);
	System.err.println(".............................");

	// Create a new User object and set its properties using the form data.
	// This encapsulates the form data into a single object, which is easier to
	// manage and extend.
	User user = new User();
	user.setName(name); // Set the name property of the User object
	user.setUsername(username); // Set the username property of the User object
	user.setEmail(email); // Set the email property of the User object
	user.setPassword(password); // Set the password property of the User object
	user.setContactnumber(contactNumber); // Set the contact number property of the User object

	// Add the User object to the model so that the view can access the object.
	// The model is a container for attributes, which will then be rendered in the
	// view (profile.jsp).
	model.addAttribute("user", user); // Add the entire User object to the model for rendering in the JSP view.

	// Return the name of the view ("profile") to be rendered. The User object is
	// accessible in this view.
	return "profile"; // The JSP view "profile.jsp" will display the user data encapsulated in the
			  // User object.
    }

    // A third approach, leveraging Spring's @ModelAttribute annotation to
    // automatically bind form data to a Java object.
    @PostMapping("/submitForm")
    public String handleMyForm(@ModelAttribute User user) {

	// When @ModelAttribute is used, Spring automatically binds the form data to the
	// User object.
	// This is more concise and eliminates the need to manually retrieve each form
	// field with @RequestParam.
	// The user object will be populated with the form values (name, username,
	// email, etc.) automatically.

	// Log the data of the populated User object for debugging purposes to verify
	// the successful binding.
	// This ensures that all fields of the User object are correctly populated with
	// the submitted form data.
	System.err.println(".............................");
	System.out.println("name: " + user.getName()); // Access and log the name property of the User object
	System.out.println("username: " + user.getUsername()); // Access and log the username property
	System.out.println("email: " + user.getEmail()); // Access and log the email property
	System.out.println("password: " + user.getPassword()); // Access and log the password property
	System.out.println("contact: " + user.getContactnumber()); // Access and log the contact number property
	System.err.println(".............................");

	// The User object has been automatically populated with form data, and now it
	// will be rendered in the "profile" view.
	return "profile"; // Returns the "profile.jsp" view to display the data of the populated User
			  // object.
    }

    // Handling file upload functionality. This method shows how to handle the file
    // upload process in Spring MVC.
    @RequestMapping(path = "/Uploadfile")
    public String loadFileUpload() {
	// Return the "fileUpload" view, which contains the form where the user can
	// upload a file (e.g., an image).
	return "fileUpload"; // This view will allow the user to select and upload a file.
    }

    // This method handles the file upload when the user submits the form with the
    // file.
    // It processes the file and stores it on the server in a specific directory.
    @RequestMapping(path = "/fileUpload", method = RequestMethod.POST)
    public String fileUpload(@RequestParam("img") CommonsMultipartFile file, HttpServletRequest request, Model model)
	    throws IOException {

	// Log the details of the uploaded file, such as its name, content type, and
	// size, to confirm that the file is received correctly.
	System.out.println(file.getName()); // Log the input field name from the form (should be "img")
	System.out.println(file.getOriginalFilename()); // Log the original filename of the uploaded file
	System.out.println(file.getContentType()); // Log the content type of the uploaded file (e.g., image/jpeg)
	System.out.println(file.getSize()); // Log the size of the uploaded file in bytes

	// Convert the file's content into a byte array for storage on the server.
	byte[] bytes = file.getBytes();

	// Construct the full path where the file will be saved on the server. The
	// "realPath" is determined dynamically based on the server's directory.
	String realPath = request.getServletContext().getRealPath("/") + "resourcefile" + File.separator + "images"
		+ File.separator + file.getOriginalFilename();
	System.out.println(realPath); // Log the full file path to ensure the file will be stored in the correct
				      // directory.

	// Write the byte array (the file's content) to the destination file on the
	// server using a FileOutputStream.
	try (FileOutputStream fileOutputStream = new FileOutputStream(realPath)) {
	    fileOutputStream.write(bytes); // Write the content of the file to the specified path
	}

	// Add the file's name to the model so it can be displayed on the success page
	// (fileSucess.jsp).
	model.addAttribute("imgname", file.getOriginalFilename());

	// Return the "fileSucess" view to indicate that the file has been successfully
	// uploaded.
	return "fileSucess"; // The file was uploaded successfully, and the success page will be shown to the
			     // user.
    }

    // Another method to upload files, which handles file storage with error
    // handling and ensures the directory structure is created if it doesn't exist.
    @RequestMapping(path = "/fileUpload", method = RequestMethod.POST)
    public String fileupload(@RequestParam("img") CommonsMultipartFile file, HttpServletRequest request) {
	try {
	    // Construct the full file path where the uploaded file will be saved.
	    String realPath = request.getServletContext().getRealPath("/") + "resourcefile" + File.separator + "images"
		    + File.separator + file.getOriginalFilename();
	    System.out.println("Upload Directory: " + realPath); // Log the upload directory path for verification

	    // Check if the directory exists. If not, create it to avoid errors during file
	    // upload.
	    File dir = new File(realPath);
	    if (!dir.exists()) {
		dir.mkdirs(); // Create the directory structure if it doesn't exist
	    }

	    // Create a new file in the upload directory and write the contents of the
	    // uploaded file to it.
	    File serverFile = new File(realPath);
	    file.transferTo(serverFile); // Transfer the uploaded file's contents to the newly created file

	    // Return the success view to indicate that the file upload was successful.
	    return "fileSucess"; // After the file is successfully uploaded, show the success page
	} catch (Exception e) {
	    // Handle any exceptions that occur during file upload. Log the error message
	    // for debugging purposes.
	    e.printStackTrace();
	    return "fileError"; // Return an error view if the file upload fails
	}
    }

}
