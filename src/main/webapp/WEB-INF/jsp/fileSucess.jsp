<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>File Upload Successful</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        /* Custom styling for image display */
        .image-container {
            max-width: 100%;
            max-height: 400px;
            overflow: hidden;
            border-radius: 8px;
        }
        .image-container img {
            width: 100%;
            height: auto;
            object-fit: cover;
        }
    </style>
</head>
<body class="bg-gray-100 min-h-screen flex flex-col items-center justify-center py-8 px-4">
    <div class="bg-white shadow-lg rounded-lg p-8 w-full max-w-md text-center">
        <!-- Success Message -->
        <h1 class="text-3xl font-bold text-green-600 mb-6">File Uploaded Successfully!</h1>

        <!-- Image Display -->
        <div class="image-container mb-6">
            <img src="<c:url value='/resourcefile/images/${imgname}'/>" alt="Uploaded Image" class="rounded-lg shadow-md">
        </div>

        <!-- Button to go back to File Upload Page -->
        <a href="Uploadfile" 
            class="py-3 px-6 bg-blue-600 text-white font-semibold rounded-lg shadow-md hover:bg-blue-700 focus:outline-none focus:ring-4 focus:ring-blue-300 transition-transform w-full max-w-xs mx-auto"
        >
            Back to File Upload
        </a>
    </div>
</body>
</html>
