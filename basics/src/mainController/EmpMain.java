package mainController;

import utility.Person;
import utility.Programmer;
import utility.SalesManager;
import utility.Admin;
import utility.Date;
import utility.Emp;

public class EmpMain {
	public static void main(String[] args) {
//		Person p = new Emp();
//		p.display();
//
//		Person e = new Emp("Saurabh", 2, 4, 2000, 1, 90000);
//		e.display();
//		Date d1 = new Date(1, 1, 1);
//
//		Person p2 = new Emp("hdk", d1, 1, 4000);
//		p2.display();
//
//		Object p3 = new Emp();
//		System.out.println(p3.toString());

		Emp[] allEmps = new Emp[3];
		allEmps[0] = new SalesManager("shubham", 11, 11, 1998, 1001, 10000, 100000, 4.5);
		//allEmps[1] = new Programmer("Lalit", 2, 22, 222, 2222, 2222, 22222, 22);
		allEmps[2] = new Admin("priya", 3, 4, 1999, 1005, 9000, 987);
		
		for( Emp e : allEmps) {
			//System.out.println(e.salary);
			System.out.println(e);
			System.out.println("______________");
		}
		for (int i = 0; i < allEmps.length; i++) {
			System.out.println("Employee id : "+allEmps[i]+" With Salary : "+allEmps[i].calSalary(0));

		}
		
	}
}