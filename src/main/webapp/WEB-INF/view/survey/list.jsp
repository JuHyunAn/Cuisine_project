<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!-- <script src="/js/survey/submitPage.js"></script> -->
	<link href = "/css/survey/style.css" type="text/css" rel="stylesheet">
	<link href = "/css/survey/reset.css" type="text/css" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
<div id="body">
	<h1 class="d-none">입맛 테스트 화면</h1>
	<div class="content-container">
		<span class="test-title">정식 테스트!</span> <span class="test-explain">간단한 테스트를 해보고 음식추천을 받아보세욧!</span>			
		
		<%-- <span>${option1}</span>
		<a href="answer?memberId=${memberId}&surveyId=${surveyId}&answer=1"><img src="${option1Image}"></a>
		<span>${option2}</span>
		<a href="answer?memberId=${memberId}&surveyId=${surveyId}&answer=2"><img src="${option1Image}"></a>  --%>
		

		<div class="box">
			<b id="testId" class="d-none"></b>
			<div class="option-group">
				<div id="option1"><a href="answer?id=${sessionScope.idTest}&surveyId=${surveyId}&answer=0"><img src="../images/survey/${option1Image}"></a></div>
				<div id="option2"><a href="answer?id=${sessionScope.idTest}&surveyId=${surveyId}&answer=1"><img src="../images/survey/${option2Image}"></a></div>
			</div>
			<div id="text">
				<div id="option11">${option1}</div>
				<div id="option22">${option2}</div>
			</div>
			

		</div> 

	</div>
</div>

<style>
	#text {
		font-family: 'Jua', sans-serif;
	}
	.option-group img {
		border-radius: 10px;
	}
	.content-container .test-title {
	  font-family: 'Do Hyeon', sans-serif;
	  color: #26B2AA;
	}
	  
	.content-container .test-explain {
		font-family: 'Do Hyeon', sans-serif;
		color: #EA7B19;
		font-size: 40px;
		margin-left: 3%;		
	}
</style>