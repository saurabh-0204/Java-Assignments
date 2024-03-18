import java.util.Scanner;
class BagDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a color");
		String color=sc.next();
		System.out.println("enter a price");
		double price=sc.nextDouble();
		Bag b=new Bag(color,price);
		for(;;)
		{
			System.out.println("1.add book 2.remove book 3.print bag attributes 4.print book attributes 5.close");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:b.addBook();
				break;
				case 2:
					b.removeBook();
				break;
				case 3:b.printAttributesOfBag();
				break;
				case 4:
					b.printAttributesOfBook();
				break;
				case 5:
					System.out.println("________________application closed_________________");
					System.exit(0);
			}
		}
	}
}