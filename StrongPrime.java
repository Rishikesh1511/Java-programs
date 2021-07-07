package DSApractice;

	/*check how many strong number will occurs between two numbers*/

import java.util.Scanner;

public class StrongPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many no. you feed: ");
		int n = sc.nextInt();
		int[] arrStart = new int[n];
		int[] arrLast = new int[n];
		int i,j;
		for(i=0,j=0;i<n && j<n;i++,j++)
		{
			arrStart[i]=sc.nextInt();
			arrLast[j]=sc.nextInt();
			
		}
		for(i=0,j=0;i<n && j<n;i++,j++)
		{
			PrimeNo(arrStart[i],arrLast[j]); //function call
		}
	}
/*---- find prime number function ----*/
	static void PrimeNo(int start,int last)
	{
		int[] prime = new int[100];
		int countStrongPrime=0;
		int index=-1;
		for(int i=2;i<=100;i++)
		{
			int count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
		  if(count==2)
		   {
			  index++;
			  prime[index]=i;
		   }
		}
		for(int k=1;k<index+1;k++)
		{
			if(start<prime[k] || prime[k]<last)
			{
				if(prime[k]>(prime[k-1]+prime[k+1])/2)
				{
					countStrongPrime++;
				}
			}
			
		}
		System.out.println(countStrongPrime);
		System.out.println();
	}

}
