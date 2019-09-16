/*create a class "Vehicle", define a method "public void start()" in it. 
 From this class derive a class FourWheeler.
  How will u override "start()" method of parent class ?
 */






package pack6;

public class Vehicle 
{
	public void start()
	{
		System.out.println("Vehicle");
	}

}
class Fourwheeler extends Vehicle
{
	//@overrriden
	public void start()
	{
		System.out.println("in Fourwheeler");
	}
}
class Demo1
{
	public static void main (String args[])
	{
		Fourwheeler f = new Fourwheeler();
		f.start();
		Vehicle v = new Vehicle();
		v.start();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
