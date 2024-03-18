package collectionFramework2;

import java.util.Set;
import java.util.TreeSet;

public class Assignment2 {
public static void main(String[] args) {
	Set<Employee> emp=new TreeSet<>();

	emp.add(new Employee("Dorami",1,34000,"CAR "));
	emp.add(new Employee("Dorami",1,43000,"CAR "));
	emp.add(new Employee("Dorami",2,34000,"CAR "));
	emp.add(new Employee("Dorami",1,34000,"CAR "));
	emp.add(new Employee("Dorami",4,34000,"CAR "));
	emp.add(new Employee("Dorami",5,34000,"CAR "));
	emp.add(new Employee("Dorami",6,34000,"CAR "));
	emp.add(new Employee("Dorami",7,34000,"CAR "));
	for(Employee d :emp)
	System.out.println(d);

	
}
}
