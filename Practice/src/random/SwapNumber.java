package random;

//Swap two numbers without third variables
public class SwapNumber {
	public static void main(String[] args) {

	int a=100;
	int b=50;
	System.out.println("Before swapping  a="+a+" b= "+ b);

//	b=b-a;
//	a=b+a;
//	b=a-b;
	
//	a=a^b;
//	b=a^b;
//	a=a^b;
	
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("After swapping a="+a+"  b= "+ b);
	}
}
