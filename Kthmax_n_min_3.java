package dsa450;

		/* Find the "Kth" max and min element of an array  */
import java.util.Scanner;
public class Kthmax_n_min_3 {

	public static void main(String[] args) {
		
		System.out.print("enter size of array: ");
		Scanner scan = new Scanner(System.in);
		int arr_len = scan.nextInt();
		int[] array = new int[arr_len];
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = scan.nextInt();
		}
		//enter kth position
		System.out.print("enter kth position: ");
		int position = scan.nextInt();
		
		for(int j=0;j<array.length;j++)
		{
			for(int k=0;k<array.length;k++)
			{
				//sorting into descending order
				if(array[j]>array[k])
				{
					int temp = array[j];
					array[j] = array[k];
					array[k] = temp;
				}
			}
		}
		
		//print kth max and min value
		System.out.println("Kth max value is "+array[position-1]+" and min value is "+array[array.length-position]);
	}

}
