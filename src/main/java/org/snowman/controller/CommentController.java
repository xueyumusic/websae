package org.snowman.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.snowman.model.Comment;
import org.snowman.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommentController {
	@Autowired
	private CommentRepository commentRepository;
	
	@RequestMapping(value="/comment", method=RequestMethod.GET) 
	public String comment(Model model) {
		model.addAttribute("comment", new Comment());
		List<Comment> comments = commentRepository.getAll();
		for (Comment comment: comments) {
			System.out.println("##get comment from jpa:"+comment.getContent());
		}
		return "comment";
	}
	
	@RequestMapping(value="/comment", method=RequestMethod.POST) 
	public String comment(HttpServletRequest req, final Comment comment, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("###binding has errors");
			return null;
		}
		System.out.println("##post req string"+req);
		System.out.println("##post content:"+comment.getContent());
		System.out.println("##post author:"+comment.getAuthor());
		
		String content = comment.getContent();
		String author = comment.getAuthor();
		Long cid = commentRepository.save(new Comment(content, author));
		System.out.println("##save return cid:"+cid);
		return "comment";
	}
	
	
}
