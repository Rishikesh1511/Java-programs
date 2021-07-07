package DSApractice;

/* find how many ways a in 2-D matrix 00 position reach to n,m position  */

import java.util.Scanner;

public class MatrixWays {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row and column: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int count = matWays(r,c);
		System.out.println("there are "+count+ " ways");
		
	}
	
	static int matWays(int r, int c)
	{
		if(r==1||c==1)
			return 1;
		else
			return matWays(r-1,c)+matWays(r,c-1);
			
	}

}
