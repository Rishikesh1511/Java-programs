package DSApractice;

	/* check year is leap year or not */

import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
	
		 boolean leap = isLeapYear(year);
		if(leap)
			System.out.println("leap year");
		else
			System.out.println("not a leap year");
	}

	static  boolean isLeapYear(int year)
	{
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
