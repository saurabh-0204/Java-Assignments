package mainController;

import utility.Circle;
import utility.Drawable;
import utility.Rectangle;
import utility.Triangle;

public class Shapes_Main {
	public static void main(String[] args) {
		Drawable[] shapeDrawables = { (new Circle(12)), new Triangle(15, 43), new Rectangle(23, 23) };
		for (Drawable d : shapeDrawables) {
			System.out.println("Area of  " + d + "  " + d.calArea());
			d.drawShape();
			System.out.println();
		}

	}

	@Override
	public String toString() {
		return "Shapes_Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
