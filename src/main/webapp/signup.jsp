<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
   <link rel="stylesheet" href="/css/signup.css">
    <title>로그인 / 회원가입 폼 템플릿</title>
</head>

<body>
    <div class="d1"></div>
    <div class="d2">
            <form  class="d-none"id="signup" action="signup" onsubmit="return checkit();" class="input-group" method="post">
                <input type="text" class="input-field" name="id" id="userid" placeholder="아이디" required><br>
                <input type="password" id="pwd1" class="input-field checkpassword" name="pwd" placeholder="비밀번호"
                    required><br>
                <input type="password" onblur="checkpassword();" id="pwd2" class="input-field checkpassword"
                    name="passwordcheck" placeholder="비밀번호체크" required><br>
                  <input class="radio" type="radio" name="gender" value="0" /><label style="font-size: 20px;">&nbsp남성</label>
                  <input class="radio" type="radio" name="gender" value="1" /><label style="font-size: 20px;">&nbsp여성</label>
                 
                  <!-- <input class="gen"type="text"> -->
                <input type="age" class="input-field" name="age" placeholder="나이" required><br>
                <input type="email" class="input-field" name="email" placeholder="email" required><br>
                <input type="address" class="input-field" name="address" placeholder="address" required><br>

                <input type="submit" value="회원가입">
            </form>
            <form id="login" action="login" class="input-group" method="post">
             <input type="text" class="input-field" name="userId" placeholder="아이디" required>
             <input type="password" class="input-field" name="pwd" placeholder="비밀번호" required>
                <input class="loginBtn" type="submit" value="로그인">
                <input class="signUpBtn" type="submit" value="회원가입">
         </form>      
    </div>
    <div class="d3"></div>
    <script src="js/login.js"></script>
</body>

</html>