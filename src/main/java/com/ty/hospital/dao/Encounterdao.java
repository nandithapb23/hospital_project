//package com.ty.hospital.dao;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//import com.ty.hospital.dto.Branch;
//import com.ty.hospital.dto.Encounter;
//import com.ty.hospital.dto.Person;
//
//public class Encounterdao {
//	public EntityManager getEntityManager() {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("radha");
//		return entityManagerFactory.createEntityManager();
//	}
//
//	public void saveEnounter( int id, Encounter encounter,int branchid) {
//		EntityManager entityManager = getEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		Person person = entityManager.find(Person.class, id);
//		Branch branch=entityManager. find(Branch.class, branchid);
//    	if(person!=null) {
//    		entityTransaction.begin();
//    		person.setPerson_id(id);
//    		branch.setB_id(branchid);
//    		List<Branch>list=new ArrayList<Branch>();
//    		List<Encounter>list1=new ArrayList<Encounter>();
//    		list.add(branch);
//    		person.setEncounters(list1);
//    		encounter.setBranches(list);
//    		entityManager.persist(encounter);
//    		entityManager.merge(person);
//    		entityManager.merge(branch);
//    		entityTransaction.commit();
//		}
//	}
//
//	public void deleteEncounter(int id) {
//		EntityManager entityManager = getEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		Encounter encounter = entityManager.find(Encounter.class, id);
//		if (encounter != null) {
//			entityTransaction.begin();
//			entityManager.remove(encounter);
//			entityTransaction.commit();
//		} else {
//			System.out.println("No Such Encounter Found");
//		}
//	}
//
//	public void getEncounterDetails(int id) {
//		EntityManager entityManager = getEntityManager();
//		Person encounter =entityManager.find(Person.class, id);
//		if(encounter !=null)
//		{   
//			System.out.println(encounter);
//		}
//		else {
//			System.out.println("NO Such Id Found");
//		}
//	}
//	public void getAllEncounterDetails() {
//		EntityManager entityManager = getEntityManager();
//		Query query = entityManager.createQuery("Select e from Encounter e");
//		List<Encounter> list=query.getResultList();
//		System.out.println(list);
//
//}
//}
//
