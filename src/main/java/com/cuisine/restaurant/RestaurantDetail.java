package com.cuisine.restaurant;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;

@WebServlet("/restaurant/detail")
public class RestaurantDetail extends HttpServlet {
   private static final long serialVersionUID = 1L;

   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setCharacterEncoding("UTF-8");
         response.setContentType("text/html; charset=UTF-8");
         
         TilesContainer container = TilesAccess.getContainer(request.getSession().getServletContext());
         container.render("restaurant.detail", request, response);
      

   }
}