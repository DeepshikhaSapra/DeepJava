package session4;

public class childnew extends parent1 {
	public void p1(int a, int b)
	{ super.p1(2, 2);
		int c;
	c=a*b;
	System.out.println("result of a*b= " +c);
		
	}
	public static void main(String[] args) {
		childnew dee=new childnew();
		dee.p1(2, 3);
		dee.p2();
	}

}
