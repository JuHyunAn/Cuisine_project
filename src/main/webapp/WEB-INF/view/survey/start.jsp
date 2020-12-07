<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<link href="/css/survey/style2.css" type="text/css" rel="stylesheet">
<link href="/css/survey/reset.css" type="text/css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap"
	rel="stylesheet">

<div id="body">
	<section class="tips">
		<div class="d1">
			<text>성향테스트</text>
		</div>
		<div class="d2">
			<div class="tip1">
				<div class="text">
					<div class="title">총 테스트 문항은 10개입니다.</div>
				</div>
			</div>
			<div class="tip2">
				<div class="text">
					<div class="title">혹 질문이 마음에 들지 않더라도 정직하게 답변하십시오.</div>
				</div>
			</div>
		</div>
		<button type="button" class="btn-next"
			onclick="location.href='/survey/list?id=${sessionScope.idTest}&surveyId=1'">
			테스트 하기</button>
	</section>
</div>