package com.ty.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.hospital.dto.Encounter;

public class PersonDetail {

	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();
	}

	public void getEncounterDetails(int id) {
		EntityManager entityManager = getEntityManager();
		Encounter encounter = entityManager.find(Encounter.class, id);
		if (encounter != null) {
			System.out.println(encounter);
		} else {
			System.out.println("NO Such Id Found");
		}
	}

}
