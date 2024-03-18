package apss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Emp;

public class DI {
	public static void main(String[] args) {
		ApplicationContext cApplicationContext = new ClassPathXmlApplicationContext("appContext.xml");
		Emp e = (Emp) cApplicationContext.getBean("emp");
		System.out.println(e);
	}
}