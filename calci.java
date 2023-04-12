
import java.util.*;
public class calci{
    public static void main(String[] args) {
	double Calci;
	long p= 1000000;
         int n = 10;
         float interestRate = 10.25f;
         
         float r = interestRate / (12 * 100);
         double emi = (p * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
         System.out.println("EMI: " + emi);
    }
    
}


