package org.snowman.controller;

import org.snowman.model.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommentController {
	
	
	@RequestMapping(value="/comment", method=RequestMethod.GET) 
	public String comment(Model model) {
		model.addAttribute("comment", new Comment());
		return "comment";
	}
	
	@RequestMapping(value="/comment", method=RequestMethod.POST) 
	public String comment(final Comment comment, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("###binding has errors");
			return null;
		}
		System.out.println("##post content:"+comment.getContent());
		System.out.println("##post author:"+comment.getAuthor());
		return "comment";
	}
	
	
}
