package OOPS;
interface Parent1
{
	void show();
}
interface Parent2
{
	void show();
}
public class MultipleInheritanceExample implements Parent1,Parent2
{
	public void show()
	{
		System.out.println("Methods in both parents are defined inside child class");
	}
	public static void main(String[] args) 
	{
		MultipleInheritanceExample obj = new MultipleInheritanceExample();
		obj.show();
	}



	
	}


