<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   <!--수험결과 입력 받아오기 -->
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    <!-- 등록일 시간 yyyy-MM-dd로 바꾸기 -->
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>데이터 저장 후 목록 출력</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap">
		
		<%@ include file="../layout/header2.jsp" %>
		<!-- 성적리스트 출력 영역 -->
		<div id="ListArea">
			<div class="listColumn listHeader dFlex">
				<span class="num">번호</span>
				<span class="Examnumber">수험번호</span>
				<span class="ExamName">이름</span>
				<span class="Korean">국어</span>
				<span class="Khistory">한국사</span>
				<span class="PhoneNumber">연락처</span>
				<span class="RegTM">등록일</span>
				<span class="delete">삭제</span>
			</div>
		</div>
		
		<c:forEach var="post" items="${postList}">
		<p>${post.examName}</p>
			<div class="listColumn listRow dFlex refactor" data-examName=${post.examName != null ? post.examName : '이름 없음'}>
																<!-- 데이터 링크로 값을 가져오게되면
																		-기호 뒤에 소문자로 가져오게됨. -->
				<span class="num">${post.num}</span>
				<span class="Examnumber">${post.examNumber}</span> 
				<span class="ExamName">${post.examName}</span>
				<span class="Korean">${post.korean}</span>
				<span class="Khistory">${post.khistory}</span>
				<span class="PhoneNumber">${post.phoneNumber}</span>
				<span class="RegTM">
					<fmt:formatDate value="${post.regTM}" type="date" />
				</span>
				<span class="delete">
					<a href="/delete?num=${post.num}" class="deleteBtn"> X </a>
				</span>
			</div>
		</c:forEach>
		
	</div>
	<!-- div#wrap -->
		<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    