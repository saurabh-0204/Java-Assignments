package app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entity.Department;

public class SaveDept {

	public static void main(String[] args) {
		StandardServiceRegistry ssRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(ssRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();

		Department department = new Department(50, "Developer", "Pune");

		Transaction transaction = session.beginTransaction();
		session.persist(department);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
