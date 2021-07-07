
	/*  DSA450 - 1) Reversing the given array */

package dsa450;

import java.util.Scanner;

public class ArrayReverse1 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter array size: ");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		
		for(int i=0;i<size;i++)
			{
			   array[i] = scan.nextInt();
			}
		System.out.println("reversed array: ");
		int array2[] = arrayReverse(array);
		
		for(int i=0;i<size;i++)
			{
			  System.out.print(array2[i]+" ");
			}
		
	}
	
	static int[] arrayReverse(int[] array)
	{
		
		int len = array.length;
		
		int array2[] = new int[len];
		for(int i=0;i<len;i++)
		{
			array2[i]= array[len-1-i];
		}
	
		return array2;
	}

}
