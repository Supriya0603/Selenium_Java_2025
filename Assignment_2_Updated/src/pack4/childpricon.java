package pack4;

public class childpricon extends pricon

{
	int myresult;

	public childpricon(int a, int b)

	{

		super(10, 20);
		int myans = a * b;
		myresult = myans;

	}

	public static void main(String[] args)

	{
		pricon c5 = new pricon(10, 20);
		System.out.println("subtraction of two numbers is " + c5.result);

		childpricon s5 = new childpricon(30, 40);
		System.out.println("multiplication of two numbers is " + s5.myresult);

	}

}
