import java.util.*;

class ArrayReplace
{
    public static void main(String args[])
    {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of Array Size");
        int limit = sc.nextInt();
        int values[] = new int[limit];

        for(int i = 0; i < values.length; i++)
        {
            temp = temp + 1;
            System.out.println("Enter the Value for " + temp + " : ");
            values[i] = sc.nextInt();
        }

       for (int x: values)
        {
            System.out.print(" " + x + " ");
        }
	  System.out.println("Enter the number of Value you need to Replace");
        int replacePosition = sc.nextInt();

        for(int i = 0; i < values.length; i++)
        {
            if(values[i] == replacePosition)
            {
                System.out.println("Enter the Value to Replace : ");
                int replace = sc.nextInt();
                values[i] = replace;
            }
        }
	System.out.println("Altered Array :");
        for (int x: values)
        {
            System.out.print(" " + x + " ");
        }
        
    }
}