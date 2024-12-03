package com.qd07.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.qd07.domain.Post;
import com.qd07.domainRepo.PostRepository;

import jakarta.transaction.Transactional;

@Service
public class ExamService {
   
   @Autowired
   private PostRepository postRepository;
   
   @Transactional
   public void save(Post post) {
      
        // Post 객체를 저장
        postRepository.save(post);
        System.out.println("Exam Info: " + post);
   }
   
   public List<Post> getallPosts(){
	   //데이터 베이스에서 모든 post객체를 가져와서 반화
	   
	   return postRepository.findAll();
	   }
   //ID로 Post 객체를 가져오는 메서드 추가
  public Post getPostByExamName(String examName) {
	  
	  return postRepository.findByExamName(examName);
	  
   }
  

}
