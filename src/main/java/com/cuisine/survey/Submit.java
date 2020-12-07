package com.cuisine.survey;

import java.io.IOException;
import java.sql.CallableStatement;
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
import javax.servlet.http.HttpSession;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;

@WebServlet("/survey/answer")
public class Submit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
			Connection connection = DriverManager.getConnection(url, "cuisine", "12345");
			Statement statement = connection.createStatement();
			
			HttpSession session = request.getSession();
			String idTest = (String)session.getAttribute("idTest"); 
//			System.out.println(idTest);
			
//			String id = request.getParameter("Id");
			
			
			String surveyId = request.getParameter("surveyId");
			String answer = request.getParameter("answer");
			String format = "insert into memberSurveyAnswer values(%s, %s, %s)";
			String sql = String.format(format, idTest, surveyId, answer);
			statement.executeUpdate(sql);
			if (Integer.parseInt(surveyId) < 10) {
				response.sendRedirect(
						"list?id="+idTest+"&surveyId="+String.valueOf(Integer.parseInt(surveyId)+1));
				System.out.println(surveyId);
				return;
			}
			else if (Integer.parseInt(surveyId) == 10)
				response.sendRedirect("/survey/result");
			//본인매칭
			CallableStatement callableStatement = connection.prepareCall("{call getMatchRate(?)}");
			callableStatement.setInt(1, Integer.parseInt(idTest));
			ResultSet resultSet = callableStatement.executeQuery();
			resultSet.next();
			String editorId = resultSet.getString(1);
			String matchRate = resultSet.getString(3);

			String format2 = "update member set editorId='%s', matchRate='%s' where id=%s";
			String sql2 = String.format(format2, editorId, matchRate, idTest);
			Statement statement2 = connection.createStatement();
			statement2.executeUpdate(sql2);
			
			
			request.setAttribute("char1Name", resultSet.getString(2));
			request.setAttribute("char1MatchRate", resultSet.getString(3));
			resultSet.next();
			
			request.setAttribute("char2Name", resultSet.getString(2));
			request.setAttribute("char2MatchRate", resultSet.getString(3));
			TilesContainer container = TilesAccess.getContainer(request.getSession().getServletContext());
			container.render("survey.result", request, response);
		} catch (SQLException e) {
			System.out.println("SQLException: " + e);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e);
		}
	}
}
