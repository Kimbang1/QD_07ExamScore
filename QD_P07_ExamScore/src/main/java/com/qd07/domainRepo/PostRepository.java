package com.qd07.domainRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qd07.domain.Post;

public interface PostRepository extends JpaRepository<Post,Long >{

	//단순 조건?
	public Post findByExamName(String examName);	//where name =?

	
}
