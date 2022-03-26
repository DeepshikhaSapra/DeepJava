package Package1;

public class class3 {
public class3() {
	this (1,2,3,4);
	System.out.println("Default constructor");
}

public class3(int a) {
	this (1,2,3);
	System.out.println("one parameterized");
}

public class3(int a, int b) {
	this ();
	System.out.println("two parameterized");
}
public class3(int a, int b, int c) {
	this (22,21);
	System.out.println("three parameterized");
}
public class3(int a,int b,int c,int d) {

	System.out.println("Sum result is "+c);
}
public static void main(String[] args) {
	class3 a1=new class3(21);
	
}
}
