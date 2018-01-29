package com.pixelweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pixelweb.dao.FeedbackDao;
import com.pixelweb.model.Feedback;

@Controller
public class IndexController {
	
	@Autowired
	private FeedbackDao fDao;
	
	Feedback feedback;
	
	@RequestMapping("/")
	public String home() {
			return "index";
	}
	@RequestMapping("/feedback")
	public String feedback() {
		return "feedback";
	}
	@RequestMapping("/addFeedback")
	//public String addFeedback(@RequestParam("name") String name,@RequestParam("email") String email,
			//@RequestParam("mobile") int mobile,@RequestParam("subject") String subject,@RequestParam("message") String message) {
	public String addFeedback(@ModelAttribute("feedback") Feedback feedback) {
		//feedback = new Feedback(feedback);
		fDao.addFeedback(feedback);
		return "welcome.jsp";
	}
	@RequestMapping("getFeedback")
	public ModelAndView getFeedbacks() {
		
		ModelAndView mv = new ModelAndView("feedbacks");
		
		mv.addObject("feedbacks",fDao.getFeedbacks());
		 return mv;
	}
	@RequestMapping("getdata")
	public ModelAndView getData() {
		
		ModelAndView mv = new ModelAndView("data");
		
		mv.addObject("data",fDao.getDatas());
		 return mv;
	}
}
