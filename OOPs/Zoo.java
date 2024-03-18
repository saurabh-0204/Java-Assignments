class Zoo 
{
	public static void main(String[] args) 
	{
		Animal a=new Animal();// Type Matching
		a.sound();
		System.out.println("___________________________");
		Animal a1=new Dog();//up Casting


       Dog d1=(Dog)a1; //Down Casting
		d1.sound();
	}
}
