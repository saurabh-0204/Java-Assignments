import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter Number to check");
		int a=sc.nextInt();
		int c=0;
		for (int i=1;i<=a;i++)
		{
			if (a%i==0)
			{
				c++;
			}
		}
		if (c==2)
		{
			System.out.println(" The  Number is Prime ");
		}
		else
            System.out.println(" The  Number  not is Prime ");
		
	}
}
