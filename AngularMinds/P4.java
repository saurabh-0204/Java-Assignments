class P4 
{
	public static void main(String[] args) 
	{
	
	    for (int i=1;i<=6 ;i++ )
	    {
			int a=1;
			for (int j=1;j<=6; j++)
			{
				if (i==1||j==1||i==6||j==6)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(a+" ");
					a++;
				}	
			}
			System.out.println();

	    }
	}
}
