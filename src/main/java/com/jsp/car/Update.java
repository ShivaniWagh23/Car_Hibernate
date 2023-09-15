package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Car car=entityManager.find(Car.class, 3);
	
	if(car!=null) {
		entityTransaction.begin();
		car.setBrand("Enova");
		entityManager.merge(car);
		entityTransaction.commit();
	}
}
}
