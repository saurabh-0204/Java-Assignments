// Find Elements in array and write its count

import java.util.*;
class DuplicateArray 
{
	public static void main(String[] args) 
	{
        int[] a={10,20,10,30,40,55,40,55,20,30,60};

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

        for (int i=0;i<a.length ;i++ )
        {
			int count=0;
			for (int j=i;j<a.length ;j++ )
			{
				if (a[i]==a[j])
				{
					count++;
				}
			}
			i+=count-1;
			System.out.println(a[i] +" "+count);
        }

	}
}
