package com.cuisine.main.controller;

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

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;

import com.google.gson.Gson;

@WebServlet("/restaurant/images")
public class MainimgController extends HttpServlet {
   private static final long serialVersionUID = 1L;

   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
         Connection connection = DriverManager.getConnection(url, "cuisine", "12345");
         String sql = "SELECT restaurantList.* ,restaurantImage.pic1,restaurantImage.id FROM restaurantList  join restaurantImage  WHERE restaurantList.id= restaurantImage.id and restaurantImage.id=?";
         String id = request.getParameter("id");
         PreparedStatement statement = connection.prepareStatement(sql);
         
         statement.setString(1, id);
//         if (editorId != null)
//            sql += "and editorId=" + editorId;

         ResultSet resultSet = statement.executeQuery();
         List<Data> list = new ArrayList<>();
         while (resultSet.next()) {
            Data data = new Data();
            data.setId(resultSet.getInt(1));
            data.setName(resultSet.getString(2));
            data.setAddress(resultSet.getString(3));
            data.setPhone(resultSet.getString(4));
            data.setOpeningHours(resultSet.getString(5));
            data.setBreakingHours(resultSet.getString(6));
            data.setHallCleanness(resultSet.getDouble(7));
            data.setToiletCleanness(resultSet.getDouble(8));
            data.setParkinglot(resultSet.getInt(9));
            data.setAverageScore(resultSet.getDouble(10));
            data.setEditorId(resultSet.getInt(11));
            data.setPic1(resultSet.getString(12));
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
      String name;
      String address;
      String phone;
      String openingHours;
      String breakingHours;
      public Data(int id, String name, String address, String phone, String openingHours, String breakingHours,
         double hallCleanness, double toiletCleanness, int parkinglot, double averageScore, int editorId,
         String pic1) {
   
      this.id = id;
      this.name = name;
      this.address = address;
      this.phone = phone;
      this.openingHours = openingHours;
      this.breakingHours = breakingHours;
      this.hallCleanness = hallCleanness;
      this.toiletCleanness = toiletCleanness;
      this.parkinglot = parkinglot;
      this.averageScore = averageScore;
      this.editorId = editorId;
      this.pic1 = pic1;
   }

   public Data() {
   }

   double hallCleanness;
      double toiletCleanness;
      int parkinglot;
      double averageScore;
      int editorId;
      String pic1;

      public String getPic1() {
      return pic1;
   }

   public void setPic1(String pic1) {
      this.pic1 = pic1;
   }

   public int getId() {
         return id;
      }

      public void setId(int id) {
         this.id = id;
      }

      public String getName() {
         return name;
      }

      public void setName(String name) {
         this.name = name;
      }

      public String getAddress() {
         return address;
      }

      public void setAddress(String address) {
         this.address = address;
      }

      public String getPhone() {
         return phone;
      }

      public void setPhone(String phone) {
         this.phone = phone;
      }

      public String getOpeningHours() {
         return openingHours;
      }

      public void setOpeningHours(String openingHours) {
         this.openingHours = openingHours;
      }

      public String getBreakingHours() {
         return breakingHours;
      }

      public void setBreakingHours(String breakingHours) {
         this.breakingHours = breakingHours;
      }

      public double getHallCleanness() {
         return hallCleanness;
      }

      public void setHallCleanness(double hallCleanness) {
         this.hallCleanness = hallCleanness;
      }

      public double getToiletCleanness() {
         return toiletCleanness;
      }

      public void setToiletCleanness(double toiletCleanness) {
         this.toiletCleanness = toiletCleanness;
      }

      public int getParkinglot() {
         return parkinglot;
      }

      public void setParkinglot(int parkinglot) {
         this.parkinglot = parkinglot;
      }

      public double getAverageScore() {
         return averageScore;
      }

      public void setAverageScore(double averageScore) {
         this.averageScore = averageScore;
      }

      public int getEditorId() {
         return editorId;
      }

      public void setEditorId(int editorId) {
         this.editorId = editorId;
      }

   }
}