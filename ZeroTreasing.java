package DSApractice;

	/* find how many ending zeros in factorial */

import java.util.Scanner;

public class ZeroTreasing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res=0;
		for(int i =5;i<=n;i *=5)
		{
			res = res +n/i;
		}
		System.out.println("there are "+res+" zeroes at ending");
		
	}

}
