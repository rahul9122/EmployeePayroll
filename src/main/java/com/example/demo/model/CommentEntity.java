
package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class CommentEntity {
	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;   
	 
	 private String message;
	 
	 @Column(columnDefinition = "bigint default -1")
	 private Long parentId;
	 

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	 
	 
	 

	 
	 
	 

}
