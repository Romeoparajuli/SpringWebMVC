<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Profile</title>
<link
	href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css"
	rel="stylesheet">
<style>
/* Custom Theme Color */
:root {
	--primary-color: #1877f2; /* Facebook Blue */
	--secondary-color: #3b5998; /* Dark Blue */
	--accent-color: #f5f5f5; /* Light Gray */
}

/* Animation for smooth transition */
.fade-in {
	animation: fadeIn 1s ease-in-out;
}

@
keyframes fadeIn { 0% {
	opacity: 0;
}

100
%
{
opacity
:
1;
}
}
.slide-up {
	animation: slideUp 0.8s ease-out;
}

@
keyframes slideUp { 0% {
	transform: translateY(50px);
	opacity: 0;
}

100
%
{
transform
:
translateY(
0
);
opacity
:
1;
}
}
.scale-up:hover {
	transform: scale(1.05);
}

/* Hover Effect for Feed Items */
.feed-item:hover {
	transform: scale(1.02);
	box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
}
</style>
</head>

<body class="bg-gray-100 font-sans text-gray-800">

	<!-- Main Wrapper: Flex container for centering -->
	<div class="flex justify-center items-center min-h-screen p-6">

		<!-- Profile Container -->
		<div
			class="bg-white shadow-xl rounded-lg w-full max-w-4xl p-8 fade-in">
			<!-- Header -->
			<div class="flex justify-between items-center mb-8">
				<div class="flex items-center space-x-4">
					<img src="profile-placeholder.jpg" alt="Profile Picture"
						class="w-20 h-20 rounded-full border-4 border-blue-500 transition-transform duration-300 transform hover:scale-110">
					<div>
						<h1 class="text-3xl font-semibold">${user.username}</h1>
						<p class="text-gray-500">Welcome to your profile</p>
					</div>
				</div>
				<div>
					<button
						class="px-4 py-2 bg-blue-600 text-white rounded-full hover:bg-blue-700 transition ease-in-out duration-300">Edit
						Profile</button>
				</div>
			</div>

			<!-- Profile Info Section -->
			<div class="bg-white shadow-lg rounded-lg p-6 mb-8 slide-up">
				<div class="flex justify-between items-center">
					<h3 class="text-xl font-medium">Profile Summary</h3>
					<button class="text-blue-600 hover:text-blue-800 transition-all">Update
						Info</button>
				</div>
				<div class="mt-4 space-y-3">
					<p>
						<strong>Name: </strong>${user.name}</p>
					<p>
						<strong>User Name: </strong>${user.username}</p>
					<p>
						<strong>Email: </strong>${user.email}</p>
					<p>
						<strong>Phone: </strong>${user.contactnumber}</p>
				</div>
			</div>

			<!-- Activity Feed Section -->
			<div class="bg-white shadow-lg rounded-lg p-6 mb-8">
				<div class="flex justify-between items-center mb-4">
					<h3 class="text-xl font-medium">Recent Activity</h3>
					<button
						class="px-4 py-2 bg-green-600 text-white rounded-full hover:bg-green-700 transition-all ease-in-out duration-300">Post
						Status</button>
				</div>
				<div class="space-y-4">
					<!-- Feed Example with hover effect -->
					<div
						class="flex items-start space-x-4 feed-item transform transition-all duration-300 ease-in-out">
						<img src="profile-placeholder.jpg" alt="User"
							class="w-14 h-14 rounded-full">
						<div class="flex-1">
							<p class="font-semibold">${user.username}</p>
							<p class="text-gray-600">Lorem ipsum dolor sit amet,
								consectetur adipiscing elit. Duis vehicula erat sit amet diam
								hendrerit, nec accumsan orci suscipit.</p>
							<p class="text-xs text-gray-400">2 hours ago</p>
						</div>
					</div>
					<!-- More Feed Items Here -->
				</div>
			</div>
		</div>

	</div>

	<!-- Footer Section -->
	<footer class="bg-gray-800 text-white py-6 mt-12">
		<div class="container mx-auto text-center">
			<p>&copy; 2024 Parajuli Technology Ltd. All rights reserved.</p>
		</div>
	</footer>

</body>

</html>
