import java.util.*;
public class Swittch{
	public static void main(String[] args)
	{
	Scanner mk=new Scanner(System.in);
	System.out.println("Enter your wish");
	int x=mk.nextInt();
	switch(x){
			case 1:
				System.out.println("k1");
				break;
			case 2:
				System.out.println("k2");
				break;
			case 3:
				System.out.println("k3");
				break;
			case 4:
				System.out.println("k4");
				break;
			case 5:
				System.out.println("k5");
				break;
			default:
				System.out.println("k1 k2 k3 k4 k5");
			}
}
}