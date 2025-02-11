package OOPS;
class Shapes
{
	void area()
	{
		System.out.println("Find area:");
	}
}
class Rectangle extends Shapes
{
	void area()
	{
		int l=3;
		int b =5;
		int ar = l*b;
		System.out.println("Area of rectangle is"+ar);
	}
}
class Circle extends Shapes
{
	void area()
	{
		float r=4;
                float ar = 3.14f*r*r;
		System.out.println("Area of circle is"+ar);
	}
}
public class MethodOverridingExample
{
	

	public static void main(String[] args)
	{ 
		Circle c = new Circle();
		c.area();
		
		Rectangle r = new Rectangle();
		r.area();
	}
		// TODO Auto-generated method stub

	}


