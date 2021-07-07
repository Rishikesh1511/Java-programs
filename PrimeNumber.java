package DSApractice;

	/* Sieve of Eratosthenes - find prime number till n */

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		isPrime(n);
	}

	static void isPrime(int n)
	{
		boolean prime[] = new boolean[n+1];
		for(int i=2;i<=n;i++)
		{if(prime[i]==false){
			for(int j=i*i;j<=n;j += i)
			{
				prime[j] = true;
			}
		}
		}
		for(int i=2;i<=n;i++)
		{
			if(prime[i]==false)
				System.out.print(" "+i);
		}
	}

}
