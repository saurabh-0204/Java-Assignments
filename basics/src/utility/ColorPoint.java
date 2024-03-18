package utility;

import java.util.Iterator;

public class ColorPoint extends Point {
	private String color;
	static String[] colors;
	static {
		colors = new String[5];
		colors[0] = "red";
		colors[1] = "blue";
		colors[2] = "green";
		colors[3] = "yellow";
		colors[4] = "orange";
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		boolean flag = false;
		for (int i = 0; i < colors.length; i++) {
			if (colors[i].equals(color)) {
				this.color = color;
				flag = true;
				break;
			}
		}
		if (flag == false) {
			this.color = "white";
		}
	}

	public String toString() {
		return "ColorPoint [color=" + color + super.toString() + "]";
	}

}
