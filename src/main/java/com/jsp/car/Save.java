package com.jsp.car;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Car car=new Car();
	car.setBrand("duke");
	car.setName("urfav");
	car.setColor("red");
	car.setPrice(150000000);
	
	entityTransaction.begin();
	entityManager.persist(car);
	entityTransaction.commit();
}
}




