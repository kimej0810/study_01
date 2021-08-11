package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("template","들어옴");
		return "index";
	}
	@GetMapping("/board")
	public String board(Model model) {
		model.addAttribute("template","views/board");
		return "views/board";
	}
	@GetMapping("/write")
	public String write(Model model){
		model.addAttribute("template","views/write");
		return "views/write";
	}

}
