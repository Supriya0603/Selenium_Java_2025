package pack5;

public class parent 
{

int result;
String message;

	public parent (int a, int b)
	
	{
		int ans = b/a;
		result = ans;
		
		
	}
	
   public parent (String a)
	
	{
	   message = a;
		
		
	}
	
	
	public static void main(String[] args)

	{

		parent c5 = new parent(10, 20);
		System.out.println("Division of two numbers is " + c5.result);
		
		parent c6 = new parent("Hello, this is a string message!");
        System.out.println("String passed to constructor: " + c6.message);
		
	}
	
	
}