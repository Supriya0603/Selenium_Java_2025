package pack5;

public class child3 extends child1 

{

	public child3  (int a, int b)

	{
		super (a, b);
		myresult = a*b;
		
	}

	public child3(String a) 

	{
	    super(a); 
	    mymessage = a;
	}


	public static void main(String[] args)

	{
		child3 obj1 = new child3(10, 20);
	    System.out.println("Parent result for the devision: " + obj1.result);
	    System.out.println("Child result for the multiplication : " + obj1.myresult);
	    
	    child3 obj2 = new child3("Learning Constructors newly");
	    System.out.println("Parent message: " + obj2.message);
	    System.out.println("Child result : " + obj2.mymessage);
		
	}

	
} 
