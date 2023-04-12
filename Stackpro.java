import java.util.*;
class Stackpro{
	public static void main(String[] args){
		Stack<String> stack = new Stack<>();
		stack.push("manoj");
		stack.push("harish");
		stack.push("arun");
		stack.pop();		//remove the last element
		stack.push("vimal");
		stack.push("mandai");
		stack.pop();		//remove the last element
	
System.out.println("stack elements");
for(String str:stack)
	System.out.println(str);
	System.out.println(stack.peek());
	}
}