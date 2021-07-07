package javaPrograms;

		/* check strong number */

import java.util.Scanner;
public class StrongNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int newNum = num;
		int retNum = factorial(num);
		if(num==0)
		{
			System.out.println("you entered 0");
		}
		else if(newNum == retNum)
		{
			System.out.println("yes, num is strong number.");
		}
		else 
		{
			System.out.println("it is not a strong number.");
		}
	}
	static int factorial(int num)
	{
		
		int rem,fact=1,sum=0;
		while(num!=0)
		{
			rem = num%10;
			num /= 10;
			for(int i=rem;i>0;i--)
			{
				fact *= i;
			}
			sum += fact;
		}
		return sum;
	}

}
