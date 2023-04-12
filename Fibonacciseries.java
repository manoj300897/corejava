import java.util.*;
public class Fibonacciseries{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int limit=sc.nextInt();
		
		int a=0,b=1,c=1;
		System.out.println(" "+a+" "+b);
		do{
			a=b;
			b=c;
			c=a+b;
		   if(c>limit){
					break;
					}	
				System.out.print(" "+c);
				}while(c<=limit);
}
}				
			