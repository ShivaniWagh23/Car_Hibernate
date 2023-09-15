package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.employee.Employee;

public class GetById {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Car c=entityManager.find(Car.class, 2);
	System.out.println(c.getId());
	System.out.println(c.getColor());
	System.out.println(c.getBrand());
	System.out.println(c.getName());
	System.out.println(c.getPrice());
}
}
