package javaPrograms;
		
		/* print prime series till n */

import java.util.Scanner;
public class PrimeSeries {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=2;i<=n;i++)
		{int count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
			
		}
	}

}
