<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>sales</title>
</head>
<body>
<header>
    <h2>골프연습장 회원관리 프로그램 ver 1.0</h2>
    <link href="/css/golfStyle.css" rel="stylesheet" type="text/css">
</header>
<nav>
    <div>
        <a href="/golf/teacher">강사조회</a>
        <a href="/golf/applyform">수강신청</a>
        <a href="/golf/member">회원정보조회</a>
        <a href="/golf/sales">강사매출현환</a>
        <a href="/golf/">홈으로</a>
    </div>
</nav>
<section>
    <h1>강사매출현황</h1>
    <table width="500" border="1">
        <thead>
        <tr>
            <td>강사코드</td>
            <td>강의명</td>
            <td>강사명</td>
            <td>총매출</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="sales" items="${salesList}">
            <tr>
                <td>${sales.teacher_code}</td>
                <td>${sales.class_name}</td>
                <td>${sales.teacher_name}</td>
                <td class="right">${sales.tuition}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</section>
<footer>
    <h3 id="foot">HRD KOREA Copyright © 2015 All rights reserved Human Resources Development Service of Korea.</h3>
</footer>
</body>
</html>