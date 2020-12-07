<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	  <header id="header">
        <div id="logo">
            <a href="index">
                <img src="/images/survey/logo.png" alt="미감동행" />
            </a>
        </div>
        <div class="header-container">
            <div class="editor">
                <a href="../main/editors">캐릭터별 특성</a>
            </div>
            <div>
                <a href="../survey/list">정식테스트하기</a>
            </div>
            <div>
                <a href="../restaurant/list">음식점 매칭하기</a>
            </div>
        </div>
        </div>
        <div class="login">
        <c:if test="${sessionScope.userId == null}">
        <a href="/cuisine/signup">로그인/회원가입</a>
        </c:if>
        <c:if test="${sessionScope.userId != null}">
        <a href="/cuisine/main/logout">로그아웃</a>
        </c:if>
        </div>
        
    </header>