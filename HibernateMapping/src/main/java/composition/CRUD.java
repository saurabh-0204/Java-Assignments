package composition;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Address;
import entities.Student;

public class CRUD {
	public static void main(String[] args) {
		StandardServiceRegistry ssRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(ssRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Address address = new Address("Delhi", "Showt", 40002);
		Student student = new Student("aisha", address);

		session.save(student);
		

		System.out.println("student saved");
		transaction.commit();
		session.close();

		sessionFactory.close();
	}
}
