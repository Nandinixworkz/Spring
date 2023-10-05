package com.xworkz.trivago.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.trivago.dto.TrivagoDto;
import com.xworkz.trivago.entity.TrivagoEntity;

@Repository
public class TrivagoRepoImplementation implements TrivagoRepo {
	@Autowired
	private EntityManagerFactory factory;

	public TrivagoRepoImplementation() {
		System.out.println("TrivagoRepoImplementation");
	}
	@Override
	public boolean save(TrivagoDto dto) {
		System.out.println("this is save method .....");
		System.out.println(dto);
		
		TrivagoEntity entity = new TrivagoEntity();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setGender(dto.getGender());
		entity.setAddress(dto.getAddress());
		entity.setPhoneNo(dto.getPhoneNo());
		entity.setDob(dto.getDob());
		entity.setEmailId(dto.getEmailId());
		entity.setAadharNo(dto.getAadharNo());
		System.out.println(entity);
		 EntityManager manager = factory.createEntityManager();
		 EntityTransaction transaction = manager.getTransaction();
		 transaction.begin();
		 manager.persist(entity);
		 transaction.commit();
		 manager.close();
		return true;
	}
	@Override
	public List<TrivagoEntity> findAll() {
	EntityManager manager =	factory.createEntityManager();
	Query query = manager.createNamedQuery("findAll");
	List<TrivagoEntity> list = query.getResultList();
	System.out.println(query.toString());
		return list;
	}
	@Override
	public TrivagoEntity findById(int id) {
	System.out.println("find by id in repo:" +id);
	EntityManager manager =   factory.createEntityManager();
	TrivagoEntity entity = manager.find(TrivagoEntity.class,id);
		return entity;
	}
	@Override
	public List<TrivagoEntity> findByName(String name) {
		System.out.println("Find by name in repo:" +name);
		EntityManager manager =  factory.createEntityManager();
		Query query =   manager.createNamedQuery("findByName");
		query.setParameter("na", name);
		
		List<TrivagoEntity> list = query.getResultList();
		return list;
	}
	@Override
	public List<TrivagoEntity> findByPhoneNo(Long phoneNo) {
	EntityManager manager =	factory.createEntityManager();
	Query query =   manager.createNamedQuery("findByPhoneNo");
	query.setParameter("pn",phoneNo);
	List<TrivagoEntity> entity = query.getResultList();
		return entity;
	}
	@Override
	public List<TrivagoEntity> findByEmailId(String emailId) {
	EntityManager manager =	factory.createEntityManager();
	Query query =  manager.createNamedQuery("findByEmailId");
	query.setParameter("ei",emailId);
    List<TrivagoEntity> entity = query.getResultList();
		return entity;
	}

}
