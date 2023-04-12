import java.util.Scanner;

public class Factorial5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int m1 = sc.nextInt();
        int x = 1;
        for (int i = 1; i <= m1; i++) 
	{
            x *=i;   //here,fact-factorial variable,*multiplying the value using fact,i=integer.
        }
        System.out.println("Factorial of"  +m1+  "is"  + x);
    }
}
