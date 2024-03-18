package hqlQuery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import entity.Emp;

public class HQLQuery {

	public static void main(String[] args) {
		StandardServiceRegistry ssRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(ssRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		// for displaying all data
		/*
		 * Query<Emp> query = session.createQuery("from Emp"); List<Emp> emps =
		 * query.getResultList(); for (Emp emp : emps) {
		 * System.out.println(emp.getEmpno() + " " + emp.getEname() + "  " +
		 * emp.getJob() + "  " + emp.getMgr() + "  " + emp.getHiredate() + "   " +
		 * emp.getSalary() + "  " + emp.getComm() + "  " + emp.getDeptno()); }
		 */

		// For getting Maximum salary from table
		Query<Emp> query = session.createQuery("FROM Emp where salary=(select max(salary) from Emp)");
		List<Emp> e = query.getResultList();

		if (e != null) {
			for (Emp maxsal : e) {
				System.out.println(maxsal.getEmpno() + " " + maxsal.getEname() + "  " + maxsal.getJob() + "  "
						+ maxsal.getMgr() + "  " + maxsal.getHiredate() + "   " + maxsal.getSalary() + "  "
						+ maxsal.getComm() + "  " + maxsal.getDeptno());
			}
		} else {
			System.out.println("No employee found.");
		}

		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
