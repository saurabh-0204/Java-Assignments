package utility;

public class  Point
{
	 private int x;
	 private int y;

 public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

	public void display()
	{
		System.out.println("["+x+","+y+"]");
	}

	@Override
	public String toString() {
		return " [x=" + x + ", y=" + y + "]";
	}
	
}
