package com.xworkz.trivago.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrivagoDto {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private String address;
	private Long phoneNo;
	private String dob;
	private String emailId;
	private Long aadharNo;

}
