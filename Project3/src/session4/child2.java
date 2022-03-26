package session4;

public class child2 extends child1
{ public child2() {
	System.out.println("constructor child 2");
}
public static void main(String[] args) {
	child2 abc=new child2();
	abc.parent1();
	abc.parent2();
	abc.a=12;
	System.out.println("int of parent" + abc.a);
	abc.child();
	
		
}
}
