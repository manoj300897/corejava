import java.util.*;
class Secondlarge
{
    public static void main(String args[])
    {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter the limit of Array Size");
        int limit = sc.nextInt();
        int values[] = new int[limit];
	 for(int i = 0; i < values.length; i++)
        {
            temp = temp + 1;
            System.out.print("\tEnter the Value for " + temp + " : ");
            values[i] = sc.nextInt();
        }
       
	 int c;
   	 for(int i = 0; i < values.length; i++)
        {
            for (int j = i + 1; j < values.length; j++)
            {
                if (values[i] > values[j])   
                {  
                    c = values[i];
                    value[i] = value[j];  
                    value[j] = c;
                }  
            }
        }

        int SecondLarge = value[value.length-2];
        System.out.print("Second largest Number in Given Array is" + SecondLarge);
    }
}
