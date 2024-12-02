package com.qd07.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qd07.DTO.Examdto;
import com.qd07.domain.Post;
import com.qd07.domainRepo.PostRepository;

import jakarta.transaction.Transactional;

@Service
public class ExamService {
	
	private PostRepository postRepository;


	@Autowired
	public ExamService(PostRepository postRepository) {
		this.postRepository=postRepository;
	}
	
	@Transactional
	public void save(Examdto examdto) {
		
       
        // Post 객체를 저장
        postRepository.save(post);
        System.out.println("Exam Info: " + post);
	}
}
