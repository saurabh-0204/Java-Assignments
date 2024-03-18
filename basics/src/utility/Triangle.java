package utility;

public class Triangle implements Drawable {

	private int length;
	private int height;

	public Triangle(int length, int height) {
		super();
		this.length = length;
		this.height = height;
	}

	public void drawShape() {
		System.out.println("Shape is Ractangle ");
	}

	public double calArea() {
		return 0.5 * length * height;
	}

	@Override
	public String toString() {
		return "Triangle [length=" + length + ", height=" + height + "]";
	}
 
}
