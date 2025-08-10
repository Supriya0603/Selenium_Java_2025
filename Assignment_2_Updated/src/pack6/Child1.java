package pack6;

public class Child1 extends Parent
{

int myresult;
String mymessage;
public Child1  (int a, int b)

{
	super (a, b);
	myresult = a*b;
	
}

public Child1(String a) 

{
    super(a); 
    mymessage = a;
}


public static void main(String[] args)

{
	Child1 obj1 = new Child1(10, 20);
    System.out.println("Parent result (division): " + obj1.result);
    System.out.println("Child result (multiplication): " + obj1.myresult);
    
    Child1 obj2 = new Child1("Learning Constructors!");
    System.out.println("Parent message: " + obj2.message);
    System.out.println("Child message : " + obj2.mymessage);
	
}

}
