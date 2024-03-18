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

import entities.Order;
import entities.OrderItem;

public class OrderCRUD {

	public static void main(String[] args) {

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		OrderItem ord1 = new OrderItem(1, 4);
		OrderItem ord2 = new OrderItem(2, 1);
		Set<OrderItem> items = new HashSet();
		items.add(ord1);
		items.add(ord2);
		Order order = new Order("omkya", items);

		// session.save(order);
		OrderItem oi = session.get(OrderItem.class,6);
		System.out.println(oi);
		System.out.println(oi.getPid() + " : " + oi.getQty() + " : " + oi.getOrder().getCname());

		transaction.commit();
		session.clear();
		sessionFactory.close();

	}

}
