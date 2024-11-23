<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Parajuli Technology Ltd</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
    <style>
        /* Custom Animation for Smooth Fade-in */
        @keyframes fadeIn {
            0% { opacity: 0; transform: translateY(20px); }
            100% { opacity: 1; transform: translateY(0); }
        }
        .animate-fade-in {
            animation: fadeIn 1s ease-out forwards;
        }

        /* Parallax Effect */
        .parallax {
            background-image: url('background-image.jpg');
            background-attachment: fixed;
            background-size: cover;
            background-position: center;
            height: 100vh;
        }

        /* Floating Social Icons */
        .social-icon {
            position: fixed;
            bottom: 20px;
            right: 20px;
            display: flex;
            flex-direction: column;
            gap: 10px;
        }
        .social-icon a {
            background-color: rgba(0, 0, 0, 0.6);
            padding: 12px;
            border-radius: 50%;
            color: white;
            transition: transform 0.3s ease;
        }
        .social-icon a:hover {
            transform: translateY(-5px);
        }

        /* Footer Styles */
        .footer {
            background-color: #2D3748; /* Dark background */
            color: #E2E8F0; /* Light text */
            padding: 40px 0;
        }
        .footer a {
            color: #E2E8F0;
            transition: color 0.3s ease;
        }
        .footer a:hover {
            color: #38A169; /* Green hover effect */
        }

        /* Smooth Scroll for anchor links */
        html {
            scroll-behavior: smooth;
        }

        /* Hero Section Text Animations */
        .hero-text {
            animation: fadeIn 1.5s ease-in-out;
        }
    </style>
