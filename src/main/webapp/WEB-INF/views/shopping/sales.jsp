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
      <h1>회원매출조회</h1>
      <table width="600" border="1">
        <thead>
          <tr>
            <td>회원번호</td>
            <td>회원성명</td>
            <td>고객등급</td>
            <td>매출</td>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="sales" items="${salesList}">
            <tr>
              <td>${sales.custno}</td>
              <td>${sales.custname}</td>
              <td>${sales.grade}</td>
              <td>${sales.sales}</td>
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
