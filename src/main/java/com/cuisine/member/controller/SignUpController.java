package com.cuisine.member.controller;

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

import com.cuisine.member.entity.Member;
import com.cuisine.member.service.MemberService;
import com.cuisine.web.entity.Comment;
import com.google.gson.Gson;

@WebServlet("/signup")
public class SignUpController extends HttpServlet { // signup.jsp에서 값 읽어들이는 컨트롤러
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/; charset=UTF-8");
		request.getRequestDispatcher("/signup.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");

		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String gender_ = request.getParameter("gender");
		int gender = Integer.parseInt(gender_);
		String age_ = request.getParameter("age");
		int age = Integer.parseInt(age_);
		String email = request.getParameter("email");
		String address = request.getParameter("address");

		Member member = new Member();
		member.setUserId(id);
		member.setPwd(pwd);
		member.setGender(gender);
		member.setAge(age);
		member.setEmail(email);
		member.setAddress(address);

		MemberService service = new MemberService();
		try {
			int result = service.insertMember(member);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//      try {
//         boolean mem = service.getCheckMember(id);
//
//         if (mem != false) {
//            System.out.println("");
//            
//         } else {
////            int result = service.insertMember(member);
////            System.out.println(result);
//        	 // System.out.println("지금 안돼는듯요");
//         }
//
//      } catch (ClassNotFoundException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      } catch (SQLException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      }

		response.sendRedirect("success.jsp");

	}
}