package com.cuisine.main.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;

@WebServlet("/index.jsp")
public class MainController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// req.getRequestDispatcher("login.jsp").forward(req, resp);
//		response.sendRedirect("login.jsp");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		TilesContainer container = TilesAccess.getContainer(request.getSession().getServletContext());
		container.render("main.index", request, response);
	}
}
