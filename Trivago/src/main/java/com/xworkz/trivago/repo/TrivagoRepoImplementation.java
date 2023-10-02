package com.xworkz.trivago.repo;

import org.springframework.stereotype.Component;

import com.xworkz.trivago.dto.TrivagoDto;

@Component
public class TrivagoRepoImplementation implements TrivagoRepo {

	public TrivagoRepoImplementation() {
		System.out.println("TrivagoRepoImplementation");
	}
	@Override
	public boolean save(TrivagoDto dto) {
		System.out.println("this is save method .....");
		System.out.println(dto);
		return false;
	}

}
