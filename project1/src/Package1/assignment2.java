package Package1;

public class assignment2 
{
	public int sum(int a,int b)
	{ int c;
	c=a+b;
	System.out.println("sum result "+c);
	return c;
		
	}
	public int sub(int a1, int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("Sub result "+c1);
		return c1;
	}
	public int mul(int a2, int b2) {
		int c2;
		c2=a2*b2;
		System.out.println("mul result "+c2);
		return c2;
	}	
	public void div(int a3, int b3) {
		int c3;
		c3=a3/b3;
		System.out.println("Final result " + c3);
	}
	
	public static void main(String[] args) {
		assignment2 deep= new assignment2();
		int sumresult1=deep.sum(10, 2);
		int sumresult2=deep.sum(sumresult1, 2);
		int subresult=deep.sub(sumresult2, 2);
		int mulresult=deep.mul(subresult, 2);
		deep.div(mulresult, 2);
	}

}
