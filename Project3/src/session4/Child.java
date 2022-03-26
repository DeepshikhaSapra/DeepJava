package session4;

public class Child extends Parent {
	public void mth1()
	{
		System.out.println("Child Default Method");
	}
	public void mth2(int a)
	{
		System.out.println("Child one patameterized Method");
	}
	public void mth3(int a1, int b1)
	{ super.method3(56, 87);
		this.mth1();
		this.mth4(2,4,6);
	
		System.out.println("Child two parameterized Method");
	}
	public void mth4(int a2, int b2,int b3)
	{
		System.out.println("Child three parameterized method");
	}
public static void main(String[] args) {
	Child deep= new Child();
	deep.mth3(9,3);
	System.out.println(deep.a);
	
	
	
	
}
}
