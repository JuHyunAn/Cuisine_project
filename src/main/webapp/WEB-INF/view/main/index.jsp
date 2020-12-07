<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<script src="/js/main/index.js" charset="UTF-8"></script>
<link href="/css/survey/reset.css" type="text/css" rel="stylesheet">
<link href="/css/survey/style.css" type="text/css" rel="stylesheet">
<link href="/css/index.css" type="text/css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap"
   rel="stylesheet">
<link
   href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap"
   rel="stylesheet">


<main id="main">
   <section id="section">
   <div class="etc">
           <h2>지금 이 시각 많은 관심을 받고 있어요!</h2>
          <p id="time-result"></p>
          <br>
          <script type="text/javascript">
            var d = new Date();
            var currentTime = d.getHours() + "시" + " "+ d.getMinutes() + "분";
            var result = document.getElementById("time-result");
            result.innerHTML = currentTime;
          </script>
   </div>
   <div id="d1">
      <h1 style="font-size: 50px;">오늘의 맛집추천</h1>
      <!--현재 시간 출력-->
      <div class="next-button">
         <img class="img" src="/images/main/next.png" style="heigt: 80px; width: 80px";>
      </div>
   </div>
      <table class="board">

      </table>
   </section>
</main>

          <style>
             h2 {
                font-family: 'Do Hyeon', sans-serif;
            font-size: 25px;
            color: #EA7B19;
         }
         #time-result {
            font-size: 23px;
            font-family: 'Do Hyeon', sans-serif;
            color: #26B2AA;
             }
             .board img {
                border-radius: 10px;
             }
          </style>