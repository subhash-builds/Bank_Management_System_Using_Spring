<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Admin Registration</title>
  <style>
    /* Reset & Base */
    * { margin: 0; padding: 0; box-sizing: border-box; }
    body {
      width: 100vw; height: 100vh;
      display: flex; justify-content: center; align-items: center;
      background: linear-gradient(135deg, #ffe5d9, #ffcad4);
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      animation: fadeInBG 1.2s ease-in;
    }
    @keyframes fadeInBG {
      from { opacity: 0; } to { opacity: 1; }
    }
    /* Card Container */
    .card {
      background: #fff;
      width: 25vw;
      min-width: 300px;
      padding: 2vw 3vw;
      border-radius: 1vw;
      box-shadow: 0 8px 20px rgba(0,0,0,0.1);
      animation: popIn 0.8s ease-out;
    }
    @keyframes popIn {
      from { transform: scale(0.85); opacity: 0; }
      to   { transform: scale(1);    opacity: 1; }
    }
    h2 {
      text-align: center;
      margin-bottom: 1.5vw;
      color: #333;
      font-size: 2vw;
    }
    form {
    
      display: flex;
      flex-direction: column;
    }
    label {
      font-size: 1vw;
      margin-top: 1vw;
      color: #555;
    }
    input, select {
      margin-top: 0.5vw;
      padding: 0.8vw 1vw;
      font-size: 1vw;
      border-radius: 0.4vw;
      border: 1px solid #ccc;
      outline: none;
      transition: border-color 0.3s;
    }
    input:focus, select:focus {
      border-color: #ff6f61;
    }
    .flex-row {
      display: flex;
      gap: 1vw;
    }
    .flex-row > div {
      flex: 1;
    }
    button {
      margin-top: 2vw;
      padding: 1vw;
      font-size: 1.2vw;
      background: linear-gradient(135deg, #ff6f61, #ff9472);
      color: #fff;
      border: none;
      border-radius: 0.5vw;
      cursor: pointer;
      transition: transform 0.3s, box-shadow 0.3s;
    }
    button:hover {
      transform: translateY(-2px);
      box-shadow: 0 6px 15px rgba(255,111,97,0.4);
    }
    span {
      display: block;
      margin-top: 1.5vw;
      text-align: center;
      color: red;
      font-size: 1vw;
    }
    @media (max-width: 600px) {
      .card { width: 90%; padding: 4vw; }
      h2 { font-size: 4vw; }
      label, input, select { font-size: 3vw; }
      button { font-size: 3.5vw; padding: 2vw; }
      span { font-size: 3vw; }
    }
  </style>
</head>
<body>

  <div class="card">
    <h2>Admin Registration</h2>
    <form action="adminregrequest">
      <label for="adminname">Admin Name</label>
      <input id="adminname" type="text" name="adminname" placeholder="Enter your name">

      <label for="adminpassword">Password</label>
      <input id="adminpassword" type="password" name="adminpassword" placeholder="Choose a password">

      <label for="adminrole">Role</label>
      <select id="adminrole" name="adminrole">
        <option value="" disabled selected>Select role</option>
        <option>Branch Manager</option>
        <option>Account Officer</option>
        <option>Customer Support</option>
        <option>Super Admin</option>
      </select>

      <div class="flex-row">
        <div>
          <label for="contact">Contact No.</label>
          <input id="contact" type="tel" name="contactno" placeholder="e.g. 9876543210">
        </div>
        <div>
          <label for="email">Email</label>
          <input id="email" type="email" name="emailid" placeholder="e.g. you@bank.com">
        </div>
      </div>

      <div class="flex-row">
        <div>
          <label for="branch">Branch</label>
          <input id="branch" type="text" name="branch" placeholder="Branch name">
        </div>
        
        
      </div>

      <button type="submit">Register</button>
    </form>

    <% String msg = (String)request.getAttribute("excMessage"); %>
    <span><%= msg %></span>
  </div>

</body>
</html>
