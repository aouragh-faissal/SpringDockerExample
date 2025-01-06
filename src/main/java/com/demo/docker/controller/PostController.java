package com.demo.docker.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.docker.model.Post;
import com.demo.docker.repository.PostRepository;

@RestController
@RequestMapping("/")
public class PostController {
	
	private final PostRepository repository;
	
	public PostController(PostRepository repository) {
		this.repository = repository;	}
	
	
	@GetMapping("all")
	public List<Post> getall(){
		return repository.findAll();
	}
	
	@GetMapping("{id}")
	public Post getpost(@PathVariable Integer id){
		return repository.findById(id).get();
	}
	
	@PostMapping("add")
	public ResponseEntity<Void> addpost(@RequestBody Post post){
		repository.save(post);
		return new  ResponseEntity<>(HttpStatus.OK);
	}

}