</head>
<body class="bg-gray-50 text-gray-900">

    <!-- Header Section -->
    <header class="bg-gradient-to-r from-green-600 to-green-800 text-white py-6 shadow-lg sticky top-0 z-50">
        <div class="container mx-auto flex justify-between items-center px-6">
            <!-- Adjusted Logo -->
            <img src="<c:url value='/resourcefile/images/Logo.gif'/>" 
                 alt="Logo" 
                 class="h-24 w-auto"> <!-- Adjust height and maintain aspect ratio -->
            
            <h1 class="text-4xl font-extrabold tracking-wide animate-fade-in">
                Parajuli Technology Ltd
            </h1>
            <nav class="space-x-6">
                <a href="homePage" class="text-lg hover:text-green-300 transition duration-300 animate-fade-in">Home</a>
                <a href="#about" class="text-lg hover:text-green-300 transition duration-300 animate-fade-in delay-100">About Us</a>
                <a href="#team" class="text-lg hover:text-green-300 transition duration-300 animate-fade-in delay-200">Our Team</a>
                <a href="#contact" class="text-lg hover:text-green-300 transition duration-300 animate-fade-in delay-300">Contact</a>
                <!-- Sign Up Button -->
                <a href="regform" class="text-lg bg-green-600 hover:bg-green-700 text-white py-2 px-6 rounded-full transition duration-300 animate-fade-in">
                    Sign Up
                </a>
                <!-- Login Button -->
                <a href="Loginpage" class="text-lg bg-gray-600 hover:bg-gray-700 text-white py-2 px-6 rounded-full transition duration-300 animate-fade-in">
                    Login
                </a>
            </nav>
        </div>
    </header>

    <!-- Hero Section with Parallax Effect -->
    <section id="home" class="parallax flex items-center justify-center text-center text-white">
        <div class="absolute inset-0 bg-black bg-opacity-50"></div>
        <div class="z-10 hero-text">
            <h2 class="text-5xl font-extrabold mb-4">Empowering the Future of Technology</h2>
            <p class="text-lg mb-6">Innovating solutions that drive your success in the digital world.</p>
            <a href="#about" class="bg-green-600 text-white px-8 py-3 rounded-full shadow-lg hover:bg-green-700 transform hover:scale-110 transition duration-300">Learn More</a>
        </div>
    </section>

    <!-- About Us Section -->
    <section id="about" class="py-20 bg-white">
        <div class="container mx-auto text-center px-6">
            <h3 class="text-4xl font-bold text-green-800 mb-8">About Parajuli Technology Ltd</h3>
            <p class="text-xl text-gray-700 leading-relaxed max-w-4xl mx-auto animate-fade-in">We are a leading technology solutions provider specializing in custom software development, IT consulting, and digital transformation services. Our team is committed to helping businesses of all sizes leverage technology to improve efficiency, innovation, and profitability. With a strong focus on customer-centricity, we deliver tailored solutions that meet the unique needs of our clients.</p>
        </div>
    </section>

    <!-- Our Team Section -->
    <section id="team" class="py-20 bg-gray-100">
        <div class="container mx-auto text-center px-6">
            <h3 class="text-4xl font-bold text-green-800 mb-8">Meet Our Leadership Team</h3>
            <div class="grid grid-cols-1 md:grid-cols-3 gap-12">
                <div class="bg-white shadow-lg p-6 rounded-lg transition-transform transform hover:scale-105 duration-300">
                    <img src="<c:url value='/resourcefile/images/yagya.jpg'/>" alt="Team Member 1" class="mx-auto h-40 w-40 rounded-full object-cover mb-4">
                    <h4 class="text-2xl font-semibold text-green-800">Yagya Parajuli</h4>
                    <p class="text-gray-700">CEO & Founder</p>
                    <p class="text-gray-600 mt-4">Yagya has over 20 years of experience leading tech innovations, and is passionate about driving change through technology.</p>
                </div>
                <div class="bg-white shadow-lg p-6 rounded-lg transition-transform transform hover:scale-105 duration-300">
                    <img src="<c:url value='/resourcefile/images/pooja.jpg'/>" alt="Team Member 2" class="mx-auto h-40 w-40 rounded-full object-cover mb-4">
                    <h4 class="text-2xl font-semibold text-green-800">Pooja Parajuli</h4>
                    <p class="text-gray-700">CTO</p>
                    <p class="text-gray-600 mt-4">With a deep understanding of the latest technologies, Pooja leads our technical strategy and development efforts to ensure quality and innovation.</p>
                </div>
                <div class="bg-white shadow-lg p-6 rounded-lg transition-transform transform hover:scale-105 duration-300">
                    <img src="<c:url value='/resourcefile/images/milan.jpg'/>" alt="Team Member 3" class="mx-auto h-40 w-40 rounded-full object-cover mb-4">
                    <h4 class="text-2xl font-semibold text-green-800">Milan parajuli</h4>
                    <p class="text-gray-700">COO</p>
                    <p class="text-gray-600 mt-4">Milan oversees the operational strategy of the company, ensuring efficiency and smooth delivery of services to our clients.</p>
                </div>
            </div>
        </div>
    </section>

    <!-- Contact Section -->
    <section id="contact" class="py-20 bg-white">
        <div class="container mx-auto text-center px-6">
            <h3 class="text-4xl font-bold text-green-800 mb-8">Contact Us</h3>
            <p class="text-xl text-gray-700 leading-relaxed max-w-4xl mx-auto animate-fade-in">We would love to hear from you! Whether you have questions, feedback, or need assistance, feel free to reach out to us.</p>
            <p class="text-gray-700 mt-4">Email: <a href="mailto:contact@parajulitech.com" class="text-green-600">contact@parajulitech.com</a></p>
            <p class="text-gray-700 mt-2">Phone: +977 123-456-789</p>
        </div>
    </section>

    <!-- Floating Social Icons -->
    <div class="social-icon">
        <a href="https://facebook.com" target="_blank" class="p-3 bg-blue-600 hover:bg-blue-700 rounded-full transition duration-300"><i class="fab fa-facebook-f text-white"></i></a>
        <a href="https://twitter.com" target="_blank" class="p-3 bg-blue-400 hover:bg-blue-500 rounded-full transition duration-300"><i class="fab fa-twitter text-white"></i></a>
        <a href="https://linkedin.com" target="_blank" class="p-3 bg-blue-800 hover:bg-blue-900 rounded-full transition duration-300"><i class="fab fa-linkedin text-white"></i></a>
    </div>

    <!-- Footer Section -->
    <footer class="footer">
        <div class="container mx-auto text-center text-white">
            <p>&copy; 2024 Parajuli Technology Ltd. All rights reserved.</p>
            <p class="mt-4">
                <a href="mailto:contact@parajulitech.com">Contact Us</a> |
                <a href="https://facebook.com" target="_blank">Facebook</a>|
                <a href="Uploadfile" >Upload File</a>
                
            </p>
        </div>
    </footer>

    <!-- Font Awesome Icons -->
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>

</body>
</html>
