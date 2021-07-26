<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>World Adventures Airlines</title>
<link rel="stylesheet" href="css/normalize.css" />
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="container">
		<div class="title">Add a passenger</div>
		<form action="AddPassenger" method="post">
			<fieldset>
				<legend>Passenger details</legend>
				<div class="inputField">
					<label for="first-name" class="inputLabel">First Name:</label>
					<input name="first-name" type="text" />
				</div>
				<div class="inputField">
					<label for="last-name" class="inputLabel">Last Name:</label>
					<input name="last-name" type="text" />
				</div>
				<div class="inputField">
					<label for="dateOfBirth" class="inputLabel">Date of Birth:</label>
					<input name="dateOfBirth" type="text" />
				</div>
				<div class="inputField">
					<label for="gender" class="inputLabel">Gender:</label>
					<select
						name="gender">
						<option value="Male">Male</option>
						<option value="Female">Female</option>
					</select>
				</div>
			</fieldset>
			<div class="inputField" id="submitField">
				<input id="submitButton" type="submit" value="Add new passenger" />
				<!--<button class="inputField" id="submitButton" type="submit">Add new passenger</button>-->
			</div>
		</form>
	</div>
</body>
</html>