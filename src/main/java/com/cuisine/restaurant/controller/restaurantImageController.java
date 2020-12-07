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

@WebServlet("/restaurant/image")
public class restaurantImageController extends HttpServlet{

   private static final long serialVersionUID = 1L;

      @Override
      public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
            Connection connection = DriverManager.getConnection(url, "cuisine", "12345");
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM restaurantImage";
            String id = request.getParameter("id");
            
            if (id != null)
               sql += " where id=" + id;
           
            ResultSet resultSet = statement.executeQuery(sql);
            List<Data> list = new ArrayList<>();
            while (resultSet.next()) {
               Data data = new Data();
               data.setId(resultSet.getInt(1));
               data.setPic1(resultSet.getString(2));
               data.setPic2(resultSet.getString(3));
               data.setPic3(resultSet.getString(4));
               data.setPic4(resultSet.getString(5));


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
         String pic1;
         String pic2;
         String pic3;
         String pic4;
      public int getId() {
         return id;
      }
      public void setId(int id) {
         this.id = id;
      }
      public String getPic1() {
         return pic1;
      }
      public void setPic1(String pic1) {
         this.pic1 = pic1;
      }
      public String getPic2() {
         return pic2;
      }
      public void setPic2(String pic2) {
         this.pic2 = pic2;
      }
      public String getPic3() {
         return pic3;
      }
      public void setPic3(String pic3) {
         this.pic3 = pic3;
      }
      public String getPic4() {
         return pic4;
      }
      public void setPic4(String pic4) {
         this.pic4 = pic4;
      }
      
      
         
         
      }
};