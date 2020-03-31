package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CommentRepository;
import com.example.demo.model.CommentEntity;
import com.example.demo.model.CommentOfComment;


@Service
public class CommentServiceImpl implements CommentService {

	@Autowired 
	CommentRepository commentRepository; 
	
	@Autowired
	CommentServiceUtils commentServiceUtils;
	@Override
	public CommentEntity add(CommentEntity entity) {
		return commentRepository.save(entity) ;
	}
	@Override
	public CommentOfComment getComment1(Long id) {
		// TODO Auto-generated method stub
		return commentServiceUtils.getComments1(id);
	}
	
	@Override
	public List<CommentEntity> getComment2(Long id) {
		// TODO Auto-generated method stub
		return commentServiceUtils.getComments2(id);
	}
	
}
