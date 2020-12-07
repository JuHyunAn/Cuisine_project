package com.cuisine.restaurant;

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

@WebServlet("/restaurant/resdetail")
public class ResDetail extends HttpServlet {
   private static final long serialVersionUID = 1L;

   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {
         String id = request.getParameter("id");
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
         Connection connection = DriverManager.getConnection(url, "cuisine", "12345");
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery("select * from restaurantDetail where id = " + id);
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
            data.setToiletCleaness(resultSet.getDouble(8));
            data.setParkinglot(resultSet.getDouble(9));
            data.setAvg(resultSet.getDouble(10));

            list.add(data);
         }
         response.setCharacterEncoding("UTF-8");
         response.setContentType("text/; charset=UTF-8");
         
         //request.getRequestDispatcher("/WEB-INF/view/restaurant/detail.jsp").forward(request, response);
//         response.sendRedirect("/WEB-INF/view/restaurant/detail.jsp");
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
      double hallCleanness;
      double toiletCleaness;
      double parkinglot;
      double avg;
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
      public double getToiletCleaness() {
         return toiletCleaness;
      }
      public void setToiletCleaness(double toiletCleaness) {
         this.toiletCleaness = toiletCleaness;
      }
      public double getParkinglot() {
         return parkinglot;
      }
      public void setParkinglot(double parkinglot) {
         this.parkinglot = parkinglot;
      }
      public double getAvg() {
         return avg;
      }
      public void setAvg(double avg) {
         this.avg = avg;
      }
      
      

   }
}