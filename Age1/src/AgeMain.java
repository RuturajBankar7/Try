
class GrandFather
{
	private int age;
	public GrandFather(int age) {
		this.age=age;
		
	}
	public void showAge()
	{
		System.out.println("Grandfather age is :"+age);
	}
}

class Father extends GrandFather
{
	private int age;
	
	public Father(int age) {
		super(age +30);
		this.age=age;
	}
	
	public void showAge()
	{
		super.showAge();
		System.out.println("Father age is :"+age);
	}
}

class Son extends Father
{
	private int age;
	
	public Son(int age)
	{
		super(age+30);
		this.age=age;
	}
	
	public void showAge()
	{
		super.showAge();
		System.out.println("Son age is:"+age);
	}
}
public class AgeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son(20);
		s.showAge();
		

	}

}
