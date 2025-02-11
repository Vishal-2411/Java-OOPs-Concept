package OOPS;
class A
{
	void show()
	{
System.out.println("Defined inside class A");
	}
}
class B extends A
{
void display()
{
System.out.println("Defined inside class B");
}
}
class C extends B
{
	void get()
	{
		System.out.println("Defined inside class C");
	}
}
class D extends C
{
	void set()
	{
		System.out.println("Defined inside class C");
	}
}
public class HierarchicalnheritanceExample
{
	

	public static void main(String[] args) 
	{
		D d = new D();
		d.set();
		d.get();
		d.display();
		d.show();
		
		C c = new C();
		c.get();
		c.display();
		c.show();
		
		B b = new B ();
		b.display();
		b.show();
		
		A a = new A();
		a.show();
				
		// TODO Auto-generated method stub

	}

}
