package com.example.authcookie.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/a")
public class AController {

	@GetMapping("/")
	public String home() {
		return "a";
	}
}
