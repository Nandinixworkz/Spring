package com.xworkz.trivago.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xworkz.trivago.dto.TrivagoDto;


public interface TrivagoService {
	
	public abstract boolean onSave(TrivagoDto dto);
	public abstract List<TrivagoDto> findAll();
	public abstract TrivagoDto findById(int id);
	public abstract List<TrivagoDto> findByName(String name);
	public abstract List<TrivagoDto> findByPhoneNo(Long phoneNo);
	public abstract List<TrivagoDto> findByEmailId(String emailId);
	
}
