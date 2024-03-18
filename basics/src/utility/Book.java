package utility;

public class Book {
	private int b_id;
	private String title;;
	protected float price;

	public Book() {
	}

	public Book(int id, float price, String title) {
		this.b_id = id;
		this.title = title;
		this.price = price;
	}

	public void display() {
		System.out.println("Book id  : " + b_id);
		System.out.println("Book Name  : " + title);
		System.out.println("Price of Book  : " + price);
	}

	public float calculateCost() {
		return this.price;

	}

	@Override
	public String toString() {
		return "Book [b_id=" + b_id + ", title=" + title + ", price=" + price + "]";
	}

}
