<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>member</title>
    <link href="/css/golfStyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<header>
    <h2>골프연습장 회원관리 프로그램 ver 1.0</h2>
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
    <h1>회원정보 조회</h1>
    <table width="700" border="1">
        <thead>
        <tr>
            <td>수강일</td>
            <td>회원번호</td>
            <td>회원명</td>
            <td>강의명</td>
            <td>강의장소</td>
            <td>수강료</td>
            <td>등급</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="member" items="${members}">
            <tr>
                <td>${member.regist_month}</td>
                <td>${member.c_no}</td>
                <td>${member.c_name}</td>
                <td>${member.class_name}</td>
                <td>${member.class_area}</td>
                <td>${member.tuition}</td>
                <td>${member.grade}</td>
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