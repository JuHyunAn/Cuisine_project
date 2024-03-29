<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
    <script src="/js/main/editors.js"></script>
    <link href = "/css/survey/style.css" type="text/css" rel="stylesheet">
    <link href = "/css/main/editors.css" type="text/css" rel="stylesheet">
    
<main id="main">
        <section class="container">
            <section class="box">
                캐릭터/이름을 클릭하면 팝업 or 페이지로 이동하는데, DB에 저장된 값을 불러와야 한다. 
                <div class="img-box">
                    <div class="editor">
                        <img data-id="1" src="/images/editors/1.png" alt="1번">
                    </div>
                    <div class="editor">
                        <img data-id="2" src="/images/editors/2.png" alt="2번">
                    </div>
                    <div class="editor">
                        <img data-id="3" src="/images/editors/3.png" alt="3번">
                    </div>
                </div>
                <br>
                <div class="img-box">
                    <div class="editor">
                        <img data-id="4" src="/images/editors/4.png" alt="4번">
                    </div>
                    <div class="editor">
                        <img data-id="5" src="/images/editors/6.png" alt="6번">
                    </div>
                </div>
            </section>
            <section class="description">
                <div>
                    <h1>title</h1>
                    <p>detail</p>
                </div>
            </section>
        </section>
    </main>