package Package1;

public class assignment3 {
	public int div(int a,int b) {
		int c;
		c=a/b;
		System.out.println("div result="+c);
		return c;
	}
	
	public int sub(int a1, int b1) {
		int c1;
		c1=a1-b1;
		System.out.println("sub result="+c1);
		return c1;
	}
	
	public int sum(int a2,int b2) {
		int c2;
		c2=a2+b2;
		System.out.println("sum result="+c2);
		return c2;
	}
	
	public void mul(int a3, int b3) {
		int c3;
		c3=a3*b3;
		System.out.println("final result="+c3);
	}
	public static void main(String[] args) {
		assignment3 deep=new assignment3();
		int divresult=deep.div(10,2);
		int c4=12*3;
		System.out.println("variable"+c4);
		int subresult1=deep.sub(divresult, 2);
		int sumresult=deep.sum(subresult1, 2);
		int subresult2=deep.sub(sumresult, 2);
		deep.mul(subresult2, 2);
	}

}
