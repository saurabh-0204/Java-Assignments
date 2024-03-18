package association;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Category;
import entities.Product;

public class CategoryApp {

	public static void main(String[] args) {

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		/*
		 * Category category=new Category("Bikes", "Racing Bikes");
		 * session.save(category);
		 */
		Product p1 = new Product("iPhone", 60000);
		Product p2 = new Product("Macbook", 80000);
		Set<Product> items = new HashSet();
		items.add(p1);
		items.add(p2);

		Category category=new Category("Electricals","TimePass Products",items);
		session.save(category);
		transaction.commit();

		session.clear();
		sessionFactory.close();
	}

}
