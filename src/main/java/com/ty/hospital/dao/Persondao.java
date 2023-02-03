package com.ty.hospital.dao;
import java.util.List;
import javax.persistence.*;
import com.ty.hospital.dto.Person;
public class Persondao {
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
			
			System.out.println("successfully saved");
		}
		
		public void updatePerson(int id,Person person)
		{
			EntityManager entityManager= getEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Person person1 = entityManager.find(Person.class, id);
			if(person1!=null) {
				entityTransaction.begin();
				person.setPerson_id(id);
			entityManager.merge(person);
			entityTransaction.commit();
			}
			else
				System.out.println("No such data is present");	
		}
		public void deletePerson(int id) {
			EntityManager entityManager = getEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			Person person = entityManager.find(Person.class, id);
			if (person != null) {
				entityTransaction.begin();
				entityManager.remove(person);
				entityTransaction.commit();
			} else {
				System.out.println("No Such person Found");
			}
		}
		public void getPersonDetails(int id) {
			EntityManager entityManager = getEntityManager();
			Person person = entityManager.find(Person.class, id);
			
			if(person !=null)
			{
				System.out.println(person);
			}
			else {
				System.out.println("NO Such Id Found");
			}
		}
		public void getAllPersonDetails() {
			EntityManager entityManager = getEntityManager();
			Query query = entityManager.createQuery("Select e from Person e");
			List<Person> list=query.getResultList();
			System.out.println(list);

	}
	}

