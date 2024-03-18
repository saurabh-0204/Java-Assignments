class OlaDriver 
{
	Ola o;
	public void choose(Ola o)//mini,prime,sweden
	{
		this.o=o;
		
		if (o instanceof Mini)
		{
			Mini m1=(Mini)o; //Down Casting

			m1.bill();
		}
		else if (o instanceof Prime)//instanceof keyworduse to check what type of object is enterd
		{
           Prime p1=(Prime)o;
		   p1.bill();
		}
		else
		{
			Sweden s1=(Sweden)o;
			s1.bill();
		}
	}
}
