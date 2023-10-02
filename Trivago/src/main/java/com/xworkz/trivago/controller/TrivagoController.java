package com.xworkz.trivago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.trivago.dto.TrivagoDto;
import com.xworkz.trivago.service.TrivagoService;

@Component
@RequestMapping("/")
public class TrivagoController {

	@Autowired
	TrivagoService service;
	
	@PostMapping("/save")
	public String save(@ModelAttribute TrivagoDto dto, Model model) {
	  model.addAttribute("TO",dto);
	  service.onSave(dto);
		return "Success.jsp";
		
	}
}
