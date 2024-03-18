import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter number");
		int a=sc.nextInt();
		int reverse=0;
		int temp=a;
		while (temp>0)
		{
			int rem=temp%10;
			reverse=reverse*10 +rem;
			temp/=10;

		}
		if (a==reverse)
		{
			System.out.println("Number is Palindrome..!");
		}
		else
			System.out.println("Number is not Palindrome..!");
	}
}
