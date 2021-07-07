package DSApractice;

	/*  check it is prime or not */

import java.util.Scanner;

public class findprime {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("not prime");
		else
			System.out.println("prime no.");
	}

}
