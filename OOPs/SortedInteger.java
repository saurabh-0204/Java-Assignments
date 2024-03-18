import  java.util.Scanner;
class SortedInteger 
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[] = {0,1,5,8,14,18,44,81,89,99,102};
		int n = arr.length;
		System.out.println(arr[]);
        System.out.println("Enter First Number ");  
		int num1 =sc.nextInt();
        System.out.println("Enter Last Number ");
		 int num2 = sc.nextInt();

		System.out.println("The count of Numbers Between first and Last number is:"+ getCount(arr, n, num1, num2));

	}

	static int getCount(int arr[], int n,int num1, int num2)
	{
		int i = 0;
		for (i = 0; i < n; i++)
			if (arr[i] == num1)
				break;
	
		
		if (i >= n - 1)
			return 0;
	
		
		int j;
		for (j = n - 1; j >= i + 1; j--)
			if (arr[j] == num2)
				break;
	
		if (j == i)
			return 0;
	
	
		return (j - i - 1);
	}
 
  
}
