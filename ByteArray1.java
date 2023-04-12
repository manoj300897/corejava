import java.io.*;

public class  ByteArray1{
 	public static void main(String[] args)throws IOException{
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);
		System.out.println("Enter the values");
		while(bOutput.size()!=15){
				// Gets the inputs from the user
				bOutput.write(System.in.read());
				}

		byte b [] = bOutput.toByteArray();
		System.out.println("Enter the content");
		for(int x=0;x<b.length;x++){
			//printing the characters
			System.out.print((char) b[x] +"  ");
			}
		System.out.println(" ");

		int c;
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		System.out.println("converting characters to uppercase");
			for(int y=0;y<1;y++){
				while((c=bInput.read())!= -1){
				System.out.println(Character.toUpperCase((char)c));
				}
				bInput.reset();
}
}
}

	
	