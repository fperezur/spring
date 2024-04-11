package com.fjpu.apphelloweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HellowebController {
	
	
	@GetMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("greet", "Hello Spring MVC");
		return "hello";
	}

}
