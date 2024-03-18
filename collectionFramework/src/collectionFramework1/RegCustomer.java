package collectionFramework1;

public class RegCustomer extends Customer {
	private int regno;

	@Override
	public String toString() {
		return "RegCustomer [regno= "+ regno + " name=" + name + ", email=" + email + ", contact=" + contact+"]";
	}

	public RegCustomer() {
		super();
	}

	public RegCustomer(String name, String email, int contact, int regno) {
		super(name, email, contact);
		this.regno = regno;

	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}
	
}
