<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>File Upload Example</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 min-h-screen flex items-center justify-center p-4">
    <div class="bg-white shadow-xl rounded-lg p-8 w-full max-w-md">
        <h1 class="text-3xl font-bold text-center text-blue-600 mb-6">
            Upload Your File
        </h1>
        <p class="text-center text-gray-600 mb-4">
            Quickly upload your images with our secure system.
        </p>
        <form action="fileUpload" method="post" enctype="multipart/form-data" class="space-y-6">
            <!-- File Input -->
            <div>
                <label for="img" class="block text-sm font-medium text-gray-700 mb-2">
                    Select an Image:
                </label>
                <input 
                    id="img" 
                    type="file" 
                    name="img" 
                    accept="image/*" 
                    class="block w-full px-3 py-2 border border-gray-300 rounded-lg shadow-sm focus:ring-2 focus:ring-blue-500 focus:border-blue-500 text-gray-800 bg-gray-50"
                    required
                >
            </div>
            
            <!-- Buttons -->
            <div class="flex justify-between gap-4">
                <!-- Upload Button -->
                <button 
                    type="submit" 
                    class="w-full py-3 bg-blue-600 text-white font-semibold rounded-lg shadow-md hover:bg-blue-700 focus:outline-none focus:ring-4 focus:ring-blue-300 transition-transform"
                >
                    Upload
                </button>
                
                <!-- Back to Home Button -->
                <a 
                    href="index.jsp" 
                    class="w-full py-3 bg-red-600 text-white font-semibold text-center rounded-lg shadow-md hover:bg-red-700 focus:outline-none focus:ring-4 focus:ring-red-300 transition-transform"
                >
                    Back to Home
                </a>
            </div>
        </form>

        <!-- Support Link -->
        <div class="text-center mt-6">
            <a href="#" class="text-sm text-blue-500 hover:underline hover:text-blue-700 transition-colors">
                Need help? Contact Support
            </a>
        </div>
    </div>
</body>
</html>
