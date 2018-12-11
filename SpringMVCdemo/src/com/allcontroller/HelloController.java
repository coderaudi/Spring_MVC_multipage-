package com.allcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
@RequestMapping("/hello_q")  
    public String redirect()  
    {  
        return "error";  
    }     
@RequestMapping("/helloagain")  
public String display()  
{  
    return "final";  
    
}

}
