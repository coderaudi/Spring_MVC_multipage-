package com.allcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicControllers {
	
	@RequestMapping("/home")
	public String gotoHomePage() {
		return "home";
	}
	
	
	// test the form with action url as ; testdemo
	
	
	@RequestMapping(value="/testdemo" , method = RequestMethod.GET )
	public String dispdata( @RequestParam String name) {
		System.out.println("you are get form req ..");
		System.out.println("you entered .. "+name);
		
		return "home";
	}

}
