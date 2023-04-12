import java.util.*;
public class Calculator{
	public static void main(String[] args){
	
	char man;
	Double num1,num2,res;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("choose the operator: +,-,*,/");
	man=sc.next().charAt(0);
	
	System.out.println("Enter the 1st number");
	num1=sc.nextDouble();
	System.out.println("Enter the 2nd number");
	num2=sc.nextDouble();
	
	switch(man){
		case '+':
			res = num1 + num2;
			System.out.println(num1+ "+" +num2 +"=" +res);
			break;
		case '-':
			res = num1 - num2;
			System.out.println(num1+ "-" +num2 +"=" +res);
			break;
		case '*':
			res = num1 * num2;
			System.out.println(num1+ "*" +num2 +"=" +res);
			break;
		case '/':
			res = num1 / num2;
			System.out.println(num1+ "*" +num2+ "=" +res);
			break;
		default:
			System.out.println("invalid operator");
			break;
			}
}
}