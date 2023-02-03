//package com.ty.hospital.dao;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.*;
//
//import com.ty.hospital.dto.Encounter;
//import com.ty.hospital.dto.MedOrder;
//
//public class MedOrderdao {
//	public EntityManager getEntityManager() {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("radha");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		return entityManager;
//	}
//
//	public void saveMedOrder(List<MedOrder> medOrder, int id) {
//		EntityManager entityManager = getEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		Encounter encounter = entityManager.find(Encounter.class, id);
//		
//		for (MedOrder medOrder2 : medOrder) {
//			if (encounter != null) {
//				entityTransaction.begin();
//				encounter.setOrders(medOrder);
//				// entityManager.merge(encounter);
//				entityManager.merge(medOrder2);
//				entityTransaction.commit();
//			}
//		}
//	}

	// public void updateMedOrder(int medorder_id, MedOrder medOrder) {
	// EntityManager entityManager = getEntityManager();
	// EntityTransaction entityTransaction = entityManager.getTransaction();
	// MedOrder medOrder1 = entityManager.find(MedOrder.class, medorder_id);
	// if (medOrder1 != null) {
	// entityTransaction.begin();
	// medOrder.setMedorder_id(medorder_id);
	// medOrder.setMedorder_name(medOrder.getMedorder_name());
	//
	// entityManager.merge(medOrder);
	// entityTransaction.commit();
	// } else
	// System.out.println("No such data is present");
	//
	// }

//	public void deleteMedOrder(int medorder_id) {
//		EntityManager entityManager = getEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
//		MedOrder medOrder1 = entityManager.find(MedOrder.class, medorder_id);
//
//		if (medOrder1 != null) {
//			entityTransaction.begin();
//
//			entityManager.remove(medOrder1);
//			entityTransaction.commit();
//			System.out.println("Deleted Med order");
//		} else
//			System.out.println("No such data is present");
//	}
//
//	public void getMedOrderById(int medorder_id) {
//		EntityManager entityManager = getEntityManager();
//
//		MedOrder medOrder = entityManager.find(MedOrder.class, medorder_id);
//		System.out.println(medOrder);
//	}
//
//	public void getAllMedOrder() {
//		EntityManager entityManager = getEntityManager();
//		Query query = entityManager.createQuery("select m from MedOrder m");
//		List<MedOrder> list = query.getResultList();
//		System.out.println(list);
//	}
//
//}
