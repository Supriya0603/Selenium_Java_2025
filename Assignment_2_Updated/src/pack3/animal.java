package pack3;

public abstract class animal 

{

	protected abstract void sound();
	
	public void dog()
	
	{
		System.out.println("Dog sound like bhoo bhoo");
		sound();
	}
	
	public void cat()
	
	{
		System.out.println("Cat sound like Meow Meow");
		sound();
	}

	
}
