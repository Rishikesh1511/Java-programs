package DSApractice;

	/* check string is palindrome or not */

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		boolean checkStr = checkPalindrome(str,0,len-1); 
		if(checkStr==true)
			System.out.println("string is palindrome");
		else
			System.out.println("string is not palindrome");
	}
	
	static boolean checkPalindrome(String str,int left,int right)
	{
		if(left >= right)
			return true;
		else if(str.charAt(left)!=str.charAt(right))
			return false;
		return checkPalindrome(str,left+1,right-1);
	}

}
