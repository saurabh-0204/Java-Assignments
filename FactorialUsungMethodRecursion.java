class FactorialUsungMethodRecursion 
{
	public static void main(String[] args) 
	{
		int a=factorial(7);
		
		System.out.println(a);
	}
	public static int factorial(int n){
        int factorial=1;
		if (n==1)
		{
			return 1;
		}
		return n*factorial(--n);
	}
	
}