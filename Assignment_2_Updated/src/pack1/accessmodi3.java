package pack1;

public class accessmodi3 extends accessmodi {
	

	public accessmodi3 (int a, int b)
	
	{
		
		int ans = b - a;
		System.out.println("subtraction Of Two Numbers is " +ans);
	}
	
	
	public static void main(String[] args)

	{
		accessmodi3 c2 = new accessmodi3(10, 20);
		
		accessmodi c3 = new accessmodi();
		c3.method1();
	}
	

}
