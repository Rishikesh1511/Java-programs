
  /* DSA450 - 2) Max and Min value of an array */

package dsa450;

import java.util.Scanner;

public class ArrayMaxMin2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++)
		{
			array[i] = scan.nextInt();
		}
		
		for(int j=0;j<array.length;j++)
		{
			for(int k=0;k<array.length;k++)
				{
				   if(array[j]<array[k])
				   {
					   int temp = array[j];
					   array[j]=array[k];
					   array[k]=temp;
				   }
				}
		}
		System.out.println("Max value is "+array[size-1]+" and Min value is "+array[0]);
	}

}
