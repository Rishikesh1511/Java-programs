package DSApractice;

	/* print the subsequence or powerset of string */

import java.util.Scanner;

public class StringPowerset {

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String curString=""; 
		powerSet(str,0,curString);
	}
	
	static void powerSet(String str,int index, String curr)
	{
		int len = str.length();
		if(index == len)
		{
			System.out.print(curr+",");
			return;
		}
		powerSet(str,index+1,curr+str.charAt(index));
		powerSet(str,index+1,curr);
	}
}
