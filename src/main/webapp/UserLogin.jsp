<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
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
    background: linear-gradient(135deg, #00b4db, #0083b0);
    display: flex;
    flex-direction:column;
    justify-content: center;
    align-items: center;
    animation: fadeIn 1.5s ease-in;
}

form {
    display: flex;
    flex-direction: column;
    align-items: center;
    background-color: rgba(255, 255, 255, 0.95);
    padding: 3vw;
    border-radius: 1vw;
    box-shadow: 0 0 20px rgba(0,0,0,0.2);
    animation: slideUp 1.2s ease;
}

h2 {
    margin-bottom: 2vw;
    color: #0083b0;
}

input, button {
    margin: 1vw 0;
    font-size: 1.2vw;
    padding: 0.8vw 1.5vw;
    border-radius: 0.5vw;
    border: none;
    outline: none;
    width: 100%;
    max-width: 300px;
    transition: all 0.3s ease;
}

input {
    background-color: #e0f7fa;
    color: #004d40;
}

input::placeholder {
    color: #00796b;
    font-size: 1vw;
}

input:focus {
    background-color: light;
    transform: scale(1.02);
}

button {
    background-color: #0083b0;
    color: white;
    cursor: pointer;
    width: 50%;
    min-width: 120px;
}

button:hover {
    background-color: #00b4db;
    transform: scale(1.05);
}

span {
    color: red;
    font-size: 1.2vw;
    margin-top: 1vw;
    background-color: white;
    border-radius: .2vw;
    
}

/* Animations */
@keyframes fadeIn {
    from { opacity: 0; }
    to   { opacity: 1; }
}

@keyframes slideUp {
    from {
        transform: translateY(30px);
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
    <form action="userloginreq">
        <h2>User Login</h2>
        
        
        <input type="text" placeholder="Enter Account/Mobile No" name="number"  required="required">
        <input type="text" placeholder="Enter pin number" name="pinnum" required="required">
        <button type="submit">Submit</button>
    </form>
    <%String msg=(String)request.getAttribute("userloginexception"); %>
    <span><%=msg %></span>
</body>
</html>
