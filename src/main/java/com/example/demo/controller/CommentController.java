package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestBody;
>>>>>>> 1c066e1ae903348277bc8108635cd69c423d9979
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CommentEntity;
import com.example.demo.model.CommentOfComment;
import com.example.demo.service.CommentService;



@RestController
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	 @RequestMapping(value= "/addcomment", method= RequestMethod.POST)
	    public CommentEntity Register(@RequestParam("message") String message,@RequestParam("parentId") Long parentId) 
	 {
		 
		 //to insert first comment insert -1 in parent id.
		 CommentEntity commentEntity=new CommentEntity();
		 commentEntity.setMessage(message);
		 commentEntity.setParentId((long) -1);
		 if(parentId!=-1)
		 {
			 commentEntity.setParentId(parentId);
		 }
	       return commentService.add(commentEntity);
	    }

<<<<<<< HEAD
	 //method 1 gives all decendent of parent comment
=======
	 
>>>>>>> 1c066e1ae903348277bc8108635cd69c423d9979
	 @RequestMapping(value= "/getcomment/method1", method= RequestMethod.GET)
	    public CommentOfComment getComment1(@RequestParam("id") Long id) 
	 {
		 return commentService.getComment1(id);
	 }
	 
<<<<<<< HEAD
	 //method 2 gives all decendent in form of array of parent comment 
=======
>>>>>>> 1c066e1ae903348277bc8108635cd69c423d9979
	 @RequestMapping(value= "/getcomment/method2", method= RequestMethod.GET)
	    public  List<CommentEntity> getComment2(@RequestParam("id") Long id) 
	 {
		 return commentService.getComment2(id);
	 }
	 
		

}
