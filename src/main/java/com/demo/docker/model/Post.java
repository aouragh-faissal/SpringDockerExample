package com.demo.docker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Post {
	@jakarta.persistence.Id
	@GeneratedValue
	private Integer Id;
	private String title;
	private String body;
	
	public Post() {
		// TODO Auto-generated constructor stub
	}

	public Post(Integer id, String title, String body) {
		super();
		Id = id;
		this.title = title;
		this.body = body;
	}
	
	

	public Post(String title, String body) {
		super();
		this.title = title;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Post [Id=" + Id + ", title=" + title + ", body=" + body + "]";
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	

}
