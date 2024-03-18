import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Number");
		int n=sc.nextInt();
		//int c=0;
		prime(n);


	
	}
	public static int prime(int n)
	{

		for (int i=2;i<n ;i++ )
		{
				if (n%i==0)
		       {
					System.out.println(" Not Prime ");
					return 0;
		         }
					
		}
		System.out.println("prime");
		return 0;
		
	}

}
