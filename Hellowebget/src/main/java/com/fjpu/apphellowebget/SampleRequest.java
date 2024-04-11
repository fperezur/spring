package com.fjpu.apphellowebget;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleRequest {
	
	@GetMapping("/say")
	public String saySomething(@RequestParam(value="something", 
							required=false,
							defaultValue="Hello") String something,
							Model model) {
		model.addAttribute("something", something);
		return "say";
	}
	
	@GetMapping("/add")
	public String add(@RequestParam(value="a", 
							required=true,
							defaultValue="0") Integer a,
						@RequestParam(value="b", 
							required=true,
							defaultValue="0") Integer b,
						Model model) {
		int result = a + b;
		model.addAttribute("result", result);
		return "add";
	}

}
