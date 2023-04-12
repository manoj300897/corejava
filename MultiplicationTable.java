import java.util.*;
class MultiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
        int number = input.nextInt();
	System.out.println("Multiplication of " + number + ":");
	for (int i = 1; i <= 20; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
