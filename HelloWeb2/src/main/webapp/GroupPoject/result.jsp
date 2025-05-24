<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.javaex.dao.FormDao" %>
<%@ page import="com.javaex.vo.FormVo" %>
<%@ page import="java.util.List"%>

<%
	FormDao dao = new FormDao();
	List<FormVo> list = dao.getList();
	System.out.println(list.toString());
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Result</title>

</head>
<body>

<%
// 한글등(UTF8)을 위한 코드
request.setCharacterEncoding("UTF-8");
%>




<h1>Form 작성 성공</h1>
	<p>입력한 정보 내역입니다.</p>
	<!-- 메일정보 리스트 -->
	<%-- list에서 하나씩 빼서 테이블를 채운다--%>
	<% 
		for(FormVo vo : list) {
	%>
	<table border="1" cellpadding="5" cellspacing="2">
    <tr>
		<td align=right width="110">name</td>
		<td width="170"><%=vo.getName() %></td>
	</tr>
	<tr>
		<td align=right width="110">id</td>
		<td width="170"><%=vo.getUserId() %></td>
	</tr>
	<tr>
		<td align=right width="110">email</td>
		<td width="170"><%=vo.getEmail() %></td>
	</tr>
	
	
	<tr>
		<td align=right width="110">phone number</td>
		<td width="170"><%=vo.getPhone() %></td>
	</tr>
	<tr>
		<td align=right width="110">type</td>
		<td width="170"><%=vo.getProductType() %></td>
	</tr>
	<tr>
		<td align=right width="110">order quantity</td>
		<td width="170"><%=vo.getOrderQuantity() %></td>
	</tr>
	<tr>
		<td align=right width="110">privacy agreement</td>
		<td width="170"><%=vo.getPrivacyAgreement() %></td>
	</tr>
	<tr>
		<td align=right width="110">service agreement</td>
		<td width="170"><%=vo.getServiceAgreement() %></td>
	</tr>
	<tr>
		<td align=right width="110">order marketing agreement</td>
		<td width="170"><%=vo.getMarketingEmailAgreement() %></td>
	</tr>
	
	<%= list.size() %>
	

	</table>
	<br>
	<%		
		}
	%>
	<p>
		<a href="form.jsp?no">추가 form 등록</a>
	</p>
	<br>




</body>
</html>