package com.demo.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.docker.model.Post;



public interface PostRepository extends JpaRepository<Post, Integer>{

}
