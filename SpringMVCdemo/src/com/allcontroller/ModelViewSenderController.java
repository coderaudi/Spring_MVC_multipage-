package com.allcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.CS_UserPojo;

@Controller
public class ModelViewSenderController {
	
	
	@RequestMapping(value="/sendmv", method = RequestMethod.POST)
	public ModelAndView sendMVToJSP(@ModelAttribute CS_UserPojo c1) {
		
		ModelAndView m1 = new ModelAndView("mvobj_display");
		m1.addObject("user", c1);
		return m1;
		
	}

}
