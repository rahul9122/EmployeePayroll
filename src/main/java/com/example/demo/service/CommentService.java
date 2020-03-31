package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CommentEntity;
import com.example.demo.model.CommentOfComment;




public interface CommentService {
	
	public CommentEntity add(CommentEntity commentEntity);
	
	public CommentOfComment getComment1(Long id);
	
	public List<CommentEntity> getComment2(Long id);


}
