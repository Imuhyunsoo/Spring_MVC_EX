<%--
  Created by IntelliJ IDEA.
  User: hyunsoolim
  Date: 2022/12/06
  Time: 5:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>list</title>
    <link href="/css/shoppingStyle.css" rel="stylesheet" type="text/css">
  </head>
  <body>
    <header>
      <h2>쇼핑몰 회원관리 ver 1.0</h2>
    </header>
    <nav>
      <div>
        <a href="/shopping/registration">회원등록</a>
        <a href="/shopping/list">회원목록조회/수정</a>
        <a href="/shopping/sales">회원매출조회</a>
        <a href="/shopping/">홈으로.</a>
      </div>
    </nav>
    <section>
      <h1>회원목록조회/수정</h1>
      <table width="1300" border="1">
        <thead>
          <tr>
            <td>회원번호</td>
            <td>회원성명</td>
            <td>전화번호</td>
            <td>주소</td>
            <td>가입일자</td>
            <td>고객등급</td>
            <td>거주지역</td>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="member" items="${members}">
            <tr>
              <td><a href="/shopping/content?custno=${member.custno}">${member.custno}</a></td>
              <td>${member.custname}</td>
              <td>${member.phone}</td>
              <td>${member.address}</td>
              <td>${member.joindate}</td>
              <td>${member.grade}</td>
              <td>${member.city}</td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </section>
    <footer>
      <h3 id="foot">HRD KOREA Copyright © 2016 All rights reserved Human Resources Development Service of Korea.</h3>
    </footer>
  </body>
</html>
