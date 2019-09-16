/* Create a multi-level inheritance , instantiate the child class and observe constructor 
 invocation.Also show, if needed how will u invoke parent class constructor from child class ?
 */
package pack6;


public class Parent 
{
	int num = 10;
	void disp()
	{
		System.out.println(num);
	}
	Parent()
	{
		System.out.println("in parent class");
	}
}
class Child extends Parent
{
	int num1 = 20;
	void disp1()
	{
		System.out.println(num1);
	}
	Child()
	{
		System.out.println("in child");
	}
}
class Child1 extends Parent
{
	int num2 = 30;
	void disp2()
	{
		System.out.println(num2);
	}
	Child1()
	{
		System.out.println("in child1");
	}
}
class demo
{
	public static void main(String args[])
	{
		Child c = new Child();
	
		c.disp();
		c.disp1();
		Child1 c1 = new Child1();
		c1.disp();
		c1.disp2();
		System.out.println("in demo");
				
	}
}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	
	
	
	
	
	
	
	
	
	
	
	

