<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page import="com.javaex.dao.FormDao"%>
<%@ page import="com.javaex.vo.FormVo"%>

<% 
	request.setCharacterEncoding("UTF-8");
	
	//입력받기
	//getParameter안에 인자는 form태그의 name속성이 일치하는 input에서 가져옴
	String userId = request.getParameter("userId");
	String userName = request.getParameter("name");
	String email = request.getParameter("email");
	String phoneNumber = request.getParameter("hp");
	String password = request.getParameter("password1");
	String productType = request.getParameter("type");
	String orderQuantity = request.getParameter("orderQuantity");
	String orderInputQuantity = request.getParameter("orderInputQuantity");
	String finalQuantity = (orderInputQuantity != null && !orderInputQuantity.isEmpty()) 
            ? orderInputQuantity 
            : orderQuantity;
	
	String privacyAgreement = request.getParameter("pagree");
	String serviceAgreement = request.getParameter("sagree");
	String marketingEmailAgreement = request.getParameter("ragree");
	
	
	
	if("on".equals(privacyAgreement)){
		privacyAgreement = "Y";
	}
	else{
		privacyAgreement = "N";
	}
	System.out.println(privacyAgreement);

	if("on".equals(serviceAgreement)){
		serviceAgreement = "Y";
	}
	else{
		serviceAgreement = "N";
	}
	
	if("on".equals(marketingEmailAgreement)){
		marketingEmailAgreement = "Y";
	}
	else{
		marketingEmailAgreement = "N";
	}
	
	
	FormVo vo = new FormVo(userId, userName, email, phoneNumber, password, productType, finalQuantity, privacyAgreement, serviceAgreement, marketingEmailAgreement);
	
	//데이터베이스 작업 담당할 객체(dao) 생성
	FormDao dao = new FormDao();
	dao.insert(vo);

	response.sendRedirect("result.jsp");
	
	
	
%>