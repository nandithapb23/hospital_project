package com.ty.hospital.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.MedItems;
import com.ty.hospital.dto.MedOrder;
import com.ty.hospital.dto.Person;

public class PersonSave {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();
	}

	public void savePerson(Person person) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();

		System.out.println("========successfully saved===========");
	}

	public void saveEnounter(int id, Encounter encounter, int branchid) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = entityManager.find(Person.class, id);
		Branch branch = entityManager.find(Branch.class, branchid);

		if (person != null) {
			entityTransaction.begin();

			encounter.setPerson(person);
			branch.setEncounter(encounter);
			entityManager.persist(encounter);
			entityManager.merge(person);
			entityManager.merge(branch);

			entityTransaction.commit();

		
		} else
			System.out.println("not available");

	}

	public void saveMedOrder(MedOrder medOrder, int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Encounter encounter = entityManager.find(Encounter.class, id);
		if (encounter != null) {
			entityTransaction.begin();
			medOrder.setEncounter(encounter);

			entityManager.persist(medOrder);
			entityManager.merge(encounter);

			entityTransaction.commit();

		} else
			System.out.println("not available");

	}
//	public void saveMedItems(List<MedItems>items,int id)  {
//		EntityManager entityManager=getEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		MedOrder medOrder=entityManager.find(MedOrder.class, id);
//		medOrder.setMeditems(items);
//		entityTransaction.begin();
//		entityManager.persist(items);
//		entityManager.merge(medOrder);
//		entityTransaction.commit();
//	}
	public void saveMedItems(MedItems items, int id) {
		System.out.println(items);
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		MedOrder order1 = entityManager.find(MedOrder.class, id);
		entityTransaction.begin();
		if (order1 != null) {

			items.setMedOrder(order1);
			entityManager.merge(items);
//			entityManager.merge(order1);

			entityTransaction.commit();
		} else {
			System.out.println("not found");
		}

	}

}
