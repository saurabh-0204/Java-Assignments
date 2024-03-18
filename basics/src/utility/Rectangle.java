package utility;

public class Rectangle implements Drawable {
	private int length;
	private int height;

	public Rectangle(int length, int height) {
		super();
		this.length = length;
		this.height = height;
	}

	public void drawShape() {
		System.out.println("Shape is Ractangle ");
	}

	public double calArea() {
		return 2 * length * height;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", height=" + height + "]";
	}

}
