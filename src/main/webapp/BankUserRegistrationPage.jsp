<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Registration</title>
<style>
* {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

body {
    width: 100vw;
    height: 100vh;
    background: linear-gradient(to right, #a1c4fd, #c2e9fb);
    display: flex;
    justify-content: center;
    align-items: center;
    animation: fadeIn 1.5s ease-in;
}

form {
    width: 30vw;
    padding: 2vw;
    background: linear-gradient(to bottom right, #fff1eb, #ace0f9);
    border-radius: 1.5vw;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
    display: flex;
    flex-direction: column;
    align-items: center;
    animation: slideUp 1.2s ease-in-out;
}

h1 {
    font-size: 2vw;
    margin-bottom: 1.5vw;
    color: #333;
}

input, button {
    width: 90%;
    padding: 0.6vw;
    margin-top: 1vw;
    font-size: 1.2vw;
    border: none;
    outline: none;
    border-radius: 0.5vw;
    background-color: #e0e0e0;
    transition: box-shadow 0.3s ease, transform 0.2s ease;
}

input:focus {
    box-shadow: 0 0 5px #2980b9;
    transform: scale(1.02);
}

input::placeholder {
    color: #555;
}

button {
    width: 50%;
    background-color: #2980b9;
    color: white;
    cursor: pointer;
    transition: background-color 0.3s ease, transform 0.2s ease;
}

button:hover {
    background-color: #1c5980;
    transform: scale(1.05);
}

span {
    position: absolute;
    bottom: 3.5vw;
    color: red;
    font-family: monospace;
    font-size: 1.5vw;
    animation: fadeIn 1.5s ease-in;
}

/* Animations */
@keyframes fadeIn {
    from { opacity: 0; }
    to   { opacity: 1; }
}

@keyframes slideUp {
    from {
        transform: translateY(40px);
        opacity: 0;
    }
    to {
        transform: translateY(0);
        opacity: 1;
    }
}
</style>
</head>
<body>

<form action="bankaccountregistrationrequest">
    <h1>Account Registration Form</h1>
    <input type="text" name="name" placeholder="UserName">
    <input type="email" name="emailid" placeholder="EmailId">
    <input type="text" name="aadhaarnumber" placeholder="AadhaarNumber">
    <input type="tel" name="mobilenumber" placeholder="MobileNumber">
    <input type="text" name="gender" placeholder="Gender">
    <input type="text" name="address" placeholder="Address">
    <input type="text" name="amount" placeholder="Amount">
    <button type="submit">Submit</button>
</form>

<% String msg = (String) request.getAttribute("exceptionmessage"); %>
<span><%= msg %></span>

</body>
</html>
