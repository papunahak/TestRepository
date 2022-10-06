package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Controller.StudentDetails;

public class Studentdao {
 public boolean saveStudent(StudentDetails s) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("papu");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	et.begin();
	em.persist(s);
	et.commit();
	return true;
	 
 }
}
