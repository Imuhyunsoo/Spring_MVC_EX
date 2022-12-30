<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>apply</title>
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
    <h1>수강신청</h1>
    <table width="800" border="1">
        <form action="/apply" method="post">
            <tr>
                <td>수강월</td>
                <td class="data"><input type="text" name="regist_month" size="20">  2022년03월 예)202203</td>
            </tr>
            <tr>
                <td>회원명</td>
                <td class="data">
                    <select name="c_name">
                        <option value="회원명" selected="selected">회원명</option>
                        <c:forEach var="list" items="${list}">
                            <option value="${list.c_name}">${list.c_name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>회원번호</td>
                <td class="data"><input type="text" name="c_no" size="30">  예)10001</td>
            </tr>
            <tr>
                <td>강의장소</td>
                <td class="data">
                    <select name="class_area">
                        <option value="강의장소" selected="selected">강의장소</option>
                        <c:forEach var="list" items="${list}">
                            <option value="${list.class_area}">${list.class_area}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>강의명</td>
                <td class="data">
                    <select name="teacher_code">
                        <option value="강의신청" selected="selected">강의신청</option>
                        <option value="초급반">초급반</option>
                        <option value="중급반">중급반</option>
                        <option value="고급반">고급반</option>
                        <option value="심화반">심화반</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>수강료</td>
                <td class="data"><input type="text" name="tuition" size="20">원</td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="수강신청">
                    <input type="button" value="다시쓰기"></td>
            </tr>
        </form>
    </table>
</section>
<footer>
    <h3 id="foot">HRD KOREA Copyright © 2015 All rights reserved Human Resources Development Service of Korea.</h3>
</footer>
</body>
</html>