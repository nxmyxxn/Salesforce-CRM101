package com.javaex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javaex.vo.FormVo;

public class FormDao {
  private Connection getConnection() throws SQLException {
    Connection conn = null;
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
      conn = DriverManager.getConnection(dburl, "C##WEBDB", "1234");
    } catch (ClassNotFoundException e) {
      System.err.println("JDBC 드라이버 로드 실패!");
    }
    return conn;
  }
  
	public int insert(FormVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0 ;
		
		try {
			conn = getConnection();
			
			String query ="insert into USERS "+
					"(user_id, user_name, email, phone_number,"+
					"password, product_type, order_quantity, "+
					"privacy_agreement,service_agreement, marketing_email_agreement) VALUES" +
					" (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);	
			
			pstmt.setString(1, vo.getUserId());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getPhone());
			pstmt.setString(5, vo.getPassword());
			pstmt.setString(6, vo.getProductType());
			 if (vo.getOrderQuantity() != null) {
	        	    int quantity = vo.getQuantityAsInt();
	        	    if (quantity > 0) {
	        	        pstmt.setInt(7, quantity);
	        	    } else {
	        	        pstmt.setNull(7, java.sql.Types.INTEGER);
	        	    }
	        	} else {
	        	    pstmt.setNull(7, java.sql.Types.INTEGER); // ← 이 부분이 필요!
	        	}			pstmt.setString(8, vo.getPrivacyAgreement());
			pstmt.setString(9, vo.getServiceAgreement());
			pstmt.setString(10, vo.getMarketingEmailAgreement());
			
		
			count = pstmt.executeUpdate();
			
			System.out.println(count + "건 등록");
			
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
		}
		return count;
	}
	

	
	public List<FormVo> getList() {

		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<FormVo> list = new ArrayList<FormVo>();

		try {
		  conn = getConnection();
			
			// 3. SQL문 준비 / 바인딩 / 실행
			String query = "select user_id, user_name, email, phone_number, " +
							"password, product_type, order_quantity, "+
							"privacy_agreement,service_agreement, marketing_email_agreement"
						       + " from USERS ";
			pstmt = conn.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			
			// 4.결과처리
			while(rs.next()) {
				String userId = rs.getString("user_id");
				String userName = rs.getString("user_name");
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phone_number");
				String password = rs.getString("password");
				String productType = rs.getString("product_type");
				String orderQuantity = rs.getString("order_quantity");
				String privacyAgreement = rs.getString("privacy_agreement");
				String serviceAgreement = rs.getString("service_agreement");
				String marketingEmailAgreement = rs.getString("marketing_email_agreement");
				
				
				FormVo vo = new FormVo(userId, userName, email, phoneNumber, password, productType, orderQuantity, privacyAgreement, serviceAgreement, marketingEmailAgreement);
				list.add(vo);
			}
			
			
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			// 5. 자원정리
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}

		}

		return list;
	}

}