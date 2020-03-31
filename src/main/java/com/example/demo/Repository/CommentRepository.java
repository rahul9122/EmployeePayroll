package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CommentEntity;



@Repository
public interface CommentRepository extends JpaRepository<CommentEntity,Long> {
	@Query(value = "SELECT * FROM comment u WHERE u.parent_id = ?1",   nativeQuery = true)
		public List<CommentEntity> findCommentEntityByParentId(Long id);
	@Query(value = "SELECT * FROM comment u WHERE u.id = ?1",   nativeQuery = true)
	public CommentEntity findByCommentId(Long id);
	

}
