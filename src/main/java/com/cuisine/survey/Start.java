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

@WebServlet("/survey/start")
public class Start extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	HttpSession session = request.getSession();
		
	
	
		String idtest = (String) session.getAttribute("idTest");
		System.out.println(idtest);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
			Connection connection = DriverManager.getConnection(url, "cuisine", "12345");
			Statement st = connection.createStatement();
//			String surveyId = request.getParameter("surveyId");
			String sql = "DELETE  FROM memberSurveyAnswer where memberId = " + idtest;

			st.executeUpdate(sql);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url2 = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
			Connection connection2 = DriverManager.getConnection(url2, "cuisine", "12345");
			Statement st2 = connection2.createStatement();
//			String surveyId = request.getParameter("surveyId");
			String sql2 = "UPDATE member SET editorId =null , matchRate=null where id = " + idtest;

			st2.executeUpdate(sql2);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(session.getAttribute("userId") == null)
	        response.sendRedirect("../signup?returnURL=/survey/start");	
		
		TilesContainer container = TilesAccess.getContainer(request.getSession().getServletContext());
		container.render("survey.start", request, response);
	}

}
