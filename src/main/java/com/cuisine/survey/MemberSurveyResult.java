package com.cuisine.survey;

import java.io.IOException;
import java.sql.CallableStatement;
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



@WebServlet("/survey/result")
public class MemberSurveyResult extends HttpServlet {
   private static final long serialVersionUID = 1L;

   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {
         HttpSession session = request.getSession();
         String idtest = (String) session.getAttribute("idTest");

         Class.forName("com.mysql.cj.jdbc.Driver");
         String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
         Connection connection = DriverManager.getConnection(url, "cuisine", "12345");
         Statement statement = connection.createStatement();
         String sql = "SELECT editorId,matchRate FROM member where id=" + idtest;

         response.setCharacterEncoding("UTF-8");
         response.setContentType("text/; charset=UTF-8");

         ResultSet resultSet = statement.executeQuery(sql);
         resultSet.next();
         request.setAttribute("editorId", resultSet.getString(1));
         request.setAttribute("matchRate", resultSet.getString(2));
         
         String x = (String)resultSet.getString(1);
         
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         String url2 = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
         Connection connection2 = DriverManager.getConnection(url2, "cuisine", "12345");
         Statement statement2 = connection2.createStatement();
         String sql2 = "SELECT name,description from editor where id =" + x;
         
         ResultSet resultSet2 = statement2.executeQuery(sql2);
         resultSet2.next();
         request.setAttribute("name", resultSet2.getString(1));
         request.setAttribute("descroption", resultSet2.getString(2));
         
         
         String idTest = (String)session.getAttribute("idTest"); 
         CallableStatement callableStatement = connection.prepareCall("{call getMatchRate(?)}");
         callableStatement.setInt(1, Integer.parseInt(idTest));
         ResultSet resultSet3 = callableStatement.executeQuery();
         resultSet3.next();
         request.setAttribute("char1Id", resultSet3.getString(1));
         request.setAttribute("char1Name", resultSet3.getString(2));
         request.setAttribute("char1MatchRate", resultSet3.getString(3));
         resultSet3.next();
         System.out.println(resultSet3.getString(1));
         request.setAttribute("char2Id", resultSet3.getString(1));
         request.setAttribute("char2Name", resultSet3.getString(2));
         request.setAttribute("char2MatchRate", resultSet3.getString(3));
         resultSet3.next();
         request.setAttribute("char3Id", resultSet3.getString(1));
         request.setAttribute("char3Name", resultSet3.getString(2));
         request.setAttribute("char3MatchRate", resultSet3.getString(3));
         resultSet3.next();
         request.setAttribute("char4Id", resultSet3.getString(1));
         request.setAttribute("char4Name", resultSet3.getString(2));
         request.setAttribute("char4MatchRate", resultSet3.getString(3));
         resultSet3.next();
         request.setAttribute("char5Id", resultSet3.getString(1));
         request.setAttribute("char5Name", resultSet3.getString(2));
         request.setAttribute("char5MatchRate", resultSet3.getString(3));
//         String xTest = (String)resultSet3.getString(2);
//         System.out.println(xTest);
//         String yTest = (String)resultSet3.getString(3);
//         System.out.println(yTest);
//         resultSet3.next();
//         String x2Test = (String)resultSet3.getString(2);
//         System.out.println(x2Test);
//         String y2Test = (String)resultSet3.getString(3);
//         System.out.println(y2Test);
//         resultSet3.next();
//         request.setAttribute("char1Name", resultSet.getString(2));
//         request.setAttribute("char1MatchRate", resultSet.getString(3));
//         resultSet.next();
//         request.setAttribute("char2Name", resultSet.getString(2));
//         request.setAttribute("char2MatchRate", resultSet.getString(3));
         
//         Class.forName("com.mysql.cj.jdbc.Driver");
//         String url2 = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
//         Connection connection2 = DriverManager.getConnection(url, "cuisine", "12345");
//         Statement statement2 = connection.createStatement();
//         String sql2 = "SELECT editorId,matchRate FROM member where id="+ idtest;
         // request.getRequestDispatcher("/WEB-INF/view/cuisine/test.jsp").forward(request,
         // response);

         // response.sendRedirect(""); //        ٲٴ         ο       ΰ 
      } catch (SQLException e) {
         System.out.println("SQLException: " + e);
      } catch (ClassNotFoundException e) {
         System.out.println("ClassNotFoundException: " + e);
      }

      
      
      TilesContainer container = TilesAccess.getContainer(request.getSession().getServletContext());
      container.render("survey.result", request, response);
   }

   public class Data {

      int memberId;
      int surveyId;
      int result;

      public int getMemberId() {
         return memberId;
      }

      public void setMemberId(int memberId) {
         this.memberId = memberId;
      }

      public int getSurveyId() {
         return surveyId;
      }

      public void setSurveyId(int surveyId) {
         this.surveyId = surveyId;
      }

      public int getResult() {
         return result;
      }

      public void setResult(int result) {
         this.result = result;
      }

   }
}