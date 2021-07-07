package DSApractice;

	/* Josephus problem */

import java.util.Scanner;

public class JosephusProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter player and position: ");
		int player = sc.nextInt();
		int position = sc.nextInt();
		System.out.println(deathMatch(player,position)+" no. player is alive");
		
	}

	static int deathMatch(int n,int k)
	{
		if(n==1)
			return 0;
		return (deathMatch(n-1,k)+k)%n;
	}
}
