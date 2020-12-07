<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <script src="/js/restaurant/restaurant_list.js"  charset="UTF-8"></script>
 <main>
        <div class="charac">
            <h1 class ="d-none">캐릭터 목록 </h1>
            <c:forEach var="editor" items="${editors}">
                <div><a href="/restaurant/list?editorId=${editor.id}">${editor.name}</a></div>
            </c:forEach>
            <!-- <div class="editor1"><img src="/images/editors/1.png" style="width:100px; height:100px;"></div>
            <div class="editor2"><img src="/images/editors/2.png" style="width:100px; height:100px;"></div>
            <div class="editor3"><img src="/images/editors/3.png" style="width:100px; height:100px;"></div>
            <div class="editor4"><img src="/images/editors/4.png" style="width:100px; height:100px;"></div>
            <div class="editor5"><img src="/images/editors/5.png" style="width:100px; height:100px;"></div>
            <div class="editor6"><img src="/images/editors/6.png" style="width:100px; height:100px;"></div> -->
        </div>
       
        <div>
            <h2>자신의 캐릭터를 선택해주세요</h2>
        </div>
        <table class="board">
            <thead>
                <tr>
                    <td>가게이름</td>
                    <td>사진</td>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="restaurant" items="${restaurants}">
                    <tr>
                        <td><a href="detail?=${restaurant.id}">${restaurant.name}</a></td>                    
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </main>
