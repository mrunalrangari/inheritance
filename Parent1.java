
/*Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.


*/



package pack6;

public class Parent1
{
	int num = 100;
	void disp()
	{
		System.out.println(num);
	}

}
interface Parent2
{
	void show();

}
class childA extends Parent1 implements Parent2
{
	//@override
	public void show()
	{
		System.out.println("in parent1");
	}
	
}
 class Inheritance1
{
	public static void main(String args[])
	{
		childA ca = new childA();
		ca.disp();
		ca.show();
	}
}