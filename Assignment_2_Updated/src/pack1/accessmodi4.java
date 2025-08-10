package pack1;

public class accessmodi4 {

	protected int result;

	protected accessmodi4(int a, int b)

	{

		int ans = b - a;
		result = ans;

	}

	public static void main(String[] args)

	{

		accessmodi4 c5 = new accessmodi4(10, 20);
		System.out.println("subtraction of two numbers is " + c5.result);

	}

}
