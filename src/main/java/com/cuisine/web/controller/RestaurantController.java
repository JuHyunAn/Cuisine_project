package com.cuisine.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cuisine.web.entity.Restaurant;
import com.cuisine.web.service.RestaurantService;

@WebServlet("/sample")
public class RestaurantController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RestaurantService service = new RestaurantService();
		List<Restaurant> rest = new ArrayList<>();
		
		response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/; charset=UTF-8");
	}
}
