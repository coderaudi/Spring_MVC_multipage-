package com.allcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.CS_UserPojo;

@Controller
public class ContSysController {
	
	@RequestMapping("/contsyshome")
	public String contsysHome() {
		
		return "/contsys/contsyshome";
	}
	
	
	@RequestMapping("/signup")
	public void signup(@RequestParam String name , String email) {
		System.out.println(name+email);
	}
	
	@RequestMapping(value = "/signupobj", method = RequestMethod.POST) 
	 public void trySignUpObj(@ModelAttribute CS_UserPojo c1) 
	 { 
		System.out.println(c1.getEmail());
		System.out.println(c1.getName());
		
	 }
	
	
	
	@RequestMapping(value = "/signupobjtojsp", method = RequestMethod.POST) 
	 public ModelAndView trySignUpObjToJSP(@ModelAttribute CS_UserPojo c1) 
	 { 
		ModelAndView m1 = new ModelAndView("home");
		// adding the object using addobje method
		
		m1.addObject("user", c1); // c1 is added with key user
		System.out.println(c1.getEmail());
		System.out.println(c1.getName());
		return m1; // retuning modelandview object
		
	 }

}
