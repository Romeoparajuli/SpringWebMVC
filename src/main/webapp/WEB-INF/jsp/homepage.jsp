<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Parajuli Technology Ltd</title>
<link rel="stylesheet"
	href="<c:url value='/resourcefile/css/style.css'/>">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<script src="<c:url value='/resourcefile/js/script.js'/>" defer></script>
</head>

<body>
	<header class="header">
    <div class="logo">
        <img src="<c:url value='/resourcefile/images/Logo.gif'/>" alt="Logo" class="logo-img">
        <div>
            <span class="company-name">Parajuli Technology Ltd</span>
            <span class="tagline">"Innovating the Future, One Step at a Time"</span>
        </div>
    </div>
    <nav class="nav">
        <a href="index.jsp">Home</a>
    </nav>
</header>

	 <!-- Main Content Section -->
    <main class="container">
        <h1 class="title">
            <i class="fas fa-search"></i> Parajuli Search
        </h1>
        <p class="subtitle">Your one-stop search platform. Explore more below!</p>
        <form class="search-form" action="google" method="post">
            <input type="text" class="search-box" name="keyword" placeholder="Search here...">
            <button type="submit" class="search-button">Search</button>
        </form>
    </main>
	<!-- Footer Section -->
	<footer class="footer">
		<p>&copy; 2024 Parajuli Technology Ltd. All rights reserved.</p>
		<p>
			Follow us on: <a href="https://www.facebook.com" target="_blank">Facebook</a>
			| <a href="https://www.twitter.com" target="_blank">Twitter</a> | <a
				href="https://www.instagram.com" target="_blank">Instagram</a>
		</p>
	</footer>
</body>

</html>
