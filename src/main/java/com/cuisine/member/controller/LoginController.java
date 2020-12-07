package com.cuisine.member.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cuisine.member.entity.Member;
import com.cuisine.member.service.MemberService;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		request.getRequestDispatcher("/signup.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");

		MemberService service = new MemberService();

		String id = request.getParameter("id");
		String userId = request.getParameter("userId");
		String pwd = request.getParameter("pwd");
//		System.out.println(userId + " " + pwd);

		Member member = new Member();

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			member = service.getMember(userId, pwd);
			if (member != null) {
				request.setAttribute("member", member);
				out.println("<script>alert('로그인 되었습니다'); location.href='/';</script>");
				HttpSession session = request.getSession();
				session.setAttribute("userId", userId);
				
				String sql = "SELECT id FROM member where userId=?";// WHERE NUM BETWEEN 1 AND 10";

				// String url = "jdbc:oracle:thin:@112.223.37.243:1521/xepdb1";
				String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";

				// Class.forName("oracle.jdbc.driver.OracleDriver");
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, "cuisine", "12345");
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, userId);

				ResultSet rs = st.executeQuery();
				rs.next();
				String idtest = rs.getString("id");

				session.setAttribute("idTest", idtest);

			} else {
				out.println("<script>alert('아이디/비밀번호를 다시 확인해주세요'); location.href='/login';</script>");

			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//      try {
//         member = service.getMember(userId, pwd);
//         if (member != null) {
//            request.setAttribute("member", member);
//            out.println(
//                  "<script>alert('로그인 되었습니다'); location.href='/success.jsp';</script>");
//         } else
//            out.println(
//                  "<script>alert('아이디/비밀번호를 다시 확인해주세요'); location.href='/login';</script>");
//      } catch (ClassNotFoundException | SQLException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      }
	}
}