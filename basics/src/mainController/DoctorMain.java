package mainController;

import utility.Doctor;
import utility.Person;

public class DoctorMain {
	public static void main(String[] args) {
		Doctor d = new Doctor();
		d.display();
		System.out.println("*****************");
		Doctor d2 = new Doctor("priya", 2, 2, 2003, "mbbs", 23, 33913);
		d2.display();
		System.out.println("*****************");
		Doctor o = new Doctor();
		System.out.println(o.toString());
		System.out.println("*****************");
         System.out.println(o);
	}

}
