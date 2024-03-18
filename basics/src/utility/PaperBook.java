package utility;

public class PaperBook extends Book {
	public float calculateCost() {
		if (super.price <= 500) {
			float discount = super.price * 107 / 100;
			return discount;

		} else if (500 < super.price && super.price <= 1000) {
			float discount = super.price * 105 / 100;
			return discount;
		} else if (1000 < super.price && super.price <= 5000) {
			float discount = super.price * 102 / 100;
			return discount;
		}
		return 0.0f;
	}

	public PaperBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaperBook(int id, float price, String title) {
		super(id, price, title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
