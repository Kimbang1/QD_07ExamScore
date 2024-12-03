package com.qd07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qd07.dao.ExamDao;
import com.qd07.domain.Post;
import com.qd07.domainRepo.PostRepository;
import com.qd07.service.ExamService;

@Controller
public class MainController {

	// 생성자 주입
	@Autowired
	private ExamService examService;
	
	@Autowired
	private PostRepository postRepository;

	@Autowired
	private ExamDao examDao;

	@GetMapping({ "", "/" })
	public String getinput() {
		return "input";
	}

	@GetMapping("/list")
	public String list(Model model) {
		List<Post> posts = examService.getallPosts();
		for (Post post : posts) {
	        System.out.println("Exam Name: " + post.getExamName()); // 출력 확인
	    }
		model.addAttribute("postList", posts);
		return "/Score/list"; // 경로위치
	}

	@PostMapping("/list")
	@ResponseBody
	public ResponseEntity<String> saveExamInfo(@RequestBody Post post) {
		try {
			System.out.println("Recievd Data:" + post.toString());
			examService.save(post);
			return ResponseEntity.ok("Data saved succefully!");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred" + e.getMessage());
		}
		/*
		 * System.out.println(examdto.toString()); //데이터 저장 로직 구현
		 * examService.save(examdto); return"redirect:/Score/list";
		 */
	}

	// /infoCard(상세) 페이지로 이동하는 GET 메서드를 추가
	@GetMapping("/infoCard")
	public String processInfoCard(@RequestParam("examName") String examName,
			Model model) {
		try {
			System.out.println("@@@@@@@@@@@@@@@@@@시자ㅏㄱ"+examName);
			// 입력된 값을 숫자로 변환
//			double koreanScore = Double.parseDouble(korean);
//			double khistoryScore = Double.parseDouble(khistory);

			// 평균 계산
//			double average = (koreanScore + khistoryScore) / 2.0;

			// 평균값을 모델에 추가
//			model.addAttribute("average", average);

			//상세보기 출력
			
//			Post post = new Post();
//			post = postRepository.findByExamName(examName);
			
			
			// 예시로 ID가 1인 Post 객체를 가져오는 코드
//			String examExName = "examName";
			Post post = examService.getPostByExamName(examName);

			model.addAttribute("post", post);

			// 결과를 infoCard.jsp로 전달
			return "infoCard";
		} catch (NumberFormatException e) {
			model.addAttribute("error", "숫자 형식이 잘못되었습니다.");
			return "errorPage"; // 에러 페이지로 리다이렉트 가능
		}
	}

	// 수정 페이지 이동 구현
	@GetMapping("/put")
	public String put(@RequestParam("examName") String examName, Model model) {
		Post post = examService.getPostByExamName(examName);
		model.addAttribute("Post", post);
		return "/infoCard";
	}

}
