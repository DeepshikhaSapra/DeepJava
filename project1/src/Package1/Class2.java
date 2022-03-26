package Package1;

public class Class2 {
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum result is "+c);
		return c;
	}
	
public int sub(int c,int d)
{int e;
e=c-d;
System.out.println("sub result is "+e);
return e;
	}

public void mul(int f, int g)
{int h;
h=f*g;
System.out.println("multi result is "+h);
	}
public static void main(String[] args) 
{
	Class2 ds=new Class2();
	int sumresult=ds.sum(12, 2);
	int subresult=ds.sub(12,2);
	ds.mul(sumresult, subresult);
	
	
}
}
