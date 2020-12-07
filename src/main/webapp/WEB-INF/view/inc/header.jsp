<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
<header id="header">
	<div id="logo">
	
		<a href="/"> <img src="/images/survey/logo.png" alt="미감동행" />
		</a>
	</div>
	<div class="header-container">
		<div class="editor">
			<a href="/main/editors">캐릭터별 특성</a>
		</div>
		<div>
		<a href="/survey/start">정식테스트하기</a>
			<%-- <a href="/survey/list?id=${sessionScope.idTest}&surveyId=1">정식테스트하기</a> --%>
		</div>
		<div>
			<a href="/restaurant/list">음식점 매칭하기</a>
		</div>
	</div>
	</div>
	
	<div class="login">
        <c:if test="${sessionScope.userId == null}">
        <div class="btn-login">
				<a href="/signup">로그인 / 회원가입</a>
			</div>
        <!-- <a href="/signup">로그인/회원가입</a> -->
        </c:if>
        <c:if test="${sessionScope.userId != null}">
       <!--  <a href="/main/logout">로그아웃</a> -->
       <div class="btn-login">
				<a href="/main/logout">로그아웃</a>
			</div>
        </c:if>
        </div>
</header>