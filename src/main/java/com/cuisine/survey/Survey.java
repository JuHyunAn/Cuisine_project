package com.cuisine.survey;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;

import com.google.gson.Gson;

@WebServlet("/survey/list")
public class Survey extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			HttpSession session = request.getSession();
			String test = (String) session.getAttribute("userId");
//			System.out.println(test);
			String idtest = (String) session.getAttribute("idTest");
//			System.out.printf("id : %s",idtest);

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
			Connection connection = DriverManager.getConnection(url, "cuisine", "12345");
			Statement statement = connection.createStatement();
			String surveyId = request.getParameter("surveyId");
			String sql = "SELECT * FROM survey01 where id = " + surveyId;
			String id = request.getParameter("id");
			

			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			request.setAttribute("surveyId", resultSet.getString(1));
			request.setAttribute("option1", resultSet.getString(2));
			request.setAttribute("option1Image", resultSet.getString(3));
			request.setAttribute("option2", resultSet.getString(4));
			request.setAttribute("option2Image", resultSet.getString(5));
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/; charset=UTF-8");
			
		      
		      if(session.getAttribute("userId") == null)
		         response.sendRedirect("../signup?returnURL=/survey/list");
			
			TilesContainer container = TilesAccess.getContainer(request.getSession().getServletContext());
			container.render("survey.list", request, response);
		} catch (SQLException e) {
			System.out.println("SQLException: " + e);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e);
		}
	}

	public class Data {

		int id;
		String option1;
		String option1Image;
		String option2;
		String option2Image;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getOption1() {
			return option1;
		}

		public void setOption1(String option1) {
			this.option1 = option1;
		}

		public String getOption1Image() {
			return option1Image;
		}

		public void setOption1Image(String option1Image) {
			this.option1Image = option1Image;
		}

		public String getOption2() {
			return option2;
		}

		public void setOption2(String option2) {
			this.option2 = option2;
		}

		public String getOption2Image() {
			return option2Image;
		}

		public void setOption2Image(String option2Image) {
			this.option2Image = option2Image;
		}
	}
}
