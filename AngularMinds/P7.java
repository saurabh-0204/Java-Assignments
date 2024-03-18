class P7
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=6 ; i++)
		{
			int a=i;
			for (int j=1;j<=6 ;j++ )
			{
				
				if (i==1||j==1||i==6||j==6)
				{
					System.out.print("* ");
				}
				else 
				{
					a++;
					System.out.print(a+" ");
					
				}
			}
			System.out.println();
			
		}
	}
}
