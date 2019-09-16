/*create abstract class Shape. declare "draw()" function as abstract. 
 
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function.*/





package pack6;

abstract class Shape
{
	abstract void Draw();

}
class Triangle extends Shape
{
	void Draw()
	{
		System.out.println("Draw triangle");
	}
}
class Polygon extends Shape
{
	void Draw()
	{
		System.out.println("draw Polygon");
	}
}
class Circle extends Shape
{
	void Draw()
	{
		System.out.println("Draw Circle");
	}
}
class Abstract
{
	public static void main(String args[])
	{
		Shape arr[] = new Shape[3];
		arr[0] = new Triangle();
		arr[1] = new Polygon();
		arr[2]= new Circle();
		for(int i = 0; i<arr.length;i++)
		{
			arr[i].Draw();
		}
	}
}