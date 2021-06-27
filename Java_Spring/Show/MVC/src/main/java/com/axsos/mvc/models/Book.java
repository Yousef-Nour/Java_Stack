package com.axsos.mvc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
	private long id;
	
	@NotNull
	@Size(min=2, max=30)
	private String title;
	
	@NotNull
	@Size(min=10, max=100)
	private String description;
	
	@NotNull
	@Size(min=2)
	private String language;
	
	@NotNull
	@Min(50)
	private int numberOfPages;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	@Column (updatable=false)
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date updatedAt;
	
	public Book() {
		
	}
	public Book(String title, String description, String language, int numberOfPages) {
		this.title=title;
		this.description=description;
		this.language=language;
		this.numberOfPages=numberOfPages;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	@PrePersist
	protected void onCreate() {
		this.createdAt=new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt= new Date();
	}

}
