<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!--     <script src="/js/survey/result.js"></script> -->
    <link href = "/css/survey/reset.css" type="text/css" rel="stylesheet">
    <link href = "/css/survey/style.css" type="text/css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
    <!-- 차트 연습용 -->
    <script src="https://www.amcharts.com/lib/4/core.js"></script>
   <script src="https://www.amcharts.com/lib/4/charts.js"></script>
   <script src="https://www.amcharts.com/lib/4/themes/kelly.js"></script>
   <script src="https://www.amcharts.com/lib/4/themes/animated.js"></script>
    
 <div id="body">
        <h1 class="d-none">결과페이지얍</h1>
        <h2 class="d-none">당신의 캐릭터는?</h2>

        <div class="result-container">
            <div class="result-editor">
                <!-- <div class="result-editor-image"><img src="../images/editor/에디터.PNG"></div>
                <div class="result-editor-name"><span>단짠단짠</span></div>
                <div class="result-editor-percent"><span>매칭률 : 85%</span></div> -->
                <div class="result-editor-image"><img src="../images/editors/charcter${editorId}${editorId}.png" style="width:225px; height:225px"></div>
                <div class="result-editor-name">${name}</div>
                <div class="result-editor-percent">매칭률 : ${matchRate}%</div>
            </div>
            <div class="result-explain">
                <div class="result-explain-title"></div>
<!--                 <input type="button" value="버튼" onclick="location.href='/survey/result/delete'"> -->
                <div class="result-explain-content">
                 ${descroption}
                </div>
            </div>
            <!-- HTML 차트 -->
         <div id="chartdiv"></div>
      <!-- 
           <div class="result-other-editor">
                <div class="other-editor">
                    <div><span><img src="/images/editors/charcter${char2Id}.png"style="width:120px; height:120px"></span></div>
                    <div><span>${char2Name}</span></div>
                    <div><span class="match">매칭률 :${char2MatchRate}%</span></div>
                </div>
                <div class="other-editor">
                    <div><span><img src="/images/editors/charcter${char3Id}.png"style="width:120px; height:120px"></span></div>
                    <div><span>${char3Name}</span></div>
                    <div><span>매칭률 :${char3MatchRate}%</span></div>
                </div>
                <div class="other-editor">
                    <div><span><img src="/images/editors/charcter${char4Id}.png"style="width:120px; height:120px"></span></div>
                    <div><span>${char4Name}</span></div>
                    <div><span>매칭률 :${char4MatchRate}%</span></div>
                </div>
               <%--  <div class="other-editor">
                    <div><span><img src="../images/editors/editor3.PNG"></span></div>
                    <div><span>${char2Name}</span></div>
                    <div><span>매칭률 :${char2MatchRate}%</span></div>
                </div> --%>
                <!-- <div class="other-editor">
                    <div><span><img src="../images/editors/editor3.PNG"></span></div>
                    <div><span>단짠단짠4</span></div>
                    <div><span>매칭률 : 65%</span></div>
                </div> -->
            </div>
        </div>
        
        <!-- -------------------------- 차트 코드 부분 -------------------------- -->
        <!-- 차트 스타일 -->
        <style>
         #body .result-editor .result-editor-image img {
         	border-radius: 100%;
         }
         
         #body .result-editor-image {
         	margin-top: 30px;
         }
         
         #body .result-editor-name {
           font-weight:bold;
  		   font-family: 'Do Hyeon', sans-serif;
  		   color: #26B2AA;
         }
         
         #body .result-editor-percent {
           padding: 0;
           font-size: 40px;
  		   font-family: 'jua', sans-serif;
           color: #EA7B19	
         }
         
         #body .result-explain-content {
         	margin-top: 20%;
         	font-family: 'Do Hyeon', sans-serif;
         	font-weight: lighter;
         	font-size: 38px;
         	border-radius: 40px;
         	box-shadow: 0 12px 10px -5px rgba(50, 50, 93, 0.25);
         	border-top-left-radius: 0px;
  			background-color: #E7E600;
  			padding: 10px;
         }
         
         #chartdiv {
           width: 100%;
           height: 500px;
           font-family: 'Jua', sans-serif;
         }
         
         #chartdiv image {
            width: 250px;
            height: 100px;
         }
        </style>
        <!-- 차트 스크립트 -->
        <script>
         am4core.ready(function() {
         
         // Themes begin
         am4core.useTheme(am4themes_kelly);
         am4core.useTheme(am4themes_animated);
         // Themes end
         
         // Create chart instance
         var chart = am4core.create("chartdiv", am4charts.XYChart);

         // Add data
         chart.data = [{
             "name": `${char1Name}`,
             "points": `${char1MatchRate}*10`,
             "color": chart.colors.next(),
             "bullet": "../images/editors/charcter${char1Id}.png"
         }, {
            "name": `${char2Name}`,
             "points": `${char2MatchRate}*10`,
             "color": chart.colors.next(),
             "bullet": "../images/editors/charcter${char2Id}.png"
         }, {
            "name": `${char3Name}`,
             "points": `${char3MatchRate}*10`,
             "color": chart.colors.next(),
             "bullet": "../images/editors/charcter${char3Id}.png"
         }, {
            "name": `${char4Name}`,
             "points": `${char4MatchRate}*10`,
             "color": chart.colors.next(),
             "bullet": "../images/editors/charcter${char4Id}.png"
         }, {
            "name": `${char5Name}`,
             "points": `${char5MatchRate}*10`,
             "color": chart.colors.next(),
             "bullet": "../images/editors/charcter${char5Id}.png"
         }];
         
         
         // Create axes
         var categoryAxis = chart.xAxes.push(new am4charts.CategoryAxis());
         categoryAxis.dataFields.category = "name";
         categoryAxis.renderer.grid.template.disabled = true;
         categoryAxis.renderer.minGridDistance = 30;
         categoryAxis.renderer.inside = true;
         categoryAxis.renderer.labels.template.fill = am4core.color("");
         categoryAxis.renderer.labels.template.fontSize = 10;
         
         var valueAxis = chart.yAxes.push(new am4charts.ValueAxis());
         valueAxis.renderer.grid.template.strokeDasharray = "4,4";
         valueAxis.renderer.labels.template.disabled = true;
         valueAxis.min = 0;
         
         // Do not crop bullets
         chart.maskBullets = false;
         
         // Remove padding
         chart.paddingBottom = 0;
         
         // Create series
         var series = chart.series.push(new am4charts.ColumnSeries());
         series.dataFields.valueY = "points";
         series.dataFields.categoryX = "name";
         series.columns.template.propertyFields.fill = "color";
         series.columns.template.propertyFields.stroke = "color";
         series.columns.template.column.cornerRadiusTopLeft = 15;
         series.columns.template.column.cornerRadiusTopRight = 15;
         series.columns.template.tooltipText = "{categoryX}: [bold]{valueY}[/b]";
         
         // Add bullets
         var bullet = series.bullets.push(new am4charts.Bullet());
         var image = bullet.createChild(am4core.Image);
         image.horizontalCenter = "middle";
         image.verticalCenter = "bottom";
         image.dx = -100;
         image.dy = 20;
         image.y = am4core.percent(100);
         image.propertyFields.href = "bullet";
         image.tooltipText = series.columns.template.tooltipText;
         image.propertyFields.fill = "color";
         image.filters.push(new am4core.DropShadowFilter());
         
         }); // end am4core.ready()
      </script>