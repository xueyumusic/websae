package org.snowman.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.snowman.model.Comment;
import org.snowman.repository.CommentRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CommentRepositoryImpl implements CommentRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Long save(Comment comment) {
		em.persist(comment);
		return comment.getId();
	}

	public List<Comment> getAll() {
		return em.createQuery("SELECT c FROM Comment c", Comment.class).getResultList();
	}

}
