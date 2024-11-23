<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Professional Form</title>
<script src="https://cdn.tailwindcss.com"></script>
<style>
    /* Custom Olive Green Color */
    .bg-olive { background-color: #556B2F; }
    .text-olive { color: #556B2F; }
    .hover\:bg-olive-dark:hover { background-color: #455A1B; }
</style>
</head>

<body class="bg-gray-100 flex items-center justify-center min-h-screen">

<div class="bg-white shadow-lg rounded-lg p-8 md:p-10 w-full max-w-4xl border-t-4 border-olive">
    <h2 class="text-4xl font-extrabold text-center text-olive mb-4">Registration Form</h2>
    <p class="text-center text-gray-600 mb-6 text-lg">Fill in the details below to create your account.</p>

    <%-- Message Section --%>
    <% if (request.getAttribute("msg") != null) { %>
        <div class="flex items-center justify-center space-x-2 mb-6">
            <span class="text-green-600">
                <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M5 13l4 4L19 7" />
                </svg>
            </span>
            <p class="text-center text-lg font-bold text-green-600">
                ${msg}
            </p>
        </div>
    <% } %>

    <form action="createUser" method="POST" class="space-y-8" onsubmit="return validateForm()">
        <!-- Name and Username -->
        <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
            <div>
                <label for="name" class="block text-sm font-medium text-gray-700">Full Name</label>
                <input type="text" id="name" name="name" placeholder="John Doe" 
                    class="mt-2 w-full rounded-lg border-gray-300 shadow-sm focus:border-olive focus:ring-olive" 
                    required>
            </div>
            <div>
                <label for="username" class="block text-sm font-medium text-gray-700">Username</label>
                <input type="text" id="username" name="username" placeholder="johndoe" 
                    class="mt-2 w-full rounded-lg border-gray-300 shadow-sm focus:border-olive focus:ring-olive" 
                    required>
            </div>
        </div>

        <!-- Email and Contact -->
        <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
            <div>
                <label for="email" class="block text-sm font-medium text-gray-700">Email</label>
                <input type="email" id="email" name="email" placeholder="example@mail.com" 
                    class="mt-2 w-full rounded-lg border-gray-300 shadow-sm focus:border-olive focus:ring-olive" 
                    required>
            </div>
            <div>
                <label for="contactnumber" class="block text-sm font-medium text-gray-700">Contact Number</label>
                <input type="tel" id="contactnumber" name="contactnumber" placeholder="+1234567890" 
                    class="mt-2 w-full rounded-lg border-gray-300 shadow-sm focus:border-olive focus:ring-olive" 
                    required>
            </div>
        </div>

        <!-- Password and Profile Image -->
        <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
            <div>
                <label for="password" class="block text-sm font-medium text-gray-700">Password</label>
                <input type="password" id="password" name="password" placeholder="********" 
                    class="mt-2 w-full rounded-lg border-gray-300 shadow-sm focus:border-olive focus:ring-olive" 
                    required>
            </div>
            <div>
                <label for="image" class="block text-sm font-medium text-gray-700">Profile Image URL</label>
                <input type="url" id="image" name="image" placeholder="https://example.com/image.jpg" 
                    class="mt-2 w-full rounded-lg border-gray-300 shadow-sm focus:border-olive focus:ring-olive">
            </div>
        </div>

        <!-- Buttons -->
        <div class="flex justify-between items-center space-y-4 md:space-y-0">
            <a href="index.jsp" 
               class="text-white bg-gray-500 hover:bg-gray-600 px-6 py-2 rounded-lg shadow-md transform transition-transform hover:-translate-y-1">
                Back
            </a>
            <button type="submit" 
               class="text-white bg-olive hover:bg-olive-dark px-6 py-2 rounded-lg shadow-md transform transition-transform hover:scale-105">
                Submit
            </button>
        </div>
    </form>
</div>

<!-- Tailwind Animation Effects -->
<script>
    function validateForm() {
        // Add form validation logic here if required
        return true;
    }
</script>
</body>
</html>
