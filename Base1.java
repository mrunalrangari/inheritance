/*Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.
*/





package pack6;

public class Base1 
{
	int num= 100;
	void show()
	{
		System.out.println(num);
	}
  Base1(int k)
 {
	 System.out.println("parametarised");
 }
}
class Sub extends Base1
{
	int num = 200;
	void show1()
	{
		System.out.println(num);
	}
	Sub()
	{
		super(100);
		System.out.println("default");
	}
	Sub(int k)
	{
		super(100);
		System.out.println("in one arg");
	}
	Sub(int k, int i)
	{
		super(100);
		System.out.println("in two parameter");
	}
}
class Constructor1
{
	public static void main(String args[])
	{
		Sub s = new Sub();
		s.show1();
		s.show();
	}
}
