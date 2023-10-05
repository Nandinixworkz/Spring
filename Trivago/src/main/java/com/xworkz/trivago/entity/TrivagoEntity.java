package com.xworkz.trivago.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Component
@Table(name = "trivago_info")
@NamedQueries({@NamedQuery(name="findAll",query="select en from TrivagoEntity en"),
@NamedQuery(name="findByName",query="select entity from TrivagoEntity entity where entity.name=:na"),
@NamedQuery(name="findByPhoneNo", query="select entity from TrivagoEntity entity where entity.phoneNo=:pn"),
@NamedQuery(name="findByEmailId", query="select entity from TrivagoEntity entity where entity.emailId=:ei")})
public class TrivagoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
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
