package DSApractice;

	/*Fibonacci series*/

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of digit for fibonacci series...");
		int last = sc.nextInt();
		
		int first=0;
		int next=1;
		System.out.print(first+" ");
		System.out.print(next+" ");
		for(int i=0;i<last-2;i++)
		{
			int series = first + next;
			System.out.print(series+" ");
			int temp = first;
			first = next;
			next = series;
			
		}

	}

}
