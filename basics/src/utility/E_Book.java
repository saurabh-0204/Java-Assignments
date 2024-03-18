package utility;

public class E_Book extends Book {

	public E_Book(int id, float price, String title) {
		super(id, price, title);
		// TODO Auto-generated constructor stub
	}

	public float calculateCost() {
		if (super.price <= 500) {
			float discount = super.price * 98 / 100;
			return discount;

		} else if (500 < super.price && super.price <= 1000) {
			float discount = super.price * 95 / 100;
			return discount;
		} else if (1000 < super.price && super.price <= 5000) {
			float discount = super.price * 93 / 100;
			return discount;
		}
		return 0.0f;
	}

	@Override
	public String toString() {
		return super.toString() ;
	}
	
}
