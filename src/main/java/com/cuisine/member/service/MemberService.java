package com.cuisine.member.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cuisine.member.entity.Member;

public class MemberService {

//   public Member getMember(String userId) throws ClassNotFoundException, SQLException {
//      Member member = null;
//      String sql = "SELECT * FROM member WHERE userId = ?";// WHERE NUM BETWEEN 1 AND 10";
//      String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
//      Class.forName("com.mysql.cj.jdbc.Driver");
//      Connection con = DriverManager.getConnection(url, "cuisine", "12345");
//      PreparedStatement st = con.prepareStatement(sql);
//
//      st.setString(1, userId);
//
//      ResultSet rs = st.executeQuery();
//
//      if (rs.next()) {
//         member = new Member();
//      }
//      rs.close();
//      st.close();
//      con.close();
//      return member;
//   }

   public int insertMember(Member member) throws ClassNotFoundException, SQLException {
      int result = 0;
      String sql = "INSERT INTO member(userId,pwd,gender,age,email,address) VALUES(?,?,?,?,?,?)";
      String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection(url, "cuisine", "12345");
      PreparedStatement st = con.prepareStatement(sql);
      st.setString(1, member.getUserId());
      st.setString(2, member.getPwd());
      st.setInt(3, member.getGender());
      st.setInt(4, member.getAge());
      st.setString(5, member.getEmail());
      st.setString(6, member.getAddress());

      result = st.executeUpdate();

      return result;
   }

   public Member getMember(String userId, String pwd) throws ClassNotFoundException, SQLException {
      Member member = null;

      String sql = "SELECT * FROM member WHERE userId = ? and pwd = ? ";// WHERE NUM BETWEEN 1 AND 10";
      String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection(url, "cuisine", "12345");
      PreparedStatement st = con.prepareStatement(sql);

      st.setString(1, userId);
      st.setString(2, pwd);

      ResultSet rs = st.executeQuery();

      if (rs.next()) {
         member = new Member(rs.getString("userId"), rs.getString("pwd"), rs.getInt("gender"), rs.getInt("age"),
               rs.getString("email"), rs.getString("address"));
      }
      rs.close();
      st.close();
      con.close();

      return member;
   }
//
//   public boolean getCheckMember(String userId) throws ClassNotFoundException, SQLException {
//
//	      String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
//	      Class.forName("com.mysql.cj.jdbc.Driver");
//	      Connection con = DriverManager.getConnection(url, "cuisine", "12345");
//	      Statement st = con.createStatement();
//	      String sql = "SELECT * FROM member WHERE userId = '" + userId + "'";// WHERE NUM BETWEEN 1 AND 10";
//	      System.out.println(sql);
//	      ResultSet rs = st.executeQuery(sql);
//
//	      return rs.next();
//	   }


//   public Member getChecktype(String type, String id, String nickname) throws ClassNotFoundException, SQLException {
//      Member member = null;
//
//      String sql = "";
//      String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
//      Class.forName("com.mysql.cj.jdbc.Driver");
//      Connection con = DriverManager.getConnection(url, "cuisine", "12345");
//      PreparedStatement st = null;
//      if ("id".equals(type)) {
//         sql = "SELECT * FROM member WHERE id = ?";
//         st = con.prepareStatement(sql);
//         st.setString(1, id);
//
//      } else {
//         sql = "SELECT * FROM member WHERE nickname = ?";
//         st = con.prepareStatement(sql);
//         st.setString(1, nickname);
//      }
//
//      ResultSet rs = st.executeQuery();
//
//      if (rs.next()) {
//         member = new Member(rs.getString("userId"), rs.getString("pwd"), rs.getInt("gender"), rs.getInt("age"),
//               rs.getString("email"), rs.getString("address"));
//      }
//      rs.close();
//      st.close();
//      con.close();
//      return member;
//   }

//   public int insertMember(Member member) throws ClassNotFoundException, SQLException {
//      int result = 0;
//      String sql = "INSERT INTO member(name, password) VALUES(?,?)";
//      String url = "jdbc:mysql://dev.notepubs.com:9898/cuisine?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
//      Class.forName("com.mysql.cj.jdbc.Driver");
//      Connection con = DriverManager.getConnection(url, "cuisine", "12345");
//      PreparedStatement st = con.prepareStatement(sql);
//      st.setString(1, member.getName());
//      st.setString(2, member.getPassword());
//      
//      result = st.executeUpdate();
//      
//      return result;
//   }
}