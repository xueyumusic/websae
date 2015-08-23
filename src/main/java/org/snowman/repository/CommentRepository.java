package org.snowman.repository;

import java.util.List;

import org.snowman.model.Comment;

public interface CommentRepository {

	public Long save(Comment comment);
	
	public List<Comment> getAll();
}
