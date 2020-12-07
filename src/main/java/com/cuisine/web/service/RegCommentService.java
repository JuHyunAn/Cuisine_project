package com.cuisine.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cuisine.web.entity.Comment;

public class RegCommentService {

	public int insertComment(Comment comment) throws ClassNotFoundException, SQLException {
		int result = 0;
		String sql = "insert into comment(restaurantId, memberId, content, score) values (?, ?, ?, ?)";
		String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "cuisine", "12345");
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, comment.getRestaurantId());
		st.setInt(2, comment.getMemberId());
		st.setString(3, comment.getContent());
		st.setInt(4, comment.getScore());
		
		result = st.executeUpdate();
		return result;
	}
}
