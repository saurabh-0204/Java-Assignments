import java.util.Scanner; 
class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		for (int i=1;i<n ;i++ )
		{
			System.out.print(a+"  ");
			int c=a+b;//c=1,2
			a=b;
			b=c;
		}

	}
}
