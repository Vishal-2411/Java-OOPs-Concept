package OOPS;


class Parent66
{
	void show()
	{
		System.out.println("Defined inside parent class");
	}
}
class Child1 extends Parent66
{
	void display()
	{
		System.out.println("Defined inside child1 class");
	}
}
class Child2 extends Parent66
{
	void set()
	{
		System.out.println("Defined inside child2 class");
	}
}
class Child3 extends Parent66
{
	void get()
	{
		System.out.println("Defined inside child3 class");
	}
}
public class HierarchicalInheritanceExample 
{
	public static void main(String[] args) 
	{
		Child1 c1 = new Child1();
		c1.show();
		c1.display();
		
		Child2 c2 = new Child2();
		c2.show();
		c2.set();
		
		Child3 c3 = new Child3();
		c3.show();
		c3.get();
	}




 



	}


