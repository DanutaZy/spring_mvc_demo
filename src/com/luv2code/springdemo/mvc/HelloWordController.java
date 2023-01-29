package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloWordController {

	//need a controller method to show the initial html form

	@RequestMapping("/showForm")
	public String showForm() {
		return"helloworld-form";	
	}
	
	//need a controller method to process info from html form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	// new controller method to read from data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude (HttpServletRequest request, Model model) {
		
		//read the request parameter from html form
		String theName = request.getParameter("studentName");
		// convert the data to all caps
		theName=theName.toUpperCase();
		//create message
		String result ="Yo! " +theName;
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree (@RequestParam("studentName") String theName, Model model) {
		
		// convert the data to all caps
		theName=theName.toUpperCase();
		//create message
		String result ="Whazuup! " +theName;
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
}
