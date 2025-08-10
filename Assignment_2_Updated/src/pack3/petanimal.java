package pack3;

public class petanimal extends animal

{
	
	protected void sound()
		
	{
			
		System.out.println("This is a general animal sound from petanimal.");
		
	}
	
	
	public static void main(String[] args)
	
	{
		animal d1 = new petanimal();
		d1.dog();
		d1.cat();
	}
	
	
	
}
