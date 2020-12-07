package com.cuisine.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cuisine.web.entity.Restaurant;

public class RestaurantService {
	
	public Restaurant getRestaurant(int id) throws ClassNotFoundException, SQLException {
		
		Restaurant rest = null;
		
		String sql = "SELECT * FROM restaurant";
		String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?"
				+ "useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "cuisine", "12345");
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();

		if (rs.next()) {
			rest = new Restaurant(rs.getInt("id"), rs.getString("name"), rs.getString("address"), rs.getString("phone"),
					rs.getString("workingtime"), rs.getString("breaktime"), rs.getInt("cleaness_toilet"), rs.getInt("cleaness_hall"), rs.getInt("parkinglot"));
		}
		rs.close();
		st.close();
		con.close();
		
		return rest;
	}
}
