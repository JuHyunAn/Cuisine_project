<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<link href="/css/survey/reset.css" type="text/css" rel="stylesheet">
<link href="/css/survey/style.css" type="text/css" rel="stylesheet">
     <link href = "/css/restaurant/RestaurantDetail.css" type="text/css" rel="stylesheet">

<script src="/js/restaurant/detail.js"  charset="UTF-8"></script>
<script>
<% request.setCharacterEncoding("UTF-8");
   String id = request.getParameter("id");
    %>
var id = <%= id %>;
</script>


<!-- <h1>음식점 상세 화면</h1> -->
<main id="main">
   <div class="wrap_image">
      <div class="image_position">
         <!--             <img src="images/food/강남구청 대가방.jpg"> 
            <img src="images/food/강남역 마초쉐프.JPG"> 
            <img src="images/food/삼각지 몽탄.jpg"> -->
         <!--레스토랑_이미지 불러오기  -->
         <!-- <h2>코멘트 목록</h2> -->
      </div>
      <div class="editor_position">
         <table class="editor-table">


         </table>
         <!-- comment-statistices -->
      </div>
   </div>
   <!------음식점 상세정보-->
   <div class="restaurant-detail"></div>
   <div class="comment-table d-none">

      <table class="member-comment">
         <!--             <thead>
               <tr>
                  <td>사용자</td>
                  <td>코멘트</td>
                  <td>평점</td>
               </tr>
            </thead>
            <tbody>
               <tr><td>회원1("회원아이디")</td><td></td><td>★★★★☆</td></tr>
                        <tr><td>회원1</td><td>맛있음</td><td>★★★★☆</td></tr>
                        <tr><td>회원1</td><td>맛있음</td><td>★★★★☆</td></tr>
                        <tr><td>회원1</td><td>맛있음</td><td>★★★★☆</td></tr>
                        <tr><td>회원1</td><td>맛있음</td><td>★★★★☆</td></tr>
                        <tr><td>회원1</td><td>맛있음</td><td>★★★★☆</td></tr>
                        <tr><td>회원1</td><td>맛있음</td><td>★★★★☆</td></tr>
                        <tr><td>회원1</td><td>맛있음</td><td>★★★★☆</td></tr>
                        <tr><td>회원1</td><td>맛있음</td><td>★★★★☆</td></tr>
            </tbody> -->
      </table>
      <div>
         <button class="hide-review">X</button>
      </div>
   </div>
   <!-- 코멘트 리스트 -->
</main>


<style>
.member-comment tbody {
	font-size: 30px;
}

.comment-table {
 	border : 25px solid #26B2AA;
}

.comment-table:hover {
	border : 25px solid #EA7B19;
}

.editor-table tbody > tr {
	color: #26B2AA;
	font-weight: bold;
}
</style>