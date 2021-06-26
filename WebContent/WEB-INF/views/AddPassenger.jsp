<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Hello from JSP!</title>
</head>
<body>
	<div class="container">
		<h3>Welcome to World Adventures Airlines! :-)</h3>
		<h4>This is JSP...</h4>
		<div class="title">Add a passenger</div>
		<fieldset>
			<legend>Passenger details</legend>
			<form action="AddPassenger" method="post">
				<div class="inputField">
					<label for="first-name" class="inputLabel">First Name:</label>
					<input name="first-name" type="text" />
				</div>
				<div class="inputField">
					<label for="last-name" class="inputLabel">Last Name:</label>
					<input name="last-name" type="text" />
				</div>
				<div class="inputField">
					<label for="dateOfBirth" class="inputLabel">Date of Birth::</label>
					<input name="dateOfBirth" type="text" />
				</div>
				<div class="inputField">
					<label for="gender" class="inputLabel">Gender:</label>
					<select name="gender">
						<option value="Male">Male</option>
						<option value="Female">Female</option>
					</select>
				</div>
			</form>
		</fieldset>
		<button class="inputField" id="submitButton" type="submit">Add new passenger</button>
	</div>
</body>
</html>