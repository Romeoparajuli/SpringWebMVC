<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
<script src="https://cdn.tailwindcss.com"></script>
<style>
    /* Custom Olive Green Color */
    .bg-olive { background-color: #556B2F; }
    .text-olive { color: #556B2F; }
    .hover\:bg-olive-dark:hover { background-color: #455A1B; }
</style>
</head>
<body class="bg-gray-100 flex items-center justify-center min-h-screen">
    <div class="bg-white shadow-lg rounded-lg p-10 md:p-16 text-center w-full max-w-md border-t-4 border-olive">
        <!-- Success Icon -->
        <div class="flex justify-center mb-6">
            <svg xmlns="http://www.w3.org/2000/svg" class="h-16 w-16 text-green-500" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M5 13l4 4L19 7" />
            </svg>
        </div>
        <!-- Success Message -->
        <h1 class="text-2xl font-bold text-olive mb-2">Registration Successful!</h1>
        <p class="text-gray-600 text-lg mb-6">The user has been successfully created.</p>
        
        
        <!-- Back to Register Button -->
        <a href="regform" 
           class="text-white bg-olive hover:bg-olive-dark px-6 py-2 rounded-lg shadow-md transform transition-transform hover:scale-105 inline-block">
            Back to Register
        </a>
    </div>
</body>
</html>
