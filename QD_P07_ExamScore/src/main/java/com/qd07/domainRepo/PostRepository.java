package com.qd07.domainRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qd07.domain.Post;

public interface PostRepository extends JpaRepository<Post,Long >{

}
