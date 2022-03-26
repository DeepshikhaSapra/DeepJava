package session4;

public class variable {
	int b;
	public void method1(int b)
	{
		this.b=b	;
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		variable abc=new variable();

		abc.method1(54);
		System.out.println(abc.b);
		int c;
		float f=67.5F;
		c=(int) f;
		System.out.println("value of c" +c);
		System.out.println("value of f" + f);
			
		
	}

}
