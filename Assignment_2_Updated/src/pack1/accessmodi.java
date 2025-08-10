package pack1;

public class accessmodi {

	int a = 10;
	int b = 20;

	public void method1()

	{
		
		int ans = a + b;
		System.out.println("Sum Of Two Numbers is " + ans);

	}

	public static void main(String[] args)

	{

		accessmodi c1 = new accessmodi();
		c1.method1();
	}

}