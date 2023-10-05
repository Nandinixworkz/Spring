package com.xworkz.trivago.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class TrivagoDto {
	

	private String name;
	private int age;
	private String gender;
	private String address;
	private Long phoneNo;
	private String dob;
	private String emailId;
	private Long aadharNo;

}
