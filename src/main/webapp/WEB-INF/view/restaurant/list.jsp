<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <script src="/js/restaurant/list.js"  charset="UTF-8"></script>
     <link href = "/css/survey/reset.css" type="text/css" rel="stylesheet">
     <link href = "/css/survey/style.css" type="text/css" rel="stylesheet">
     <link href = "/css/restaurant/list.css" type="text/css" rel="stylesheet">
          <link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
 <main id ="main">
        <div class="selectChar">
            <h2>자신과 같은 성향의 캐릭터를 선택해주세요!</h2>
        </div>
        <section class="charc">
            <div class="img-charc">
                <h1 class ="d-none">캐릭터 목록 </h1>
                <div class="editor"><img data-id="1" src="../images/editors/charcter11.png" style="width:180px; height:180px;"><p>달게 그러나 짜게</p></div>
                <div class="editor"><img data-id="2" src="../images/editors/charcter22.png" style="width:180px; height:180px;"><p>중독의 매운맛</p></div>
                <div class="editor"><img data-id="3" src="../images/editors/charcter33.png" style="width:180px; height:180px;"><p>건강. 싱거움.</p></div>
                <div class="editor"><img data-id="4" src="../images/editors/charcter44.png" style="width:180px; height:180px;"><p>다 잘먹는 아름다움</p></div>
                <div class="editor"><img data-id="5" src="../images/editors/charcter55.png" style="width:180px; height:180px;"><p>옛날이 그리운 당신</p></div>
            </div>
        </section>
       
        <table class="board">
            
        </table>
    </main>



    <style>
    	.img-charc img {
			border-radius: 100%;
			cursor:pointer
    	}

		.img-charc img:hover {
			box-shadow: 0 20px 8px -3px rgba(50, 50, 93, 0.3);
			-ms-transform: scale(1.1);
			-webkit-transform: scale(1.1);
			transform: scale(1.2);
			transition: 0.4s ease-in-out;
		}
		
		.selectChar {
			margin-top: 30px;
			font-family: 'Do Hyeon', sans-serif;
			color: #26B2AA;
			font-size: 30px;
		}
		
		.img-charc p {
			font-family: 'Jua', sans-serif;
			font-size: 25px;
			text-align: center;
			color: #EA7B19;
		}
		
		.board a {
		  color: #000;
		  display:inline-block; 
		  margin:0;
		  text-transform:uppercase; 
		  font-family: 'Do Hyeon', sans-serif;
		  font-size: 40px; 
		}
		
		/*-- 밑줄 그어지는 효과 --*/
		.board a:after {
		  display:block;
		  content: '';
		  border-bottom: solid 30px #26B2AA;  
		  transform: scaleX(0);  
		  transition: transform 250ms ease-in-out;
		}
		.board a:hover:after { transform: scaleX(1); }
		.board a.fromRight:after{ transform-origin:100% 50%; }
		.board a.fromLeft:after{  transform-origin:  0% 50%; }
    </style>