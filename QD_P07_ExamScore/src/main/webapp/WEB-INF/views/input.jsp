<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>데이터 입력 및 전송</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap">
		
		<%@ include file="./layout/header1.jsp" %>
		<form action="list.jsp" method="post">
			<div id="inputArea">	<!-- 수험결과 입력 영역 -->
			
				<span>수험 번호
				</span>
					<div class="inputLine">
						<input type="text" name="Examnumber" id="Examnumber">
					</div>
				
				<span>이름
				</span>	
					<div class="inputLine">
						<input type="text" name="ExamName" id="ExamName">
					</div>
				<span>국어
				</span>
					<div class="inputLine">
						<input type="text" name="Korean" id="Korean">
					</div>	
				
				<span>한국사
				</span>	
					<div class="inputLine">
						<input type="text" name="Khistory"id="Khistory">
					</div>
					
				<span>연락처
				</span>
					<div class="inputLine">
						<input type="text" name="PhoneNumber" id="PhoneNumber">
					</div>
				
					
			</div>
			<hr>
			
			<div id="btnArea" class="dFlex">
				<button id="saveBTN" type="button">저장</button>
				<button id="kus" class="listBTN" type="button">목록</button>
			</div>
			</form>
	</div>
	<!-- div#wrap -->
		<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    