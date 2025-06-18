<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
<style type="text/css">
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

body {
    width: 100vw;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    background: linear-gradient(to right, #ffecd2, #fcb69f);
    animation: fadeInBody 1.5s ease-in;
}

@keyframes fadeInBody {
    from { opacity: 0; }
    to { opacity: 1; }
}

form {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    background: linear-gradient(135deg, #e0ffe0, #c2f0c2);
    padding: 3vw;
    border-radius: 1vw;
    box-shadow: 0px 10px 25px rgba(0, 0, 0, 0.2);
    animation: formPop 0.8s ease-out;
}

@keyframes formPop {
    from {
        transform: scale(0.8);
        opacity: 0;
    }
    to {
        transform: scale(1);
        opacity: 1;
    }
}

input, button {
    margin: 1vw;
    font-size: 1.2vw;
    border-radius: 0.5vw;
    border: none;
    outline: none;
    padding: 0.5vw 1vw;
    transition: all 0.3s ease-in-out;
}

input {
    background-color: #f0fff0;
    color: #333;
    padding-left: 0.5vw;
}

input::placeholder {
    color: brown;
    opacity: 0.7;
}

button {
    width: 8vw;
    background-color: lightgreen;
    cursor: pointer;
}

button:hover {
    background-color: #32cd32;
    transform: scale(1.05);
    box-shadow: 0 5px 15px rgba(0, 128, 0, 0.3);
}

h2 {
    margin-bottom: 1vw;
    font-size: 2vw;
    color: #2e8b57;
}

span {
    position: absolute;
    color: red;
    bottom: 18vw;
    font-size: 1.3vw;
    font-weight: bold;
    text-align: center;
}
</style>
</head>
<body>

<form action="adminloginreq">
    <h2>Admin Login</h2>
    <input type="number" placeholder="Admin ID" name="adminid">
    <button type="submit">Submit</button>
</form>

<% String execmessage = (String)request.getAttribute("idExce"); %>
<span><%= execmessage %></span>

</body>
</html>
