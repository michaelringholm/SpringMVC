package com.opusmagus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/** Note that we have annotated the CrunchifyHelloWorld class with @Controller and @RequestMapping("/welcome"). 
 * When Spring scans our package, it will recognize this bean as being a Controller bean for processing requests. 
 * The @RequestMapping annotation tells Spring that this Controller should process all requests beginning with /welcome 
 * in the URL path. That includes /welcome/* and /welcome.html
 */
@Controller
public class DemoController {
	
	/**
	 * The ModelAndView object also contains a message with key “message” and Detailed value. 
	 * This is the data that we are passing to our view. Normally this will be a value object in 
	 * form of java bean that will contain the data to be displayed on our view. Here we are simply 
	 * passing a string.
	 * @return ModelAndView
	 */
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from DemoController.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/welcome2")
	public ModelAndView welcome2() {
 
		return new ModelAndView("welcome2");
	}
	
	@RequestMapping("/welcome3")
	public @ResponseBody String welcome3() {
		return "{status:success}";
	}	
}
