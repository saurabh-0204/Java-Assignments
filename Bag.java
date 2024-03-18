import java.util.Scanner;
class Bag 
{
	Books b;
	String color;
	double price;
	Scanner sc=new Scanner(System.in);
	Bag(String c1,double d1)
	{
		color=c1;
		price=d1;
	}
	public void addBook()
	{
		
		if(b==null)
		{
		  System.out.println("enter a book name");
		String bookName=sc.next();
		System.out.println("enter a book pages");
		int pages=sc.nextInt();
		System.out.println("enter a authorname");
		String authorName=sc.next();

		b=new Books(bookName,pages,authorName);
		System.out.println("book is added");
		}
		else
		{
			System.out.println("already book is added please remove and do that process again please....... :)");
		}
	}
	public void removeBook()
	{
		
		if(b==null)
		{
			System.out.println("first add book");
		}
		else
		{
			b=null;
		System.out.println("book is removed");
		}
	}
	public void printAttributesOfBag()
	{
		System.out.println(color);
		System.out.println(price);
	}
	public void printAttributesOfBook()
	{
		System.out.println(b.name);
		System.out.println(b.pages);
	}




}