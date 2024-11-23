<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
/* General styles */
body {
	margin: 0;
	padding: 0;
	font-family: 'Poppins', sans-serif;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	background: linear-gradient(135deg, #556B2F, #8FBC8F);
	/* Olive green theme */
	color: #fff;
	text-align: center;
	overflow: hidden;
}

/* Text styles */
h1 {
	font-size: 3rem;
	font-weight: 700;
	margin-bottom: 15px;
	text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);
}

p {
	font-size: 1.2rem;
	margin-bottom: 30px;
	color: #f0f0f0;
	font-style: normal;
}

/* Button container */
.button-container {
	margin-top: 20px;
}

/* Button styles */
.button {
	display: inline-block;
	margin: 10px;
	padding: 12px 28px;
	font-size: 18px;
	font-weight: bold;
	color: #fff;
	text-decoration: none;
	border-radius: 5px;
	background: #6B8E23; /* Olive green button */
	transition: all 0.3s ease;
	cursor: pointer;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

/* Hover effects */
.button:hover {
	background: #556B2F; /* Darker olive green */
	transform: scale(1.05);
	box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.3);
}

/* Card-like container for better aesthetics */
.content-container {
	background: rgba(255, 255, 255, 0.1); /* Semi-transparent box */
	padding: 40px;
	border-radius: 10px;
	box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
	width: 90%;
	max-width: 600px;
}

/* Responsive design */
@media ( max-width : 600px) {
	h1 {
		font-size: 2.5rem;
	}
	p {
		font-size: 1rem;
	}
	.button {
		padding: 10px 20px;
		font-size: 16px;
	}
}
</style>
</head>
<body>
	<div class="content-container">
		<!-- Professional heading and subheading -->
		<h1>Welcome to Parajuli Technology Ltd</h1>
		<p>Sign in to access your personalized dashboard and stay
			connected with the community.</p>

		<!-- Buttons -->
		<div class="button-container">
			<a href="signin" class="button">Login</a> <a
				href="user/Profile" class="button">Profile</a>
		</div>
	</div>
</body>
</html>
