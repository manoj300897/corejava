import java.util.*;
public class Pass{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your a mark");
	int a=sc.nextInt();
	System.out.println("enter your b mark");
	int b=sc.nextInt();
	if(a>=50&&b<=75){
		System.out.println("pass with distinction");
	}else{
		System.out.println("sorry you are not eligible");
	     }
	}
	}		