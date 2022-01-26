package com.kingsoft.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kingsoft.demo.modo.Estimations;
import com.kingsoft.demo.modo.UserInputImpl;
@Controller

public class Controller1 {

	
	@GetMapping("/")
	public String homePage(Model model) {
		UserInputImpl userInputs=new UserInputImpl();
		
		model.addAttribute("userInput",userInputs);
		return "index";
	}
	

}
