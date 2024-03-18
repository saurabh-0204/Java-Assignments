package collectionFramework1;

import java.io.Serializable;

public class Customer implements Serializable{
	protected String name;
	protected String email;
	protected long contact;

	public Customer(String name, String email, long l) {
		super();
		this.name = name;
		this.email = email;
		this.contact = l;
	}

	public Customer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", contact=" + contact + "]";
	}

}
