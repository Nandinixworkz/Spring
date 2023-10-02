package com.xworkz.trivago.service;

import org.springframework.stereotype.Component;

import com.xworkz.trivago.dto.TrivagoDto;

@Component
public interface TrivagoService {
	
	abstract boolean onSave(TrivagoDto dto);

}
