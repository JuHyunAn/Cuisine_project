package com.cuisine.comment;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

@WebServlet("/restaurant/comment/list")
public class CommentList extends HttpServlet {
   private static final long serialVersionUID = 1L;

   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {

         Class.forName("com.mysql.cj.jdbc.Driver");
         String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
         Connection connection = DriverManager.getConnection(url, "cuisine", "12345");
         Statement statement = connection.createStatement();
         String sql = "SELECT * FROM commentList";
         String restaurantId = request.getParameter("restaurantId");
         String editorId = request.getParameter("editorId");
         if (restaurantId != null && editorId !=null)
            sql += " where restaurantId=" + restaurantId + " and editorId=" + editorId + " limit 20";

         ResultSet resultSet = statement.executeQuery(sql);

         List<Data> list = new ArrayList<>();
         while (resultSet.next()) {
            Data data = new Data();
            data.setId(resultSet.getInt(1));
            data.setRestaurantId(resultSet.getInt(2));
            data.setEditorId(resultSet.getInt(3));
            data.setUserId(resultSet.getString(4));
            data.setContent(resultSet.getString(5));
            data.setScore(resultSet.getInt(6));

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

      int id;
      int restaurantId;
      int editorId;
      String userId;
      String content;
      int score;

      public int getId() {
         return id;
      }

      public void setId(int id) {
         this.id = id;
      }

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

      public String getUserId() {
         return userId;
      }

      public void setUserId(String userId) {
         this.userId = userId;
      }

      public String getContent() {
         return content;
      }

      public void setContent(String content) {
         this.content = content;
      }

      public int getScore() {
         return score;
      }

      public void setScore(int score) {
         this.score = score;
      }
   }

}