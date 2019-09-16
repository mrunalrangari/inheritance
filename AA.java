package pack6;

interface AA 
{
	void dispA();
	
}
interface BB extends AA
{
	void dispB();
	
}
class CC implements BB
{ //@override
	public void dispA()
	{
		System.out.println("in display 1");
	}
	//@override
public void dispB()
{
	System.out.println("in display2");
}
}
class Interface
{
	public static void main(String args[])
	{
		CC c = new CC();
		c.dispA();
		c.dispB();
	}
}