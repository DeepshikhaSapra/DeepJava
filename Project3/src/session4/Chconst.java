package session4;

public class Chconst extends Pconst {
public Chconst() {
	this (1,2);
	System.out.println("child default constructor");
}
public Chconst(int a) {
	this (9,7,2);
	System.out.println("child one parameterized constructor");
}
public Chconst(int b,int c) {
	this (1);
	System.out.println("child two parameterized constructor");
}
public Chconst(int d,int e, int f) {
	super(2);
	System.out.println("child three parameterized constructor");
}
public static void main(String[] args) {
	Chconst obj=new Chconst();
}
}
