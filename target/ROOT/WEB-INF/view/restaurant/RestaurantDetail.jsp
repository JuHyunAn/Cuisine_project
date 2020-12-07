<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link href="RestaurantDetail.css" type="text/css" rel="stylesheet">
<script src="RestaurantDetail.js"></script>
</head>
<body>
	<div id="header">
		<h1 class="hd_top">임의의 헤더 영역</h1>
	</div>
	<!-- <h1>음식점 상세 화면</h1> -->
	<div id="main">
		<div class="wrap_image">
			<div class="image_position">
				<!--레스토랑_이미지 불러오기  -->
			</div>
			<div>
				<table class="editor-table">
				<!-- comment-statistices 에디터 보여주는 테이블-->


				</table>
			</div>
		</div>
		<!------음식점 상세정보-->
		<div class="restaurant-detail">
			<!-- 식당 이름 등 정보 -->>				
		</div>
		<div class="comment-table d-none">

			<table class="member-comment">
<!-- 				<thead>
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
	</div>
	<div id="footer">
		<h1>임의의 푸터 영역</h1>
	</div>
	<script>
   <%-- <%
      request.setCharacterEncoding("UTF-8");
      String id = request.getParameter("id");
   %> --%>
   <%-- var id = <%= id %>; --%>
   </script>
</body>
</html>