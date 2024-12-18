package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhotodetailController {
	@GetMapping("/photodetailone")
	public String getMonumentsOne() {
		return "photodetailone";
	}

	@GetMapping("/photodetailtwo")
	public String getMonumentsTwo() {
		return "photodetailtwo";
	}
	
	@GetMapping("/photodetailthree")
	public String getMonumentsThree() {
		return "photodetailthree";
	}
	@GetMapping("/photodetailfour")
	public String getMonumentsfour() {
		return "photodetailfour";
	}
	
	
}
