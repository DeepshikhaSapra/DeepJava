package session4;

public class Pconst {
	public Pconst() {
		System.out.println("parent default constructor");
	}
	public Pconst(int a) {
		this(9,8,7);
		System.out.println("parent one parameterized constructor");
	}
	public Pconst(int a1, int b1) {
		this();
		System.out.println("parent two parameterised constructor");
	}
	public Pconst(int a2,int b2, int c2) {
		this(8,8);
		System.out.println("parent three parameterized constructor");
	}
}
