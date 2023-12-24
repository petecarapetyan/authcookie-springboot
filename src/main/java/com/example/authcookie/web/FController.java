package com.example.authcookie.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/f")
public class FController {

	@GetMapping("/")
	public String home() {
		return "f";
	}
}
