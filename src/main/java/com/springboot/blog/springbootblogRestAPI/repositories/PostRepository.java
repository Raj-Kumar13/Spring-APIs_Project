package com.springboot.blog.springbootblogRestAPI.repositories;

import com.springboot.blog.springbootblogRestAPI.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
