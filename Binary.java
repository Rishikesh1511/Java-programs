package javaPrograms;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {

			int num=0,rem;
			int arr[] = new int[50];
			Scanner scan = new Scanner(System.in);
			
				num = scan.nextInt();
			
				int i=0;
			
			while(num!=0)
			{
				rem = num%2;
				num /= 2;
				arr[i]=rem;
				i++;
			}
			for(int j=i-1;j>=0;j--)
			{
				System.out.print(arr[j]);
			}
	}

}
