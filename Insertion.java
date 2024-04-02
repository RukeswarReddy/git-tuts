package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insertion {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		//create an object
		
		Student s1 = new Student();
		
		//set values to the object
		
		s1.setId(1);
		s1.setName("ram");
		s1.setAge(23);
		s1.setAddress("Bengaluru");
		
		
		transaction.begin();
		manager.persist(s1);
		transaction.commit();

	}

}
