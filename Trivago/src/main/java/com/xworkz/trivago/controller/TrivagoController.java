package com.xworkz.trivago.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.trivago.dto.TrivagoDto;
import com.xworkz.trivago.service.TrivagoService;




@Controller
@RequestMapping("/")
public class TrivagoController {
        
	   @Autowired
        TrivagoService service;
	
	@PostMapping("/save")
	public String save(@ModelAttribute TrivagoDto dto, Model model) {
	  model.addAttribute("TO",dto);
	  service.onSave(dto);
		return "Success";
		
	}
	
	@GetMapping("findAll")
	public String findAll(Model model) {
		List<TrivagoDto> dto = service.findAll();
		if(dto!=null) {
			model.addAttribute("find",dto);
		}
			return "FindAll";
	}
	
	@GetMapping("/findById")
	public String findById(@RequestParam int id, Model model) {
	TrivagoDto dto=	service.findById(id);
	model.addAttribute("dto",dto);
	return "FindById";
	
	}
	
	@GetMapping("/findByName")
	public String findByName(@RequestParam String name, Model model) {
	List<TrivagoDto> dto =	service.findByName(name);
	if(name!=null) {
		model.addAttribute("dto",dto);
	}
		return "FindByName";	
	}
	
	@GetMapping("/findByPhoneNo")
	public String findByPhoneNo(@RequestParam Long phoneNo, Model model) {
	List<TrivagoDto> dto =	service.findByPhoneNo(phoneNo);
	if(phoneNo!=0) {
		model.addAttribute("dto1",dto);
	}
	return "FindByPhoneNo";
	}
	
	@GetMapping("/findByEmailId")
	public String findByEmailId(@RequestParam String emailId, Model model) {
	List<TrivagoDto> dto=service.findByEmailId(emailId);
		if(emailId!=null) {
			model.addAttribute("dto", dto);
		}
		return "FindByEmailId";
	}
}
