<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ include file ="/for/common.jsp" %>
<%
// <%@ <-- 디렉티브(Directive) <설명서>
// <% <--스크립트릿(Scriptlet) <실행부>
// <%= <-- 익스프레션(Expression)<표현식> 
// <%! <-- 디클레이션(Declaration)<선언부> 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
1.jsp<br>
<%
RequestDispatcher requestDispatcher = request.getRequestDispatcher(root+"/for/2.jsp");
requestDispatcher.forward(request, response);
%>
</body>
</html>