package pack2;

public class primeth2 extends primeth

{

	int a = 20;
	int b = 10;
	int result;

	private void m1()

	{

		int ans = b * a;
		result = ans;

	}

	public static void main(String[] args)

	{

		primeth2 c5 = new primeth2();
		c5.m1();
		System.out.println("multiplication of two numbers is " + c5.result);

	}

}
