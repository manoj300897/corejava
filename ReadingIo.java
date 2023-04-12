import java.io.*;
class ReadingIo{
	public static void main(String[] args)throws IOException{
	String str;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("ENter lines of text");
	System.out.println("Enter the exit  to quit");
	try{
	do{
		str = br.readLine();
		System.out.println(str);
	}while(!str.equalsIgnoreCase("exit"));
}catch(Exception e){
	System.out.print("exit");
	}
}
}
