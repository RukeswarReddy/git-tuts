package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Deletion {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		Student s = manager.find(Student.class, 1);
		
		if(s!=null)
		{
			transaction.begin();
			manager.remove(s);
			transaction.commit();
		}
		else
		{
			System.out.println(" id not fount ");
		}

	}

}
