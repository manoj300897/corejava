import java.util.*;
class Name{
	float methodName1(){
	float a=100,b=12;
	float c=a*b;
	return c;
	}
	int methodName2(){	
	int a1=10,b1=12;
	int c1=a1+b1;
	return c1;
	}
	String methodName3(){
	String ch="10";
	String x="5";
	String i=ch.concat(x);
	return i;
	}
	char methodName4(){
	char c2='h';
	return c2;
	}
 public static void main(String[] args){
	Name m1= new Name();
	System.out.println(m1.methodName1());
	System.out.println(m1.methodName2());
	System.out.println(m1.methodName3());
	System.out.println(m1.methodName4());
}
}
		
	
	