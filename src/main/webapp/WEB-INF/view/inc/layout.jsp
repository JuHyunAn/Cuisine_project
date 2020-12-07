<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
<head>
    <title>미감동행</title>
    <meta charset="UTF-8">
    <title>Main page</title>
</head>

<body>
    <!------- header 부분 -------->
   <tiles:insertAttribute name="header" />
    <!---------------- main ------------------>
    <tiles:insertAttribute name="main" />
    <!---------------- Footer ------------------>
    <tiles:insertAttribute name="footer" />
</body>

</html>