package com.xworkz.trivago.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.trivago.dto.TrivagoDto;
import com.xworkz.trivago.entity.TrivagoEntity;
import com.xworkz.trivago.repo.TrivagoRepo;

@Service
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

	@Override
	public List<TrivagoDto> findAll() {
	 List<TrivagoEntity> entityList =  repo.findAll();
	 ArrayList<TrivagoDto> dtolist = new ArrayList<TrivagoDto>();
	 
	 for (TrivagoEntity en : entityList) {
		 TrivagoDto dto = new TrivagoDto();
		System.out.println(en);
		BeanUtils.copyProperties(en, dto);
		dtolist.add(dto);
		System.out.println(dto);
	}
	 System.out.println(dtolist.toString());
		return dtolist;
	}

	@Override
	public TrivagoDto findById(int id) {
	   System.out.println("find by id in service :" +id);
	   TrivagoDto dto = new TrivagoDto();
	   if(id!=0) {
		   TrivagoEntity entity = repo.findById(id);
	   
	  if(entity!=null) {
		  System.out.println("Entity is not null");
		  BeanUtils.copyProperties(entity, dto);
	  }else {
		  System.out.println("Entity is null");
	  }
	   }
		return dto;
	}

	@Override
	public List<TrivagoDto> findByName(String name) {
		System.out.println("find by name:" +name);
		List<TrivagoEntity> entityList = repo.findByName(name);
		List<TrivagoDto> dtoList = new ArrayList<TrivagoDto>();
		
		for (TrivagoEntity ent : entityList) {
			TrivagoDto dto = new TrivagoDto();
			System.out.println(ent);
			BeanUtils.copyProperties(ent,dto);
			dtoList.add(dto);
			System.out.println(dto);
		}	
		System.out.println(dtoList.toString());
		return dtoList;
	}

	@Override
	public List<TrivagoDto> findByPhoneNo(Long phoneNo) {
		List<TrivagoEntity> entityList = repo.findByPhoneNo(phoneNo);
		List<TrivagoDto> dtoList = new ArrayList<TrivagoDto>();
		
		for (TrivagoEntity  entity : entityList) {
			TrivagoDto dto = new TrivagoDto();
			System.out.println(entity);
			BeanUtils.copyProperties(entity,dto);
			dtoList.add(dto);
			System.out.println(dto);
			
		}
		System.out.println(dtoList.toString());
		return dtoList;
	}

	@Override
	public List<TrivagoDto> findByEmailId(String emailId) {
	List<TrivagoEntity> entityList	=  repo.findByEmailId(emailId);
	List<TrivagoDto> dtoList = new ArrayList<TrivagoDto>();
	for (TrivagoEntity email : entityList) {
		TrivagoDto dto = new TrivagoDto();
		System.out.println(email);
		BeanUtils.copyProperties(email, dto);
		dtoList.add(dto);
		System.out.println(dto);
		
	}
	System.out.println(dtoList.toString());
	return dtoList;
	}
}
