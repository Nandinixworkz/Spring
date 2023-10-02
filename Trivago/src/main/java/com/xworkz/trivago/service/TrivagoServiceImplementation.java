package com.xworkz.trivago.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.trivago.dto.TrivagoDto;
import com.xworkz.trivago.repo.TrivagoRepo;
@Component
public class TrivagoServiceImplementation implements TrivagoService {
	
	@Autowired
	TrivagoRepo repo;
	
     public TrivagoServiceImplementation() {
    	 System.out.println("TrivagoServiceImplementation............");
     }

	@Override
	public boolean onSave(TrivagoDto dto) {
		System.out.println("this is onsave method in service.....");
		System.out.println(dto);
		boolean save=repo.save(dto);
		if(dto!=null) {
			return false;
		}else {
		return true;
		}
		}
		

}
