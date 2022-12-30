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
    <title>insert</title>
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
      <h1>홈쇼핑 회원 수정</h1>
      <table width="800" border="1">
        <form action="/shopping/update" method="post">
          <tr>
            <td>회원번호(자동발생)</td>
            <td class="data"><input type="text" value="${content.custno}" name="custno" size="20"></td>
          </tr>
          <tr>
            <td>회원성명</td>
            <td class="data"><input type="text" value="${content.custname}" name="custname" size="20"></td>
          </tr>
          <tr>
            <td>회원전화</td>
            <td class="data"><input type="text" value="${content.phone}" name="phone" size="30"></td>
          </tr>
          <tr>
            <td>회원주소</td>
            <td class="data"><input type="text" value="${content.address}" name="address" size="50"></td>
          </tr>
          <tr>
            <td>가입일자</td>
            <td class="data"><input type="text" value="${content.joindate}" name="joindate" size="20"></td>
          </tr>
          <tr>
            <td>고객등급[A:VIP,B:일반,C:직원]</td>
            <td class="data"><input type="text" value="${content.grade}" name="grade" size="20"></td>
          </tr>
          <tr>
            <td>도시코드</td>
            <td class="data"><input type="text" value="${content.city}" name="city" size="20"></td>
          </tr>
          <tr>
            <td colspan="2"><input type="submit" value="등록">
            <input type="button" value="조회" ></td>
          </tr>
        </form>
      </table>
    </section>
    <footer>
      <h3 id="foot">HRD KOREA Copyright © 2016 All rights reserved Human Resources Development Service of Korea.</h3>
    </footer>
  </body>
</html>
