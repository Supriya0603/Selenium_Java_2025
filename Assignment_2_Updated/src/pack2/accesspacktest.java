package pack2;

import pack1.accessmodi4;

public class accesspacktest extends accessmodi4

{

	int test;

	public accesspacktest(int c, int d)

	{

		super(10, 20);
		int result = d / c;
		test = result;

	}

	public static void main(String[] args)

	{
		
		accesspacktest s5 = new accesspacktest(10, 20);
		System.out.println("devision of two numbers is " + s5.test);
		
		System.out.println("subtraction of two numbers is " + s5.result);
		

	}

}
