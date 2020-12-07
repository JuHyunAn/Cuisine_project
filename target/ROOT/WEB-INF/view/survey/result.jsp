<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="/js/survey/result.js"></script>
 <div id="body">
        <h1 class="d-none">결과페이지얍</h1>
        <h2 class="d-none">당신의 캐릭터는?</h2>

        <div class="result-container">
            <div class="result-editor">
                <!-- <div class="result-editor-image"><img src="/images/editor/에디터.PNG"></div>
                <div class="result-editor-name"><span>단짠단짠</span></div>
                <div class="result-editor-percent"><span>매칭률 : 85%</span></div> -->
                <div class="result-editor-image"></div>
                <div class="result-editor-name"></div>
                <div class="result-editor-percent"></div>
            </div>
            <div class="result-explain">
                <div class="result-explain-title"></div>
                <div class="result-explain-content">
                 
                </div>
            </div>

            <div class="result-other-editor">
                <div class="other-editor">
                    <div><span><img src="/images/editors/editor3.PNG"></span></div>
                    <div><span>${char1Name}</span></div>
                    <div><span>매칭률 :${char1MatchRate}%</span></div>
                </div>
                <div class="other-editor">
                    <div><span><img src="/images/editors/editor3.PNG"></span></div>
                    <div><span>${char2Name}</span></div>
                    <div><span>매칭률 :${char2MatchRate}%</span></div>
                </div>
            </div>
        </div>