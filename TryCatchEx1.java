public class TryCatchEx1{
	public static void main(String[] args){
	System.out.println("11");
	System.out.println("before divide");
	try{
		int x=1/0;
		System.out.println("After divide");
	   }
	catch(ArithmeticException ae)
	{
	 	System.out.println("A number cannot be divide by zero");
	}
	
	finally{
		System.out.println("final statement");
	}
}
//System.out.println("22");
}
