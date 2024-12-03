$(function() {

	//수험자 정보 저장 시작
	$("button#saveBTN").click(function() {
		let ExamnumberVal = $("#Examnumber").val().trim();
		let ExamNameVal = $("#ExamName").val().trim();
		let KoreanVal = $("#Korean").val().trim();
		let KhistoryVal = $("#Khistory").val().trim();
		let PhoneNumberVal = $("#PhoneNumber").val().trim();


		if (ExamnumberVal == "" || ExamNameVal == "" || KoreanVal == "" || KhistoryVal == "" || PhoneNumberVal == "") {
			alert("정보를 다 입력해야 합니다.");
			$("#Examnumber").focus();
		} else {
			let writeData = {

				"examNumber": ExamnumberVal,
				"examName": ExamNameVal,
				"korean": KoreanVal,
				"khistory": KhistoryVal,
				"phoneNumber": PhoneNumberVal
			}
			console.log(writeData);

			$.ajax({
				type: "POST",
				url: "/list",
				data: JSON.stringify(writeData),	//JSON 형식으로 변환하기
				contentType: "application/json; charset=utf-8"
			}).done(function() {
				alert("저장되었습니다.")
				location = "/";
			}).fail(function(error) {
				console.log(error)
				alert("오류가 발생했습니다.")
			});
		}
	});

	//목록 버튼 이벤트
	$("button.listBTN").click(function() {
		location.href = "/list";
	});



	//리스트 클릭시 수정화면으로 이동
	$("div.refactor").on("click", function() {
		let examNum=$("div").data("examNumber");
		let korean=$("div").data("korean");
		let khistory=$("div").data("khistory");
		let average=$("div").data("average");
		let phoneNumber=$("div").data("phoneNumber");
		let regTM=$("div").data("regTM");
		
		
		const examName = $(this).data("examname"); // jQuery로 data-examName 값 가져오기
		console.log("Exam Name:", examName); // 콘솔에 출력하여 값 확인

			location.href = "/infoCard?examName=" +examName;
		
	});

});