package com.jsp.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.employee.Employee;

public class GetAll {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	String sql="SELECT c FROM Car c";
	Query query=entityManager.createQuery(sql);
	List<Car> c=query.getResultList();
	for(Car c1 :c) {
		System.out.println("====================");
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getColor());
		System.out.println(c1.getPrice());
		System.out.println(c1.getBrand());
		System.out.println("====================");

	}
}
}
