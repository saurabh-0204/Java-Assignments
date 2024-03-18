import java.util.*;
// Sorting of array without sort method
class SortingArray 
{
	public static void main(String[] args) 
	{
	 int[] a={10,20,10,30,40,55,40,55,20,30,60};
          int temp=0;
		  for (int i=0;i<a.length ;i++ )
		  {
			  for (int j=i+1;j<a.length ;j++ )
			  {
				  if (a[i]>a[j])
				  {
					  temp =a[i];
					  a[i]=a[j];
					  a[j]=temp;
				  }
			  }
		  }
		   System.out.println(Arrays.toString(a));
	}
}
