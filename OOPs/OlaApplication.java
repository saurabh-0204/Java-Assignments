import java.util.Scanner;
class OlaApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		OlaDriver od=new OlaDriver();
		for (; ; )
		{
			System.out.println("1.Mini 2.Prime 3.Sweden 4.Exit");
			switch(sc.nextInt())
			{
				case 1:
				{
					System.out.println("Enter the name");
					String name=sc.next();
					System.out.println("Enter the age");
					int age =sc.nextInt();
					System.out.println("Enter The km");
					int km=sc.nextInt();
					Mini m=new Mini(name,age,km);
					od.choose(m);
				}
				break;
				case 2:
				{
					System.out.println("Enter the name");
					String name=sc.next();
					System.out.println("Enter the age");
					int age =sc.nextInt();
					System.out.println("Enter The km");
					int km=sc.nextInt();
					Prime p=new Prime(name,age,km);
					od.choose(p);
				}
				break;
				case 3:
				{
					System.out.println("Enter the name");
					String name=sc.next();
					System.out.println("Enter the age");
					int age =sc.nextInt();
					System.out.println("Enter The km");
					int km=sc.nextInt();
					Sweden s=new Sweden(name,age,km);
					od.choose(s);
					
				}
				break;
				case 4:
					System.exit(0);
			}
		}
	}
}
