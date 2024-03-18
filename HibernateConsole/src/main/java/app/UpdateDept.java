package app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entity.Department;

public class UpdateDept {

	public static void main(String[] args) {
		StandardServiceRegistry ssRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(ssRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Department department = session.get(Department.class, 60);
		if (department != null) {
			department.setLocation("Bombay");
			session.update(department);
		} else {
			System.out.println("Department not found");
		}
		transaction.commit();
	}

}