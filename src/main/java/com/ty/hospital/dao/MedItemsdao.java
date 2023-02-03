//package com.ty.hospital.dao;
//import java.util.ArrayList;
//import java.util.List;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//import com.ty.hospital.dto.Address;
//import com.ty.hospital.dto.Branch;
//import com.ty.hospital.dto.MedItems;
//import com.ty.hospital.dto.MedOrder;
//
//	public class MedItemsdao {
//		public EntityManager getEntityManager() {
//			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("radha");
//			return entityManagerFactory.createEntityManager();
//		}
//		
//		public void saveMedItems(List<MedItems>items,int id)  {
//			EntityManager entityManager=getEntityManager();
//			EntityTransaction entityTransaction=entityManager.getTransaction();
//			MedOrder medOrder=entityManager.find(MedOrder.class, id);
//			medOrder.setMeditems(items);
//			entityTransaction.begin();
//			entityManager.persist(items);
//			entityManager.merge(medOrder);
//			entityTransaction.commit();
//		}
////			EntityManager entityManager= getEntityManager();
////			EntityTransaction entityTransaction=entityManager.getTransaction();
////			MedOrder order1=entityManager.find(MedOrder.class, id);
////			if(order1!=null){
////				order1.setMeditems(items);
////				entityTransaction.begin();
////				for (MedItems medItems : items) {
////					entityManager.merge(medItems);
////				}
////					entityTransaction.commit();
////			}
////			
////			
////		}
//		
//		public void updateMedItems(int id,MedItems meditems){
//			EntityManager entityManager= getEntityManager();
//			EntityTransaction entityTransaction=entityManager.getTransaction();
//			entityTransaction.begin();
//			MedItems meditems1=entityManager.find(MedItems.class, id);
//			if(meditems1!=null) {
//				entityTransaction.begin();
//				meditems1.setMeditems_id(meditems.getMeditems_id());
//				meditems1.setMeditems_name(meditems.getMeditems_name());
//			entityManager.merge(meditems);
//			entityTransaction.commit();
//			}
//			else
//				System.out.println("No such data is present");
//		
//			
//		}
//		public void deleteMedItems(int id) {
//			EntityManager entityManager= getEntityManager();
//			EntityTransaction entityTransaction=entityManager.getTransaction();
//			MedItems meditems1=entityManager.find(MedItems.class, id);
//			
//			if(meditems1!=null)
//			{
//				entityTransaction.begin();
//				
//				entityManager.remove(meditems1);
//				entityTransaction.commit();
//				System.out.println("Deleted");
//			}
//			else
//				System.out.println("No such data is present");
//		}
//		public void detailsByIdMedItems(int id)
//		{
//			EntityManager entityManager= getEntityManager();
//			
//			MedItems meditems1=entityManager.find(MedItems.class, id);
//			 System.out.println(meditems1);
//		}
//		
//		public void detailsALLMedItems() {
//			EntityManager entityManager= getEntityManager();
//			Query query= entityManager.createQuery("select a from MedItems a");
//			List<MedItems> list=query.getResultList();
//			System.out.println(list);	
//		}
//	}
//
