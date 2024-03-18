package utility;

public class Circle implements Drawable {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void drawShape() {
		System.out.println("Shape is Circle");
	}

	public double calArea() {

		return PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
