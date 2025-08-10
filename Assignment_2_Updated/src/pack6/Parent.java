package pack6;

	public class Parent 
	{

	int result;
	String message;

		public Parent (int a, int b)
		
		{
			int ans = b/a;
			result = ans;
			
			
		}
		
	   public Parent (String a)
		
		{
		   message = a;
			
			
		}
		
		
		public static void main(String[] args)

		{

			Parent c5 = new Parent(10, 20);
			System.out.println("Division of two numbers is " + c5.result);
			
	        Parent c6 = new Parent("Hello, this is a string message!");
	        System.out.println("String passed to constructor: " + c6.message);
			
		}
		
		
	}
	


