package collectionFramework2;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private String city;
	private float percentage;
	public Student(int id, String name, String city, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public int hashCode() {
	    return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name)
				&& Float.floatToIntBits(percentage) == Float.floatToIntBits(other.percentage)
				&& Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
	}
	
	

}
