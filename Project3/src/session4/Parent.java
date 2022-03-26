package session4;

public class Parent {
	int a=123;
	public void method1()
	{
		System.out.println("Parent Default Method");
	}
	public void method2(int a)
	{
		System.out.println("Parent one patameterized Method");
	}
	public void method3(int a1, int b1)
	{this.method4(2, 3, 1);
		this.method1();
		this.method2(3);
		System.out.println("Parent two parameterized Method");
	}
	public void method4(int a2, int b2,int b3)
	{
		System.out.println("Parent three parameterized method");
	}
}
