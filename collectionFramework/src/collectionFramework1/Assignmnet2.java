package collectionFramework1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
public class Assignmnet2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Customer> list = new ArrayList<>();

		list.add(new RegCustomer("Jay", "Lalit@mail", 134424, 111));
		list.add(new RegCustomer("rahul", "rahul@mail", 22314233, 222));
		list.add(new RegCustomer("shubhya", "shubs@mail", 22314233, 333));
		list.add(new Customer("omkya", "omi@mail", 22314233));
		list.add(new Customer("priya", "pillu@mail", 22314l));

		for (Customer c : list) {
			System.out.println(c);
		}
		System.out.println("\n\n");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Dac_Java\\customer.txt"));

		for (Customer c : list) {
			oos.writeObject(c);
		}
		oos.close();

		List<Customer> customer = new ArrayList<>();
		List<RegCustomer> rCustomer = new ArrayList<>();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Dac_Java\\customer.txt"));

		while (true) {
			try {
				Object o = ois.readObject();

				if (o instanceof Customer) {
					customer.add((Customer) o);
				}

				if(o instanceof RegCustomer){
					rCustomer.add((RegCustomer) o);
				}
			} catch (Exception e) {
				break;
			}
		}
		ois.close();

		System.out.println("RegCustomer:----------");
		for (Customer c : customer) {
			System.out.println(c);
		}

		System.out.println("\n\nCustomer:----------");
		for (Customer c : rCustomer) {
			System.out.println(c);
		}

	}
}
