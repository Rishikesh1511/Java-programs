package javaPrograms;

import java.util.Scanner;
public class matrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		
		for(char j='A';j<i;j++)
		{
			System.out.println(j+",");
		}
		
	}

}
