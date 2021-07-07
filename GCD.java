package DSApractice;

	/* find GCD of two number */

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
    System.out.println("GCD is "+gcdNum(a,b));
	}

	static int gcdNum(int a, int b)
	{
		if(b==0)
			return a;
		else
			return gcdNum(b,a%b);
	}
}
