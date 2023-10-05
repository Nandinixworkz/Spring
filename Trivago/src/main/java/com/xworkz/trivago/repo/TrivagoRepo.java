package com.xworkz.trivago.repo;

import java.util.List;

import com.xworkz.trivago.dto.TrivagoDto;
import com.xworkz.trivago.entity.TrivagoEntity;

public interface TrivagoRepo {
	
	public abstract boolean save(TrivagoDto dto);
	public abstract List<TrivagoEntity> findAll();
	public abstract TrivagoEntity findById(int id);
	public abstract List<TrivagoEntity> findByName(String name);
	public abstract List<TrivagoEntity> findByPhoneNo(Long phoneNo);
	public abstract List<TrivagoEntity> findByEmailId(String emailId);

}
