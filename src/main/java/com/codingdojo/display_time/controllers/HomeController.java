package com.codingdojo.display_time.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String datepage(Model model) {
		SimpleDateFormat check = new SimpleDateFormat("MM/dd/yyyy");
		Date now = new Date();
		
		String currentDate = check.format(now);
		
		model.addAttribute("currentDate", currentDate);
		
		return "datepage.jsp";
	}
	
	@RequestMapping("/time")
	public String timepage(Model model) {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date now = new Date();
		
		String currentDate = format.format(now);
		
		model.addAttribute("currentDate", currentDate);
		
		return "timepage.jsp";
	}
}
