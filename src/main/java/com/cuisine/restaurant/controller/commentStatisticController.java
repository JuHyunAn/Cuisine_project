package com.cuisine.restaurant.controller;

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

import com.google.gson.Gson;

@WebServlet("/restaurant/commemt/statistic")
public class commentStatisticController extends HttpServlet {

   private static final long serialVersionUID = 1L;

   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
         Connection connection = DriverManager.getConnection(url, "cuisine", "12345");
         Statement statement = connection.createStatement();
         String sql = "SELECT * FROM commentStatistic";
         String restaurantId = request.getParameter("restaurantId");

         if (restaurantId != null)
            sql += " where restaurantId=" + restaurantId;

         ResultSet resultSet = statement.executeQuery(sql);
         List<Data> list = new ArrayList<>();
         while (resultSet.next()) {
            Data data = new Data();
            data.setRestaurantId(resultSet.getInt(1));
            data.setEditorId(resultSet.getInt(2));
            data.setEditorName(resultSet.getString(3));
            data.setEditorDescription(resultSet.getString(4));
            data.setAverageScore(resultSet.getDouble(5));
            data.setCommentCount(resultSet.getInt(6));
            data.setEditorImage(resultSet.getString(7));
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

   public class Data {

      int restaurantId;
      int editorId;
      String editorName;
      String editorDescription;
      double averageScore;
      int commentCount;
      String editorImage;
      public int getRestaurantId() {
         return restaurantId;
      }
      public void setRestaurantId(int restaurantId) {
         this.restaurantId = restaurantId;
      }
      public int getEditorId() {
         return editorId;
      }
      public void setEditorId(int editorId) {
         this.editorId = editorId;
      }
      public String getEditorName() {
         return editorName;
      }
      public void setEditorName(String editorName) {
         this.editorName = editorName;
      }
      public String getEditorDescription() {
         return editorDescription;
      }
      public void setEditorDescription(String editorDescription) {
         this.editorDescription = editorDescription;
      }
      public double getAverageScore() {
         return averageScore;
      }
      public void setAverageScore(double averageScore) {
         this.averageScore = averageScore;
      }
      public int getCommentCount() {
         return commentCount;
      }
      public void setCommentCount(int commentCount) {
         this.commentCount = commentCount;
      }
      public String getEditorImage() {
         return editorImage;
      }
      public void setEditorImage(String editorImage) {
         this.editorImage = editorImage;
      }
      
   }
}