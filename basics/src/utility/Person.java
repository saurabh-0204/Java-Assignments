package utility;

public class Person {
	private String name;
	private Date bdate;

	public Person() {
		
		bdate = new Date();
	}

	public String toString() {
		return "\nName : "+name+"\nBirthDate : "+bdate;
	}

	public Person(String name, int dd, int mm, int yy) {
		this.bdate = new Date(dd, mm, yy);
		this.name = name;

	}

	public Person(String name, Date date) {
		super();
		this.name = name;
		this.bdate = date;
	}

	public void display() {
		System.out.println("Name : " + name);
		bdate.display();
	}
	
}
