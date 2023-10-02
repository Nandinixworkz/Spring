package com.xworkz.trivago.repo;

import com.xworkz.trivago.dto.TrivagoDto;

public interface TrivagoRepo {
	
	abstract boolean save(TrivagoDto dto);

}
