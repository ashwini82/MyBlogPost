package com.example.demo.BlogPost;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class BlogPost {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long Id;
	
	String title,author,entry;
	
	public BlogPost() {
		//
	}
	

	public BlogPost(String title, String author, String entry) {
		super();
		this.title = title;
		this.author = author;
		this.entry = entry;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	@Override
	public String toString() {
		return "BlogPost [ title=" + title + ", author=" + author + ", entry=" + entry + "]";
	}
	
	

}
