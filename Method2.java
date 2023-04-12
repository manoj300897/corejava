import java.util.*;
class fullstack
{
	void fullstack(int a,int b)
	{
	int c=a+b;
	System.out.println(c);
	}
	void fullstack(String x,String y)
	{
	String z=x+y;
	System.out.println(z);
	}
	void fullstack(float d,float e)
	{
	float f=d*e;
	System.out.println(f);
	}
}
class Method2
{
	public static void main(String []args)
	{
	fullstack m1 =new fullstack();
	m1.fullstack(55,85);
	m1.fullstack("45","65");
	m1.fullstack("45","5");
	}

}
