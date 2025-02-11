package OOPS;
class Student
{
	private String name;
	private int rollNo;
	private float percentage;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	public float getPercentage()
	{
		return percentage;
	}
	public void setPercentage(float percentage)
	{
		this.percentage = percentage;
	}
}
public class EncapsulationGetterSetterMethod {

	public static void main(String[] args) 
	{
		{
			Student s = new Student();
			s.setName("John");
			s.setRollNo(101);
			s.setPercentage(96.36f);
			
			System.out.println(s.getName()+"  "+s.getRollNo()+"  "+s.getPercentage());
		}
		// TODO Auto-generated method stub

	}

}
