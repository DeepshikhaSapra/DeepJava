package session4;

public class child1 extends Inheri1

{public int child()
	{
	int b;
	b=123;
	System.out.println("int of child 1=" +b);
	return b;
	}
public void ch1()
{
	System.out.println("Method of Child 1");
}
public static void main(String[] args) {
	child1 obj=new child1();
	obj.a=13;
	System.out.println("int of patrent= " + obj.a);
	obj.child();
	obj.ch1();
	obj.parent1();
	obj.parent2();
		
}

}
