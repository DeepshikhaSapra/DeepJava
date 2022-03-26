package session4;

public class New {
public void method1()
{ this.method4(12,1,32);
	System.out.println("default method");
	this.method2(1);
	this.method5(12, 33, 12, 90);
	this.method3(34, 43);
}
public void method2(int a)
{
	System.out.println("one parameterized method");
}
public void method3(int a, int b)
{
	System.out.println("two parameterized method");
}
public void method4(int a, int b,int c)
{
	System.out.println("three parametirized method");
}
public void method5(int a, int b, int c,int d)
{
	System.out.println("four parametrized method");
}
public static void main(String[] args) {
	New obj= new New();
	obj.method1();
}
}
