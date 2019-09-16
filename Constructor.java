/*Go for Hierarchical inheritance, create instances of child class 
 and observe constructor invocation.
 */







package pack6;

public class Constructor 
{
	int num = 10;
	void disp()
	{
		System.out.println(num);
	}
	
	Constructor()
	{
		System.out.println("in parent Constructor ");
	}
}
class Childs extends  Constructor
{
	int num1 = 12;
	void disp1()
	{
		System.out.println(num1);
	}
	
	Childs()
	{
		System.out.println("in Child Constructer");
	}
}
class Child3 extends Constructor
{
	int num2 = 23;
	void disp2()
	{
		System.out.println(num2);
	}
	Child3()
	{
		System.out.println("in child1 Constructer");
	}
}
class Demo2
{
	public static void main(String args[])
	{
		Childs c = new Childs();
		c.disp();
		c.disp1();
		Child3 c3 = new Child3();
		c3.disp();
		c3.disp2();
		System.out.println("in demo");
				
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

