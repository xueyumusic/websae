package org.snowman.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home.do")
	public String home(HttpServletRequest req, HttpServletResponse resp) {
		//return "/WEB-INF/templates/home.html";
		System.out.println("###url is"+req.getPathInfo());
		System.out.println("###context path:"+req.getContextPath());
		//resp.addHeader("Content-Type", "text/html; charset=UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		return "home";
	}
	
	@RequestMapping("/intro.do")
	public String introduction(HttpServletRequest req, HttpServletResponse resp) {
		//return "/WEB-INF/templates/home.html";
		System.out.println("###inrtro url is"+req.getPathInfo());
		//resp.addHeader("Content-Type", "text/html; charset=UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		return "resume";
	}
}
