package javaPrograms;

		/* Armstrong number */

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int assignNum=num;
		int rem,count=0;
		
		while(num!=0)
		{
			rem = num%10;
			num /= 10;
			count++;
		}
		
		int rem2,armNum=0;
		int newAss = assignNum;
		
		while(assignNum!=0)
		{
			rem2 = assignNum%10;
			assignNum /= 10;
			armNum += Math.pow(rem2, count);
		}
		if(armNum==newAss)
		{
			System.out.println("yes, it is Armstrong number.");
		}
		else
		{
			System.out.println("It is not an Armstrong number.");
		}
	}

}
