<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    int dan = Integer.parseInt(request.getParameter("dan")); //문자로 와서 숫자로바꿔줘야함
    //<% % > 안에 있으면 자바코드라고 인식함
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		
		<tr>
			<td>2</td><td>1</td><td>2</td>
		</tr>
		
		<% 
	        for(int i=1; i<=9; i++){
		%>   
				<tr>
					<td><%=dan%></td>
					<td><%=i%></td> 
					<td><%=dan*i%></td>
		        </tr>
		<% 	   
	        }
	    %>
	</table>

</body>
</html>