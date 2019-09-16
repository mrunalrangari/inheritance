/*Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
Now show how will u achieve dynamic polymorphism.*/

package pack6;

public class Top1 
 {
	void display()
	{
		System.out.println("in Top1");
	}

}
class Bottom1 extends Top1
{
	void display()
	{
		System.out.println("in bottom1");
	}
}
class Bottom2 extends Top1
{
	void display()
	{
		System.out.println("in bottom2");
	}
}
class Top
{
	public static void main(String args[])
	{
		Bottom1 b = new Bottom1();
		b.display();
		
	}
}