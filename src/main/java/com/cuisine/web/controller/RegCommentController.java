package com.cuisine.web.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cuisine.web.entity.Comment;
import com.cuisine.web.service.RegCommentService;
import com.google.gson.Gson;

@WebServlet("/restaurant/comment")
public class RegCommentController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		
		String restaurantId_ = request.getParameter("restaurantId");
		int restaurantId = Integer.parseInt(restaurantId_);
		String memberId_ = request.getParameter("memberId");
		int memberId = Integer.parseInt(memberId_);
		String content = request.getParameter("content");
		String score_ = request.getParameter("score");
		int score = Integer.parseInt(score_);
		
		Comment comment = new Comment();
		comment.setRestaurantId(restaurantId);
		comment.setMemberId(memberId);
		comment.setContent(content);
		comment.setScore(score);
		
		RegCommentService service = new RegCommentService();
		
		try {
			int result = service.insertComment(comment);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("comment");
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
			Connection connection = DriverManager.getConnection(url, "cuisine", "12345");
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM comment";
			String id = request.getParameter("id");

			if (id != null)
				sql += " where id=" + id;

			ResultSet resultSet = statement.executeQuery(sql);
			
			List<Comment> list = new ArrayList<>();
			while (resultSet.next()) {
					Comment data = new Comment();
					data.setId(resultSet.getInt(1));
					data.setRestaurantId(resultSet.getInt(2));
					data.setMemberId(resultSet.getInt(3));
					data.setContent(resultSet.getString(4));
					data.setScore(resultSet.getInt(5));
	
					list.add(data);
				}
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/; charset=UTF-8");
				response.getWriter().write(new Gson().toJson(list));
			} catch (SQLException e) {
				System.out.println("SQLException: " + e);
			} catch (ClassNotFoundException e) {
				System.out.println("ClassNotFoundException: " + e);
			}
		}
	}

