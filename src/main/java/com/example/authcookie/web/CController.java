package com.example.authcookie.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c")
public class CController {

	@GetMapping("/")
	public String home() {
		return "c";
	}
}
