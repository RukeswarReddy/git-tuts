package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateByAddress {

	public static void main(String[] args) {
		
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		Query q = manager.createQuery("update Student s set s.name='anil' where s.address='Kadapa'");
		
		transaction.begin();
		
		q.executeUpdate();
		
		transaction.commit();
		

	}

}
