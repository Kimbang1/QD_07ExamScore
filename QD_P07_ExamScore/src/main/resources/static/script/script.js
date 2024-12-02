$(function() {
	
	//수험자 정보 저장 시작
	$("button#saveBTN").click(function(){
		let ExamnumberVal=$("#Examnumber").val().trim();
		let ExamNameVal=$("#ExamName").val().trim();
		let KoreanVal=$("#Korean").val().trim();
		let KhistoryVal=$("#Khistory").val().trim();
		let PhoneNumberVal=$("#PhoneNumber").val().trim();
		
		
		if(ExamnumberVal==""|| ExamNameVal==""||KoreanVal==""||KhistoryVal==""||PhoneNumber==""){
			alert("정보를 다 입력해야 합니다.");
			$("#ExamnumbermVal").focus();
		}else{
			let writeData ={
				Examnumber: ExamnumberVal,
				ExamName: ExamNameVal,
				Korean: KoreanVal,
				Khistory: KhistoryVal,
				PhoneNumber: PhoneNumberVal
			}
			console.log(writeData);
			
			$.ajax({
				type:"POST",
				url:"/list",
				data:JSON.stringify(writeData),
				contentType: "application/json; charset=utf-8"
			}).done(function(){
				alert("저장되었습니다.")
				location="/";
			}).fail(function(error){
				console.log(error)
				alert("오류가 발생했습니다.")
			});
		}
	});
	
		//목록 버튼 이벤트
		$("button.listBTN").click(function(){
			location.href="/list";
		});
});