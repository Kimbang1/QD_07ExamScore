package com.qd07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qd07.DTO.Examdto;
import com.qd07.service.ExamService;


@Controller
public class MainController {

	
	private final ExamService examService;
	//생성자 주입
	@Autowired
	public MainController(ExamService examService) {
		this.examService=examService;
	}
	@GetMapping({"","/"})
	public String getinput() { 
		return"input";
	}
	
	@GetMapping("/list")
	public String list() {
		return"/Score/list";	//경로위치
	}
	
	@PostMapping("/list")
	public String saveExamInfo(@RequestBody Examdto examdto){
		System.out.println(examdto.toString());
		//데이터 저장 로직 구현
		examService.save(examdto);
		return"redirect:/Score/list";
	}
}
