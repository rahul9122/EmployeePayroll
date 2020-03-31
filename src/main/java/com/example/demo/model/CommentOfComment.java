package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class CommentOfComment {
	
	public CommentEntity commentEntity;
	
	public List<CommentOfComment> commentOfComments=new ArrayList<CommentOfComment>();

	public CommentEntity getCommentEntity() {
		return commentEntity;
	}

	public void setCommentEntity(CommentEntity commentEntity) {
		this.commentEntity = commentEntity;
	}

	public List<CommentOfComment> getCommentOfComments() {
		return commentOfComments;
	}

	public void setCommentOfComments(List<CommentOfComment> commentOfComments) {
		this.commentOfComments = commentOfComments;
	}
	

}
