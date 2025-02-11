package OOPS;
public class MethodOverloadingExample //if the class has multiple methods but different parameters it is knon as method overloading
{
	void add(int i , int j)
	{
		int sum = i+j;
		System.out.println(sum);
	}
	void add(int i, int j ,int k)
	{
		int sum = i+j+k;
		System.out.println(sum);
	}
	void add(float f, float g, float h)
	{
		float sum = f+g+h;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		MethodOverloadingExample obj = new MethodOverloadingExample();
		obj.add(25.32f, 45.21f, 36.21f);
		obj.add(21, 32);
		obj.add(21, 23, 24);
	}




	}


