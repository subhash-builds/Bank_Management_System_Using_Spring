<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>User Details</title>
  <style>
    /* Reset and base font */
    * { margin: 0; padding: 0; box-sizing: border-box; }
    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      width: 100vw; height: 100vh;
      display: flex; justify-content: center; align-items: center;
      background: linear-gradient(135deg, #ade8f4, #90e0ef);
      animation: bgFade 1.5s ease-in-out;
    }
    @keyframes bgFade {
      from { opacity: 0; }
      to { opacity: 1; }
    }
    /* Container for the buttons */
    .card {
      background: rgba(255,255,255,0.8);
      padding: 2vw 3vw;
      border-radius: 1vw;
      box-shadow: 0 8px 20px rgba(0,0,0,0.1);
      display: flex;
      flex-direction: column;
      align-items: stretch;
      animation: popIn 0.8s ease-out;
    }
    @keyframes popIn {
      from { transform: scale(0.8); opacity: 0; }
      to   { transform: scale(1);   opacity: 1; }
    }
    .card form {
      margin: 1vw 0;
    }
    .card input[type="submit"] {
      width: 100%;
      padding: 1vw;
      font-size: 1.2vw;
      font-weight: bold;
      color: #fff;
      background: linear-gradient(135deg, #0077b6, #00b4d8);
      border: none;
      border-radius: .5vw;
      cursor: pointer;
      transition: transform 0.3s, box-shadow 0.3s;
    }
    .card input[type="submit"]:hover {
      transform: translateY(-3px);
      box-shadow: 0 6px 15px rgba(0, 112, 179, 0.4);
    }
    @media (max-width: 768px) {
      .card input[type="submit"] {
        font-size: 3vw;
        padding: 1.5vw;
      }
    }
  </style>
</head>
<body>

  <div class="card">
    <form action="getalluserdetails">
      <input type="submit" value="Get All User Details">
    </form>
    <form action="getpendinguserdetails">
      <input type="submit" value="Get Pending User Details">
    </form>
    <form action="">
      <input type="submit" value="Get Closing User Details">
    </form>
  </div>

</body>
</html>
