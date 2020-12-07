package com.cuisine.restaurant;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/member")
public class Member extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
			Connection connection = DriverManager.getConnection(url, "cuisine", "12345");
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM member";
			String id = request.getParameter("id");

			if (id != null)
				sql += " where id=" + id;

			ResultSet resultSet = statement.executeQuery(sql);
			List<Data> list = new ArrayList<>();
			while (resultSet.next()) {
				Data data = new Data();
				data.setId(resultSet.getInt(1));
				data.setUserId(resultSet.getString(2));
				data.setPwd(resultSet.getString(3));
				data.setGender(resultSet.getInt(4));
				data.setAge(resultSet.getInt(5));
				data.setEmail(resultSet.getString(6));
				data.setAddress(resultSet.getString(7));

				list.add(data);
			}
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/; charset=UTF-8");
			// request.getRequestDispatcher("/WEB-INF/view/cuisine/test.jsp").forward(request,
			// response);
			response.getWriter().write(new Gson().toJson(list));
			// response.sendRedirect(""); //������ �ٲٴ� ��� ���ο�������ΰ�
		} catch (SQLException e) {
			System.out.println("SQLException: " + e);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e);
		}

	}

	public class Data {

		int id;
		String userId;
		String pwd;
		int gender;
		int age;
		String email;
		String address;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public int getGender() {
			return gender;
		}

		public void setGender(int gender) {
			this.gender = gender;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	}
}
