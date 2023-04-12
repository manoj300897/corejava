import java.util.*;
import java.lang.*;

class MinMaxArray
{
    public int min(int n[])
    {
        int min = n[0];
        for(int i=0; i<n.length; i++)
        {
            if(n[i]<min)
            {
                min = n[i];
            }
      }
        return min;
    }

    public int max(int n[])
    {
        int max = 0;
        for(int i=0; i<n.length; i++)
        {
            if(n[i]>max) 
            {
                max = n[i];
            }
        }
        return max;
	}

    public static void main(String args[])
    {
        int min, max;
	Scanner sc = new Scanner(System.in);
        MinMaxArray man = new MinMaxArray();
        System.out.println("\tEnter the limit of Array Size ");
        int limit = sc.nextInt();
        System.out.print("\n");
        int numbers[] = new int[limit];
	for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
        }
	min = man.min(numbers);
        max = man.max(numbers);
	System.out.println("\tMinimum Value in Given Array is : " + min);
        System.out.println("\tMaximum Value in Given Array is : " + max);
    }
}
