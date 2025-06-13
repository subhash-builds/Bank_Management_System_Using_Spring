<%@page import="com.bank.entity.BankUserDetails"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>All User List</h1>
<%List<BankUserDetails> allUser=(List<BankUserDetails>)request.getAttribute("allUserList"); %>
<%=allUser %>
</body>
</html>