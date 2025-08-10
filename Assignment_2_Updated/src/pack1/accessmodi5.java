package pack1;

public class accessmodi5 extends accessmodi4 {
	
 int myresult;
 public accessmodi5 (int a, int b)
	
	{
	 
	 super(10, 20);
	 int myans = a*b;
	 myresult = myans;
	 
	
	}
	
	
	public static void main(String[] args)

	{
		accessmodi4 c5 = new accessmodi4(10, 20);
		System.out.println("subtraction of two numbers is " + c5.result);
		
		accessmodi5 s5 = new accessmodi5(30, 40);
		System.out.println("multiplication of two numbers is " + s5.myresult);
		
		
	
	}
	

}
