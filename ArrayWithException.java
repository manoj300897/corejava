import java.util.*;
public class ArrayWithException {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.print("Enter value for index " + i + ": ");
                arr[i] = input.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Array index out of bounds!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("An error occurred while entering values into the array.");
        } finally {
            input.close();
        }
        
        System.out.println("\nArray values are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }

}
