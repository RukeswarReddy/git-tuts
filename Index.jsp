<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RUKESWAR REDDY</title>
</head>
<body>

<h1>SUM THE 2 NUMBERS</h1>

<!-- DECLARATION TAG -->

<%! int a = 100;
    int b = 200;
%>

<!-- EXPRESSION TAG -->

<%= a+b %>

<br><br>

<!-- SCRIPTLET TAG -->

<%

int a = 10;
int b = 10;
int sum = a+b;


out.print("SUM THE 2 NUMBERS : "+sum);

%>
<br> <br>

<%
int mul = a*b;

out.print("MUL THE 2 NUMBERS : "+ mul);

%>



</body>
</html>