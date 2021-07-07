package dsa450;

		/* Move all negative element to one side of array  */

import java.util.Scanner;
public class Move_negative_element_5 {

	public static void main(String[] args) {
		
		System.out.print("enter size of array: ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] array = new int[size];
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = scan.nextInt();
		}
		int pos=0;
		for(int j=0;j<array.length;j++)
		{
			if(array[j]<0)
			{
				int temp = array[pos];
				array[pos]=array[j];
				array[j]=temp;
				pos++;
			}
		}
		for(int j=0;j<array.length;j++)
		{
			System.out.print(array[j]+" ,");
		}
	}

}
