package lambdaExpression;

//Printing Prime nos from 1 to 100 using Lamda Expression

public class Prime {

	public static void main(String[] args) {
//		Runnable r=new Runnable(){
//			@Override
//			public void run() {
//				System.out.println("Prime nos in between 1 to 100: ");
//				for(int i=2;i<=100;i++) {
//					Boolean flag=true;
//					for(int j=2; j<i;j++) {
//						if(i%j==0) {
//							flag=false;
//							break;
//						}
//					}
//					if(flag==true) {
//						System.out.print(i+" ");
//					}
//				}
//			}
//		};
//		
//		Thread t=new Thread(r);
//		t.start();

		Thread t1 = new Thread(() -> {
			System.out.println("Prime nos in between 1 to 100: ");
			for (int i = 2; i <= 100; i++) {
				Boolean flag = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					System.out.print(i + " ");
				}
			}
		});

		t1.start();
	}

}