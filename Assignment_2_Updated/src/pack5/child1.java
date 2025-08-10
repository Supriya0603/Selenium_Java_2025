package pack5;

public class child1 extends parent
{

int myresult;
String mymessage;
public child1  (int a, int b)

{
	super (a, b);
	myresult = a*b;
	
}

public child1(String a) 

{
    super(a); 
    mymessage = a;
}


public static void main(String[] args)

{
	child1 obj1 = new child1(10, 20);
    System.out.println("Parent result (division): " + obj1.result);
    System.out.println("Child result (multiplication): " + obj1.myresult);
    
    child1 obj2 = new child1("Learning Constructors!");
    System.out.println("Parent message: " + obj2.message);
    System.out.println("Child message : " + obj2.mymessage);
	
}

}