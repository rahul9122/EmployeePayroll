package com.example.demo.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.demo.Repository.CommentRepository;
import com.example.demo.model.CommentEntity;
import com.example.demo.model.CommentOfComment;

@Component
public class CommentServiceUtils {
	@Autowired 
	CommentRepository commentRepository; 
	
   
    
    public void dfs(CommentEntity entity, List<CommentEntity> commentOfComment)
    {
    	commentOfComment.add(entity);
    	List<CommentEntity> entities=commentRepository.findCommentEntityByParentId(entity.getId());
    	for(CommentEntity ent:entities)
    	{
    		dfs(ent, commentOfComment);
    	}
    	
    }
    
    public List<CommentEntity> getComments2(Long id)
    {
    	 List<CommentEntity> commentOfComment=new ArrayList<CommentEntity>();
    	CommentEntity entity=commentRepository.findByCommentId(id);
    	List<CommentEntity> entities=null;
    	if(entity!=null)
    	{
    		commentOfComment.add(entity);
        	entities=commentRepository.findCommentEntityByParentId(entity.getId());

        	for(CommentEntity ent:entities)
        	{
        		dfs(ent,commentOfComment);
        	}
    	}
    	
    	
    	return commentOfComment;
    	
//    	Queue<CommentEntity> que = new LinkedList<CommentEntity>(); 
//    	que.add(entity);
//    	while(!que.isEmpty())
//    	{
//    		CommentEntity commentEntity=que.poll();
//    		
//    		commentOfComment.add(commentEntity);
//    		
//    		List<CommentEntity> entities=commentRepository.findCommentEntityByParentId(commentEntity.getId());
//    		for(CommentEntity ent:entities)
//    		{
//    			que.add(ent);
//    		}
//    		
//    	}
    	
    	
    }

	 public CommentOfComment dfs(CommentEntity entity)
	    {
		 CommentOfComment commentOfComent=new CommentOfComment();
		 List<CommentEntity> entities=null;
	    	if(entity!=null)
	    	{
	    		commentOfComent.setCommentEntity(entity);
	    		
	        	entities=commentRepository.findCommentEntityByParentId(entity.getId());

	        	List<CommentOfComment> commentOfComentEntities;
				commentOfComentEntities = commentOfComentEntities=new ArrayList<CommentOfComment>();;
	        	for(CommentEntity ent:entities)
	        	{
	        		  
	        		commentOfComentEntities.add(dfs(ent));
	        	}
	        	if(commentOfComentEntities!=null&&commentOfComentEntities.size()>0)
	        	{
	        		commentOfComent.setCommentOfComments(commentOfComentEntities);
	        	}
	    	
	    }
			return commentOfComent;
	    }
	    
	    public CommentOfComment getComments1(Long id)
	    {
	    	 CommentOfComment commentOfComent=new CommentOfComment();
	    	CommentEntity entity=commentRepository.findByCommentId(id);
	    	List<CommentEntity> entities=null;
	    	if(entity!=null)
	    	{
	    		commentOfComent.setCommentEntity(entity);
	    		
	        	entities=commentRepository.findCommentEntityByParentId(entity.getId());
	        	List<CommentOfComment> commentOfComentEntities;
				commentOfComentEntities = commentOfComentEntities=new ArrayList<CommentOfComment>();;
	        	for(CommentEntity ent:entities)
	        	{
	        		  
	        		commentOfComentEntities.add(dfs(ent));
	        	}
	        	if(commentOfComentEntities!=null&&commentOfComentEntities.size()>0)
	        	{
	        		commentOfComent.setCommentOfComments(commentOfComentEntities);
	        	}
	        	
	    	}
	    	
	    	
	    	return commentOfComent;
	    	
//	    	
	    	
	    	
	    }

	
	
	
	
	
	
	
}
