package DSApractice;
 		/* find GCD without recursion function */
import java.util.Scanner;
public class GCDwithoutRecursion {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       int gcd=0;
       for(int i=2;i<=num1&&i<=num2;i++)
       {
    	   for(int j=i;j>1;j--)
    	   {
    		   if(num1%i==0 && num2%i==0)
    		   {
    			   gcd=i;
    		   }
    	   }
       }
       System.out.println(gcd);
	}

}
